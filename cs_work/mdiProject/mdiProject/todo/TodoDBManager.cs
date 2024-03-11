using mdiProject.database;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace mdiProject.todo
{
    public class TodoDBManager
    {
        public bool insert(Todo todo)
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();
                string sql = "INSERT INTO TODO (IDX, USERS_IDX, TITLE, CONTENT, FINISHDATE) VALUES (todoIdx.nextval, :useridx, :title, :content, :finishdate)";
                OracleCommand cmd = new OracleCommand(sql, conn);
                cmd.Parameters.Add(":useridx", todo.user_idx);
                cmd.Parameters.Add(":title", todo.title);
                cmd.Parameters.Add(":content", todo.content);
                cmd.Parameters.Add(":finishdate", todo.finishdate);
                cmd.ExecuteNonQuery();

                DBINFO.closeConnect();
                return true;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
                return false;
            }
        }

        public bool update(string idx)
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();
                string sql = "UPDATE todo SET status = 'C' WHERE idx =  :idx";
                OracleCommand cmd = new OracleCommand(sql, conn);
                cmd.Parameters.Add(":idx", idx);
                cmd.ExecuteNonQuery();

                DBINFO.closeConnect();
                return true;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
                return false;
            }
        }

        public void delete(Todo todo)
        {
        }

        public DataTable select(string status="")
        {
            string sql = "";
            try
            {
                OracleConnection conn = DBINFO.openConnect();
                if (status.Equals("C"))
                {
                    sql = "SELECT * FROM todo t JOIN users u ON t.users_idx = u.idx WHERE t.status = 'C' ORDER BY t.idx DESC";
                }
                else
                {
                    sql = "SELECT * FROM todo t JOIN users u ON t.users_idx = u.idx WHERE t.status IS NULL ORDER BY t.idx DESC";
                }

                OracleDataAdapter adapter = new OracleDataAdapter();
                DataSet ds = new DataSet();

                OracleCommand oracleCommand = new OracleCommand(sql, conn);
                adapter.SelectCommand = oracleCommand;

                adapter.Fill(ds);

                DBINFO.closeConnect();
                return ds.Tables[0];
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
                return null;
            }
            
        }
    }
}

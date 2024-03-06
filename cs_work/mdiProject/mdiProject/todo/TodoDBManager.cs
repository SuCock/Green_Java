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

        public void update(Todo todo)
        {
        }

        public void delete(Todo todo)
        {
        }

        public DataTable select()
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();

                string sql = "select * from todo order by finishdate desc";

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

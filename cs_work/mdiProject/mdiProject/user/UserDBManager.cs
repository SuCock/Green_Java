using mdiProject.database;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace mdiProject.user
{
    public class UserDBManager
    {
        public UserDBManager() { }

        public bool insert(Users users)
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();
                string sql = "INSERT INTO users (idx, email, addr, password, name) VALUES (usersIdx.NEXTVAL, :email, :addr, :password, :name)";
                OracleCommand cmd = new OracleCommand(sql, conn);
                cmd.Parameters.Add(":email", users.Email);
                cmd.Parameters.Add(":addr", users.Addr);
                cmd.Parameters.Add(":password", users.Password);
                cmd.Parameters.Add(":name", users.Name);
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

        public void update(Users users)
        {
        }

        public void delete(Users users)
        {
        }

        public DataTable select()
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();

                string sql = "SELECT * FROM users";

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

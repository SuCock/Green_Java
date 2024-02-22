using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data.SqlTypes;

namespace ex240220.database
{
    public class FILETBDataBase
    {
        private static string constr = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";

        private static OracleConnection con = null;

        public static OracleConnection connect()
        {
            if(con == null)
            {
                con = new OracleConnection(constr);
                con.Open();
            }
            else
            {
                con.Open(); 
            }
            return con;
        
        }

        public void insert(string text)
        {
            OracleConnection con = connect();

            string sql = @"INSERT INTO filetb VALUES (:value1)";
            using(OracleCommand cmd = new OracleCommand(sql, con)) {
                cmd.Parameters.Add(":value1", text); // 이렇게 적거나 쿼리무에 @를 넣고 {}를 이용해 쿼리문에 직접 넣을수도 있다
                int rowId = cmd.ExecuteNonQuery();
                Console.WriteLine($"{rowId}행을 삽입했습니다");
            }

            con.Close();
        }

        public List<string> read()
        {
            List<string> list = new List<string>();
            OracleConnection con = connect();

            string sql = "SELECT * FROM filetb";
            using (OracleCommand cmd = new OracleCommand(sql, con))
            {
                OracleDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    list.Add(reader["str"].ToString());
                }
              
            }

            con.Close();

            return list;
        }

        public void update(string org, string dst)
        {
            string constr = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";

            OracleConnection con = new OracleConnection(constr);

            con.Open();
            OracleCommand oracleCommand = new OracleCommand($"UPDATE filetb SET str = '{dst}' WHERE str = '{org}'", con);
            oracleCommand.ExecuteNonQuery();// 실행
            con.Close();

        }
    }
}

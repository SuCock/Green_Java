using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice.SRDatabase
{
    public class DBManager
    {
        string strConnection = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=bono;Password=bono;";
        public void select(ComboBox comboBox)
        {
            OracleConnection conn = new OracleConnection(strConnection);
            conn.Open();
            OracleCommand cmd = new OracleCommand($"SELECT group_detail_name FROM group_detail WHERE GROUP_NO = 'RC'", conn);
            OracleDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                comboBox.Items.Add(reader.GetString(0));
            }

            reader.Close();
            conn.Close();
        }
    }
}

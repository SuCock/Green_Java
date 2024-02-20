using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice.Database
{
    public class DBManager
    {
        string strConnection = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=bono;Password=bono;";

        public void select(Label label9, Label label10, Label label11, Label label12, ComboBox comboBox1, ComboBox comboBox2)
        {
            OracleConnection conn = new OracleConnection(strConnection);
            conn.Open();

            // 아이디 자동조회
            OracleCommand cmd = new OracleCommand($"SELECT ID FROM member WHERE ID = 'test'", conn);
            OracleDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                label9.Text = reader.GetString(0);
            }

            // 단어코드 자동조회
            cmd = new OracleCommand($"SELECT word_no FROM word WHERE word_no = 'ELF014'", conn);
            reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                label10.Text = reader.GetString(0);
            }


            // 단어명 자동조회
            cmd = new OracleCommand($"SELECT word FROM word WHERE word_no = 'ELF014'", conn);
            reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                label11.Text = reader.GetString(0);
            }


            // 요청일 자동조회
            DateTime nowDate = DateTime.Now;
            string rqDate = DateTime.Now.ToString("yyyy-MM-dd");
            label12.Text = rqDate;

            // 처리구분 콤보박스 조회 RQ
            cmd = new OracleCommand($"SELECT group_detail_name FROM group_detail WHERE GROUP_NO = 'RQ'", conn);
            reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                comboBox1.Items.Add(reader.GetString(0));
            }

            // 요청구분 콤보박스 조회 RC
            cmd = new OracleCommand($"SELECT group_detail_name FROM group_detail WHERE GROUP_NO = 'RC'", conn);
            reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                comboBox2.Items.Add(reader.GetString(0));
            }

            reader.Close();
            conn.Close();
        }

        public void insert()
        {
            // 관리자한테 수정이나 삭제 요청하기
            // 요청코드, 아이디, 단어코드, 처리구분, 요청구분, 요청내용, 편입요청일(sysdate)

        }
    }
}

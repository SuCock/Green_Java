using Oracle.ManagedDataAccess.Client;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        List<AA> AAList = new List<AA>();

        string connectionString = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";


        public Form1()
        {
            InitializeComponent(); // 화면그리는 함수
            Select();
            MakeLabels();
        }

        public void MakeLabels()
        {
            int y = 10;
            foreach (AA aa in AAList)
            {
                label1 = new Label();
                label1.AutoSize = true;
                label1.Location = new Point(10, y);
                label1.Name = "label1";
                label1.Size = new Size(39, 15);
                label1.TabIndex = 0;
                label1.Text = aa.Name;
                label1.Font = new Font("배달의민족 도현", 14.2499981F, FontStyle.Bold);
                Controls.Add(label1);

                label2 = new Label();
                label2.AutoSize = true;
                label2.Location = new Point(100, y);
                label2.Name = "label1";
                label2.Size = new Size(39, 15);
                label2.TabIndex = 1;
                label2.Text = aa.Cnt + "";
                label2.Font = new Font("배달의민족 도현", 14.2499981F, FontStyle.Bold);
                Controls.Add(label2);
                y += 40;
            }


        }

        public void Select()
        {
            AAList.Clear(); // 리스트 안에 있는 내용들을 비우기
            OracleConnection conn = new OracleConnection(connectionString);
            conn.Open();

            string sql = "SELECT * FROM AA";
            OracleCommand cmd = new OracleCommand(sql, conn);
            OracleDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                AAList.Add(new AA() { Name = reader.GetString(0), Cnt = reader.GetDouble(1) });

            }
            reader.Close();
            conn.Close();
        }
    }

    class AA
    {

        public string Name { get; set; }
        public double Cnt { get; set; }

    }
}

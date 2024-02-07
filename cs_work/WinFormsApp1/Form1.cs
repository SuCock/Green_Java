// import와 같은 역할 
using Oracle.ManagedDataAccess.Client;
using System.Data;

// namespace는 여러개의 클래스를 정의해준다.
namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        string strConnection = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.0.38)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";

        // connection
        OracleConnection conn;
        // pstmt
        OracleCommand cmd;

        public Form1()
        {
            InitializeComponent();

            // 주석 처리 단축기 ctrl + k + c
            // mbox tab tab
            //MessageBox.Show(strConnection);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try {
                conn = new OracleConnection(strConnection);

                //cmd = new OracleCommand();
                //cmd.Connection = conn;

                conn.Open(); // database 열기

                DataSet dataSet = new DataSet();
                String sql = "SELECT * FROM emp";

                OracleDataAdapter adapter = new OracleDataAdapter(); // 어댑터를 가지고 connention을 제어한다 -> close를 안해도된다.
                adapter.SelectCommand = new OracleCommand(sql, conn); // sql의 쿼리문과 conn 오라클과 연결하는 걸 넘겨라
                adapter.Fill(dataSet); // datdaSet을 채워라

                dataGridView1.DataSource = dataSet.Tables[0]; // GridView에 데이터를 넣어라
                

                conn.Close(); // database 닫기
            }
            catch (Exception ex) {
                Console.WriteLine(ex.ToString());
            }
            //MessageBox.Show("Test" + strConnection);
        }
        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}

// import�� ���� ���� 
using Oracle.ManagedDataAccess.Client;
using System.Data;

// namespace�� �������� Ŭ������ �������ش�.
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

            // �ּ� ó�� ����� ctrl + k + c
            // mbox tab tab
            //MessageBox.Show(strConnection);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try {
                conn = new OracleConnection(strConnection);

                //cmd = new OracleCommand();
                //cmd.Connection = conn;

                conn.Open(); // database ����

                DataSet dataSet = new DataSet();
                String sql = "SELECT * FROM emp";

                OracleDataAdapter adapter = new OracleDataAdapter(); // ����͸� ������ connention�� �����Ѵ� -> close�� ���ص��ȴ�.
                adapter.SelectCommand = new OracleCommand(sql, conn); // sql�� �������� conn ����Ŭ�� �����ϴ� �� �Ѱܶ�
                adapter.Fill(dataSet); // datdaSet�� ä����

                dataGridView1.DataSource = dataSet.Tables[0]; // GridView�� �����͸� �־��
                

                conn.Close(); // database �ݱ�
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

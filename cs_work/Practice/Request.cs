using Oracle.ManagedDataAccess.Client;
using Practice.Database;
using System.Diagnostics;

namespace Practice
{
    public partial class Request : Form
    {
        DBManager db = new DBManager();

        public Request(String word)
        {
            InitializeComponent();

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // ���̵�� �ܾ��ڵ� �����;��Ѵ�
            // ���⼭ �� ��ȸ�Ѵ�.
            db.select(label9, label10, label11, label12, comboBox1, comboBox2);
        }


        private void button1_Click(object sender, EventArgs e)
        {
            // �����͵��� insert�ȴ�.
            // ���̵� - labe9, �ܾ��ڵ� - label10, �ܾ�� - label11, ó������ - comboBox1
            // , ��û���� - comboBox2, ��û���� - textBox1
            db.insert(label9, label10, comboBox1, comboBox2, textBox1);

        }
    }
}

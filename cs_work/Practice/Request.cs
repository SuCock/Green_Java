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

            // ���̵�� �ܾ��ڵ� �����;��Ѵ�
            // ���⼭ �� ��ȸ�Ѵ�.
            Console.WriteLine(word);
            db.select(label9, label10, label11, label12, comboBox1, comboBox2, word);

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

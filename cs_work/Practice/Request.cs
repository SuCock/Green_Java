using Oracle.ManagedDataAccess.Client;
using Practice.Database;
using System.Diagnostics;

namespace Practice
{
    public partial class Request : Form
    {
        DBManager db = new DBManager();

        public Request()
        {
            InitializeComponent();

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {
            // user �ڵ��Է�

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // ���̵�� �ܾ��ڵ� �����;��Ѵ�
            // ���⼭ �� ��ȸ�Ѵ�.
            db.select(label9, label10, label11, label12, comboBox1, comboBox2);
        }

        private void label10_Click(object sender, EventArgs e)
        {
            // �ܾ��ڵ� �ڵ��Է�
        }

        private void label11_Click(object sender, EventArgs e)
        {
            // �ܾ�� �ڵ��Է�
        }

        private void label12_Click(object sender, EventArgs e)
        {
            // ��û�� �ڵ��Է�
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            // ó������ ����Ʈ�ڽ�
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            // ��û���� ����Ʈ�ڽ�
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            // ��û����

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

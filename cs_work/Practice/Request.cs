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
            // user 자동입력

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // 아이디랑 단어코드 가져와야한다
            // 여기서 다 조회한다.
            db.select(label9, label10, label11, label12, comboBox1, comboBox2);
        }

        private void label10_Click(object sender, EventArgs e)
        {
            // 단어코드 자동입력
        }

        private void label11_Click(object sender, EventArgs e)
        {
            // 단어명 자동입력
        }

        private void label12_Click(object sender, EventArgs e)
        {
            // 요청일 자동입력
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            // 처리구분 셀렉트박스
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            // 요청구분 셀렉트박스
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            // 요청내용

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // 데이터들이 insert된다.
            // 아이디 - labe9, 단어코드 - label10, 단어명 - label11, 처리구분 - comboBox1
            // , 요청구분 - comboBox2, 요청내용 - textBox1
            db.insert(label9, label10, comboBox1, comboBox2, textBox1);

        }
    }
}

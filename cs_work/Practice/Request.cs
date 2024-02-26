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

            // 아이디랑 단어코드 가져와야한다
            // 여기서 다 조회한다.
            Console.WriteLine(word);
            db.select(label9, label10, label11, label12, comboBox1, comboBox2, word);

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

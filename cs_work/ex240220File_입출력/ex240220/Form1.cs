using ex240220.database;
using ex240220.file;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex240220
{
    public partial class Form1 : Form
    {
        FileContorl fc = new FileContorl();

        FILETBDataBase ftdb = new FILETBDataBase();

        private string selectString = "";

        //List<string> list = new List<string>();
        public Form1()
        {
            InitializeComponent();
            textBox1.Text = null;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // 불러오기
            //List<string> list = fc.read();
            List<string> list = ftdb.read();
            listBox1.DataSource = null;
            listBox1.DataSource = list;

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // 파일쓰기
            // 빈공백을 넣으면 함수종료
            if (textBox1.Text == ""){
                MessageBox.Show("글자를 입력하세요");
                return;
            }
            //list.Add(textBox1.Text);
           // fc.write(textBox1.Text, list);

            ftdb.insert(textBox1.Text); // insert 하는거
            // 입력 후 조회
            List<string> list2 = ftdb.read(); // select 하는거

            // null로 한번 치환해야지 들어가진다
            listBox1.DataSource = null;
            listBox1.DataSource = list2; // 화면내용 보여주기
            textBox1.Text = ""; // testBox의 글자도 깨끗하게
            //listBox1.Items.Add("추가");
        }

        private void 수정하기(object sender, EventArgs e)
        {
            if(textBox1.Text == "")
            {
                MessageBox.Show("글자를 입력하세요...");
                return;
            }

            string updateStr = textBox1.Text;

            ftdb.update(selectString ,updateStr);// 수정할 내용, 수정한 내용

            
            MessageBox.Show("수정완료");
            // select 버튼 이벤트 발생
            button1.PerformClick();
        }

        private void 삭제하기(object sender, EventArgs e)
        {
            string constr = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";

            OracleConnection con = new OracleConnection(constr);

            con.Open();
            OracleCommand oracleCommand = new OracleCommand($"DELETE FROM filetb WHERE str = '{textBox1.Text}'", con);
            oracleCommand.ExecuteNonQuery();// 실행
            con.Close();

            MessageBox.Show("삭제");
            button1.PerformClick();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            Console.WriteLine(listBox1.SelectedIndex);
            Console.WriteLine(listBox1.SelectedItem);

            if(listBox1.SelectedItem != null) { 
                textBox1.Text = listBox1.SelectedItem.ToString();
                selectString = listBox1.SelectedItem.ToString();
                MessageBox.Show("글자 수정하고 싶은거 바꿨네?" + selectString);
            }
        }
    }
}

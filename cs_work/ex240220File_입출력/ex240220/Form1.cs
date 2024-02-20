using ex240220.database;
using ex240220.file;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex240220
{
    public partial class Form1 : Form
    {
        FileContorl fc = new FileContorl();

        FILETBDataBase ftdb = new FILETBDataBase();

        List<string> list = new List<string>();
        public Form1()
        {
            InitializeComponent();
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
            list.Add(textBox1.Text);
           // fc.write(textBox1.Text, list);

            ftdb.insert(textBox1.Text);
            List<string> list2 = ftdb.read();

            // null로 한번 치환해야지 들어가진다
            listBox1.DataSource = null;
            listBox1.DataSource = list;
            textBox1.Text = "";
            //listBox1.Items.Add("추가");
        }
    }
}

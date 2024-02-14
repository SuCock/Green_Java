using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WinFormsApp7.memeber;

namespace WinFormsApp7
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine(textBox1.Text);
            Console.WriteLine(textBox2.Text);

            if(textBox1.Text == "admin" && textBox2.Text == "1234")
            {
                MessageBox.Show("로그인 성공");
                Hide();
                Console.WriteLine("로그인 성공");
                MainForm mf = new MainForm(textBox1.Text, textBox2.Text);
                mf.ShowDialog();
                Show();
            }
            else
            {
                MessageBox.Show("아이디와 비밀번호를 확인하세요");
                Console.WriteLine("아이디와 비밀번호를 확인하세요");
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsApp7.memeber
{
    public partial class MainForm : Form
    {
        public MainForm(string id, string password)
        {
            InitializeComponent();

            label1.Text = id;
            label2.Text = password;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void MainForm_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // usreContorl를 도구처럼 넣어서 누르면 맨 앞으로 둘 수 있다.
            userControl11.BringToFront();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            userControl21.BringToFront();
        }

        private void userControl21_Load(object sender, EventArgs e)
        {

        }
    }
}

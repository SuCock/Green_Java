using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LabelAddDelButton
{
    public partial class Form1 : Form
    {
        List<int> ints = new List<int>();
        Random ran =new Random();
        public Form1()
        {
            InitializeComponent();
            addButton();
            setLabelList();

            
        }

        private void Button_Click1(object sender, EventArgs e)
        {
            MessageBox.Show("Test");
        }

        private void Button_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            //MessageBox.Show("Test" + btn.Text);
            int temp = int.Parse(btn.Text);
            ints.Add(temp);
            setLabelList();
        }

        private void addButton()
        {
            for (int i = 0; i < 5; i++)
            {   
                string randomStr = ran.Next(100).ToString();
                // 추가하는 버튼
                Button button = new Button();
                button.Text = randomStr;
                button.Location = new Point(80 + (i * 100), 205);
                button.AutoSize = true;
                button.Click += Button_Click;
                Controls.Add(button);

                // 삭제하는 버튼
                Button button1 = new Button();
                button1.Text = randomStr;
                button1.Location = new Point(80 + (i * 100), 335);
                button1.AutoSize = true;
                button1.Click += button1_Click;
                Controls.Add(button1);
            }
        }

        private void setLabelList()
        {
            string result = "";
            for (int i = 0; i < ints.Count; i++)
            {
                if (ints.Count != (i + 1))
                {
                    result = result + (ints[i] + ", ");
                }
                else
                {
                    result = result + (ints[i]);
                }
            }
            label2.Text = result;
        }

        // 폼이 나오는 순간 실행되는 함수 
        private void Form1_Load(object sender, EventArgs e)
        {
            //MessageBox.Show("Test");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // 호출한 값 = sender, 마우스를 누르는 등의 이벤트 = e
            // sender는 object이니깐 Text를 쓸려면 Button으로 형변환을 해줘야한다.
            Button temp = sender as Button;
            int itemp = int.Parse(temp.Text);
            ints.Remove(itemp);
            setLabelList();
        }

        //private void button1_Click(object sender, EventArgs e)
        //{
        //    Message
        //}
    }
}

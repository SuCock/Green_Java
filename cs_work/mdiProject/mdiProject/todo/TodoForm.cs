using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace mdiProject.todo
{
    public partial class TodoForm : Form
    {
        private static TodoForm instance; 
        private TodoDBManager dbManager = new TodoDBManager();
        public static TodoForm getInstance()
        {
            if (instance == null || instance.IsDisposed)
            {
                instance = new TodoForm();
                return instance;
            }
            else
            {
                return instance;
            }
        }
        public TodoForm()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<string>()
            {
                "1", "2", "3", "4", "5"
            };
            comboBox1.SelectedText = "1";

            Label title_lb = new Label();
            title_lb.Text = "title";
            title_lb.AutoSize = true;

            Panel resevPanel = new Panel();
            resevPanel.BackColor = Color.White;
            resevPanel.Size = new Size(200, 100);

            resevPanel.Controls.Add(title_lb);
            panel1.Controls.Add(resevPanel);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            bool result = dbManager.insert(new Todo()
            {
                user_idx = int.Parse(comboBox1.Text),
                title = textBox1.Text,
                content = textBox2.Text,
                finishdate = dateTimePicker1.Value
            });

            if (result)
            {
                MessageBox.Show("입력 성공했습니다");
                textBox1.Clear();
                textBox2.Clear();
            }
        }
    }
}

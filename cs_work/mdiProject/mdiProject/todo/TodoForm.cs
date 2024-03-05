using mdiProject.todo;
using OracleInternal.SqlAndPlsqlParser.RuleProcessors;
using System;
using System.Collections.Generic;
using System.Data;
using System.Drawing;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

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

            //this.panel5.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));

            DataTable dataTable = dbManager.select();

            int y = 90;
            int evenOdd = 1;
            foreach (DataRow row in dataTable.Rows)
            {
                Console.WriteLine("row[idx] = " + row["idx"]);
                Console.WriteLine(row["title"]);
                Console.WriteLine(row["content"]);
                Console.WriteLine(row["finishdate"]);

                int idx = int.Parse(row["idx"].ToString());
                string title = row["title"].ToString();
                string content = row["content"].ToString();

                DateTime finishdate = new DateTime(
                                        int.Parse(row["finishdate"].ToString().Split('-', ' ')[0]) // 년도
                                        , int.Parse(row["finishdate"].ToString().Split('-', ' ')[1]) // 월
                                        , int.Parse(row["finishdate"].ToString().Split('-', ' ')[2]) // 일
                                        );
                //Console.WriteLine(finishdate.ToString("yyyy/MM/dd")); // 이방법을 쓰면 바로 date를 원하는 포맷으로 쓸 수 있다.



                Todo todo = new Todo();

                todo.idx = idx;
                todo.title = title;
                todo.content = content;
                todo.finishdate = finishdate;

                makeTodoPanel(10, y, todo, evenOdd % 2);
                evenOdd += 1;
                y += 230;
            }
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
        private void makeTodoPanel(int panelX, int panelY, Todo todo, int evenOdd)
        {
            #region 패널화면 구현

            Label content_lb;
            Label title_lb;
            Label finishDate_lb;
            CheckBox compete_chekbox;
            Label finishDate_lb_value;
            Label content_lb_value;
            Label title_lb_value;

            compete_chekbox = new CheckBox();
            finishDate_lb_value = new Label();
            content_lb_value = new Label();
            title_lb_value = new Label();
            finishDate_lb = new Label();
            content_lb = new Label();
            title_lb = new Label();
            //
            // compete_chekbox
            // 
            compete_chekbox.AutoSize = true;
            compete_chekbox.Location = new Point(197, 122);
            compete_chekbox.Name = "compete_chekbox";
            compete_chekbox.Size = new Size(48, 16);
            compete_chekbox.TabIndex = 17;
            compete_chekbox.Text = "완료";
            compete_chekbox.UseVisualStyleBackColor = true;
            // 
            // finishDate_lb_value
            // 
            finishDate_lb_value.AutoSize = true;
            finishDate_lb_value.Font = new Font("굴림", 12F, FontStyle.Regular, GraphicsUnit.Point, ((byte)(129)));
            finishDate_lb_value.Location = new Point(166, 96);
            finishDate_lb_value.Name = "finishDate_lb_value";
            finishDate_lb_value.Size = new Size(82, 16);
            finishDate_lb_value.TabIndex = 16;
            finishDate_lb_value.Text = todo.finishdate.ToString("yyyy/MM/dd");
            // 
            // content_lb_value
            // 
            content_lb_value.AutoSize = true;
            content_lb_value.Font = new Font("굴림", 12F, FontStyle.Regular, GraphicsUnit.Point, ((byte)(129)));
            content_lb_value.Location = new Point(12, 61);
            content_lb_value.Name = "content_lb_value";
            content_lb_value.Size = new Size(65, 16);
            content_lb_value.TabIndex = 15;
            content_lb_value.Text = todo.content;

            // title_lb_value
            // 
            title_lb_value.AutoSize = true;
            title_lb_value.Font = new Font("굴림", 12F, FontStyle.Regular, GraphicsUnit.Point, ((byte)(129)));
            title_lb_value.Location = new Point(166, 20);
            title_lb_value.Name = "title_lb_value";
            title_lb_value.Size = new Size(36, 16);
            title_lb_value.TabIndex = 14;
            title_lb_value.Text = todo.title;
            // 
            // finishDate_lb
            // 
            finishDate_lb.AutoSize = true;
            finishDate_lb.Font = new Font("굴림", 14.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));
            finishDate_lb.Location = new Point(12, 96);
            finishDate_lb.Name = "finishDate_lb";
            finishDate_lb.Size = new Size(100, 19);
            finishDate_lb.TabIndex = 13;
            finishDate_lb.Text = "FinishDate";
            // 
            // content_lb
            // 
            content_lb.AutoSize = true;
            content_lb.Font = new Font("굴림", 14.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));
            content_lb.Location = new Point(12, 42);
            content_lb.Name = "content_lb";
            content_lb.Size = new Size(79, 19);
            content_lb.TabIndex = 12;
            content_lb.Text = "Content";
            // 
            // title_lb
            // 
            title_lb.AutoSize = true;
            title_lb.Font = new Font("굴림", 14.25F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));
            title_lb.Location = new Point(9, 20);
            title_lb.Name = "title_lb";
            title_lb.Size = new Size(45, 19);
            title_lb.TabIndex = 11;
            title_lb.Text = "Title";
            //
            // panel4
            // 
            Panel panel4 = new Panel();
            if(evenOdd % 2 == 0){
                panel4.BackColor = Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            }
            else
            {
                panel4.BackColor = Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            }
            panel4.Controls.Add(compete_chekbox);
            panel4.Controls.Add(finishDate_lb_value);
            panel4.Controls.Add(content_lb_value);
            panel4.Controls.Add(title_lb_value);
            panel4.Controls.Add(finishDate_lb);
            panel4.Controls.Add(content_lb);
            panel4.Controls.Add(title_lb);
            panel4.Location = new Point(panelX, panelY);
            panel4.Name = "panel4";
            panel4.Size = new Size(270, 220);
            panel4.TabIndex = 1;

            this.panel1.Controls.Add(panel4);
            // 
            #endregion
        }
    }
}

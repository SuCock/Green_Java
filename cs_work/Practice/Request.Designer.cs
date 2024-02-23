namespace Practice
{
    partial class Request
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            label5 = new Label();
            label6 = new Label();
            label7 = new Label();
            label8 = new Label();
            label9 = new Label();
            label10 = new Label();
            label11 = new Label();
            label12 = new Label();
            comboBox1 = new ComboBox();
            comboBox2 = new ComboBox();
            textBox1 = new TextBox();
            button1 = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(349, 30);
            label1.Name = "label1";
            label1.Size = new Size(55, 15);
            label1.TabIndex = 0;
            label1.Text = "편집요청";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(284, 99);
            label2.Name = "label2";
            label2.Size = new Size(43, 15);
            label2.TabIndex = 1;
            label2.Text = "아이디";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(284, 129);
            label3.Name = "label3";
            label3.Size = new Size(55, 15);
            label3.TabIndex = 2;
            label3.Text = "단어코드";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(284, 156);
            label4.Name = "label4";
            label4.Size = new Size(43, 15);
            label4.TabIndex = 3;
            label4.Text = "단어명";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(284, 180);
            label5.Name = "label5";
            label5.Size = new Size(55, 15);
            label5.TabIndex = 4;
            label5.Text = "처리구분";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(284, 206);
            label6.Name = "label6";
            label6.Size = new Size(55, 15);
            label6.TabIndex = 5;
            label6.Text = "요청구분";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(284, 239);
            label7.Name = "label7";
            label7.Size = new Size(55, 15);
            label7.TabIndex = 6;
            label7.Text = "요청내용";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(284, 269);
            label8.Name = "label8";
            label8.Size = new Size(67, 15);
            label8.TabIndex = 7;
            label8.Text = "편집요청일";
            // 
            // label9
            // 
            label9.AutoSize = true;
            label9.Location = new Point(375, 99);
            label9.Name = "label9";
            label9.Size = new Size(29, 15);
            label9.TabIndex = 8;
            label9.Text = "user";
            // 
            // label10
            // 
            label10.AutoSize = true;
            label10.Location = new Point(375, 129);
            label10.Name = "label10";
            label10.Size = new Size(52, 15);
            label10.TabIndex = 9;
            label10.Text = "ef55182";
            // 
            // label11
            // 
            label11.AutoSize = true;
            label11.Location = new Point(375, 156);
            label11.Name = "label11";
            label11.Size = new Size(55, 15);
            label11.TabIndex = 10;
            label11.Text = "트렌잭션";
            // 
            // label12
            // 
            label12.AutoSize = true;
            label12.Location = new Point(375, 269);
            label12.Name = "label12";
            label12.Size = new Size(73, 15);
            label12.TabIndex = 11;
            label12.Text = "2024-02-16";
            // 
            // comboBox1
            // 
            comboBox1.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBox1.FormattingEnabled = true;
            comboBox1.Location = new Point(375, 172);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(121, 23);
            comboBox1.TabIndex = 12;
            // 
            // comboBox2
            // 
            comboBox2.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBox2.FormattingEnabled = true;
            comboBox2.Location = new Point(375, 198);
            comboBox2.Name = "comboBox2";
            comboBox2.Size = new Size(121, 23);
            comboBox2.TabIndex = 13;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(375, 231);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 14;
            // 
            // button1
            // 
            button1.Location = new Point(355, 383);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 15;
            button1.Text = "편집요청";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // Request
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button1);
            Controls.Add(textBox1);
            Controls.Add(comboBox2);
            Controls.Add(comboBox1);
            Controls.Add(label12);
            Controls.Add(label11);
            Controls.Add(label10);
            Controls.Add(label9);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(label6);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Request";
            StartPosition = FormStartPosition.WindowsDefaultBounds;
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Label label5;
        private Label label6;
        private Label label7;
        private Label label8;
        private Label label9;
        private Label label10;
        private Label label11;
        private Label label12;
        private ComboBox comboBox1;
        private ComboBox comboBox2;
        private TextBox textBox1;
        private Button button1;
    }
}

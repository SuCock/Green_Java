namespace Practice
{
    partial class Search
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            panel1 = new Panel();
            comboBox1 = new ComboBox();
            textBox1 = new TextBox();
            button2 = new Button();
            label1 = new Label();
            button3 = new Button();
            SuspendLayout();
            // 
            // panel1
            // 
            panel1.BackColor = Color.FromArgb(64, 162, 227);
            panel1.Dock = DockStyle.Top;
            panel1.Location = new Point(0, 0);
            panel1.Name = "panel1";
            panel1.Size = new Size(800, 75);
            panel1.TabIndex = 0;
            // 
            // comboBox1
            // 
            comboBox1.BackColor = Color.FromArgb(187, 226, 236);
            comboBox1.DropDownStyle = ComboBoxStyle.DropDownList;
            comboBox1.FormattingEnabled = true;
            comboBox1.Location = new Point(118, 213);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(66, 23);
            comboBox1.TabIndex = 1;
            comboBox1.SelectedIndexChanged += comboBox1_SelectedIndexChanged;
            // 
            // textBox1
            // 
            textBox1.BackColor = Color.White;
            textBox1.Location = new Point(223, 213);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(393, 23);
            textBox1.TabIndex = 2;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // button2
            // 
            button2.BackColor = Color.FromArgb(13, 146, 118);
            button2.Font = new Font("Cascadia Code", 15.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            button2.ForeColor = Color.White;
            button2.Location = new Point(342, 319);
            button2.Name = "button2";
            button2.Size = new Size(136, 39);
            button2.TabIndex = 4;
            button2.Text = "로그인";
            button2.UseVisualStyleBackColor = false;
            button2.Click += button2_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Cascadia Code", 26.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(326, 92);
            label1.Name = "label1";
            label1.Size = new Size(152, 92);
            label1.TabIndex = 5;
            label1.Text = "먼  시험\r\n보   노";
            label1.Click += label1_Click;
            // 
            // button3
            // 
            button3.BackColor = Color.FromArgb(13, 146, 118);
            button3.Font = new Font("Cascadia Code", 9.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            button3.ForeColor = Color.White;
            button3.Location = new Point(622, 213);
            button3.Name = "button3";
            button3.Size = new Size(72, 25);
            button3.TabIndex = 6;
            button3.Text = "검색";
            button3.UseVisualStyleBackColor = false;
            button3.Click += button3_Click;
            // 
            // Search
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = Color.FromArgb(255, 246, 233);
            ClientSize = new Size(800, 450);
            Controls.Add(button3);
            Controls.Add(label1);
            Controls.Add(button2);
            Controls.Add(textBox1);
            Controls.Add(comboBox1);
            Controls.Add(panel1);
            Name = "Search";
            Text = "Search";
            Load += Search_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Panel panel1;
        private ComboBox comboBox1;
        private TextBox textBox1;
        private Button button2;
        private Label label1;
        private Button button3;
    }
}
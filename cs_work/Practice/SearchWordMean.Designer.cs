namespace Practice
{
    partial class SearchWordMean
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
            label1 = new Label();
            panel1 = new Panel();
            label4 = new Label();
            label3 = new Label();
            textBox1 = new TextBox();
            label2 = new Label();
            button1 = new Button();
            panel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Candara", 26.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label1.Location = new Point(287, 19);
            label1.Name = "label1";
            label1.Size = new Size(176, 42);
            label1.TabIndex = 1;
            label1.Text = "검색한 단어";
            // 
            // panel1
            // 
            panel1.Controls.Add(button1);
            panel1.Controls.Add(label4);
            panel1.Controls.Add(label3);
            panel1.Controls.Add(textBox1);
            panel1.Controls.Add(label2);
            panel1.Location = new Point(42, 81);
            panel1.Name = "panel1";
            panel1.Size = new Size(710, 126);
            panel1.TabIndex = 2;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(648, 14);
            label4.Name = "label4";
            label4.Size = new Size(43, 15);
            label4.TabIndex = 3;
            label4.Text = "중분류";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(584, 14);
            label3.Name = "label3";
            label3.Size = new Size(43, 15);
            label3.TabIndex = 2;
            label3.Text = "대분류";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(13, 50);
            textBox1.Multiline = true;
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(599, 57);
            textBox1.TabIndex = 1;
            textBox1.Text = "정의";
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Candara", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label2.Location = new Point(28, 14);
            label2.Name = "label2";
            label2.Size = new Size(61, 33);
            label2.TabIndex = 0;
            label2.Text = "단어";
            label2.Click += label2_Click;
            // 
            // button1
            // 
            button1.Location = new Point(618, 84);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 4;
            button1.Text = "편집요청";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // SearchWordMean
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(panel1);
            Controls.Add(label1);
            Name = "SearchWordMean";
            Text = "SearchWordMean";
            Load += SearchWordMean_Load;
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Panel panel1;
        private TextBox textBox1;
        private Label label2;
        private Label label4;
        private Label label3;
        private Button button1;
    }
}
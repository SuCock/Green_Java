namespace WinFormsApp2
{
    partial class Form1
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
            components = new System.ComponentModel.Container();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            button5 = new Button();
            contextMenuStrip1 = new ContextMenuStrip(components);
            tb_num1 = new TextBox();
            tb_num2 = new TextBox();
            label2 = new Label();
            label3 = new Label();
            label1 = new Label();
            lb_result = new Label();
            SuspendLayout();
            // 
            // button2
            // 
            button2.Font = new Font("휴먼둥근헤드라인", 18F, FontStyle.Bold);
            button2.Location = new Point(643, 13);
            button2.Name = "button2";
            button2.Size = new Size(100, 100);
            button2.TabIndex = 3;
            button2.Text = "더하기";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Font = new Font("휴먼둥근헤드라인", 18F, FontStyle.Bold);
            button3.Location = new Point(643, 119);
            button3.Name = "button3";
            button3.Size = new Size(100, 100);
            button3.TabIndex = 4;
            button3.Text = "뺴기";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // button4
            // 
            button4.Font = new Font("휴먼둥근헤드라인", 18F, FontStyle.Bold);
            button4.Location = new Point(643, 331);
            button4.Name = "button4";
            button4.Size = new Size(100, 100);
            button4.TabIndex = 5;
            button4.Text = "곱하기";
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // button5
            // 
            button5.Font = new Font("휴먼둥근헤드라인", 18F, FontStyle.Bold);
            button5.Location = new Point(643, 225);
            button5.Name = "button5";
            button5.Size = new Size(100, 100);
            button5.TabIndex = 6;
            button5.Text = "나누기";
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // contextMenuStrip1
            // 
            contextMenuStrip1.Name = "contextMenuStrip1";
            contextMenuStrip1.Size = new Size(61, 4);
            // 
            // tb_num1
            // 
            tb_num1.Location = new Point(154, 39);
            tb_num1.Name = "tb_num1";
            tb_num1.Size = new Size(100, 23);
            tb_num1.TabIndex = 8;
            // 
            // tb_num2
            // 
            tb_num2.Location = new Point(421, 39);
            tb_num2.Name = "tb_num2";
            tb_num2.Size = new Size(100, 23);
            tb_num2.TabIndex = 9;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("휴먼옛체", 14.25F, FontStyle.Bold);
            label2.Location = new Point(50, 42);
            label2.Name = "label2";
            label2.Size = new Size(98, 20);
            label2.TabIndex = 10;
            label2.Text = "첫번째 수";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("휴먼옛체", 14.25F, FontStyle.Bold);
            label3.Location = new Point(317, 42);
            label3.Name = "label3";
            label3.Size = new Size(98, 20);
            label3.TabIndex = 11;
            label3.Text = "두번째 수";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("휴먼옛체", 14.25F, FontStyle.Bold);
            label1.Location = new Point(50, 399);
            label1.Name = "label1";
            label1.Size = new Size(49, 20);
            label1.TabIndex = 12;
            label1.Text = "결과";
            label1.Click += label1_Click_1;
            // 
            // lb_result
            // 
            lb_result.AutoSize = true;
            lb_result.Font = new Font("휴먼옛체", 14.25F, FontStyle.Bold);
            lb_result.Location = new Point(154, 399);
            lb_result.Name = "lb_result";
            lb_result.Size = new Size(0, 20);
            lb_result.TabIndex = 13;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(lb_result);
            Controls.Add(label1);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(tb_num2);
            Controls.Add(tb_num1);
            Controls.Add(button5);
            Controls.Add(button4);
            Controls.Add(button3);
            Controls.Add(button2);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Button button2;
        private Button button3;
        private Button button4;
        private Button button5;
        private ContextMenuStrip contextMenuStrip1;
        private TextBox tb_num1;
        private TextBox tb_num2;
        private Label label2;
        private Label label3;
        private Label label1;
        private Label lb_result;
    }
}

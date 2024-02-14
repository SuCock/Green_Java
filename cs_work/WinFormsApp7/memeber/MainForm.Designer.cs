namespace WinFormsApp7.memeber
{
    partial class MainForm
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
            label2 = new Label();
            userControl11 = new UserControl1();
            userControl21 = new UserControl2();
            button1 = new Button();
            button2 = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("새굴림", 26.25F, FontStyle.Bold);
            label1.Location = new Point(12, 9);
            label1.Name = "label1";
            label1.Size = new Size(118, 35);
            label1.TabIndex = 0;
            label1.Text = "label1";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("새굴림", 26.25F, FontStyle.Bold);
            label2.Location = new Point(12, 92);
            label2.Name = "label2";
            label2.Size = new Size(118, 35);
            label2.TabIndex = 1;
            label2.Text = "label2";
            // 
            // userControl11
            // 
            userControl11.Location = new Point(136, 9);
            userControl11.Name = "userControl11";
            userControl11.Size = new Size(581, 560);
            userControl11.TabIndex = 2;
            // 
            // userControl21
            // 
            userControl21.Location = new Point(162, 9);
            userControl21.Name = "userControl21";
            userControl21.Size = new Size(555, 589);
            userControl21.TabIndex = 3;
            userControl21.Load += userControl21_Load;
            // 
            // button1
            // 
            button1.Location = new Point(55, 223);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 4;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(55, 268);
            button2.Name = "button2";
            button2.Size = new Size(75, 23);
            button2.TabIndex = 5;
            button2.Text = "button2";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // MainForm
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(829, 611);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(userControl21);
            Controls.Add(userControl11);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "MainForm";
            Text = "Form1";
            Load += MainForm_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private UserControl1 userControl11;
        private UserControl2 userControl21;
        private Button button1;
        private Button button2;
    }
}
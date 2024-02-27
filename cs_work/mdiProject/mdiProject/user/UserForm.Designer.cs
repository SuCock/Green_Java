namespace mdiProject.user
{
    partial class UserForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(UserForm));
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.EMAIL = new System.Windows.Forms.Label();
            this.TB_EM = new System.Windows.Forms.TextBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.TB_NM = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.TB_PW = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.TB_AD = new System.Windows.Forms.TextBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.panel3 = new System.Windows.Forms.Panel();
            this.TB_SR = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.button4 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.panel1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("groupBox1.BackgroundImage")));
            this.groupBox1.Controls.Add(this.panel3);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.TB_AD);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.TB_PW);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.TB_NM);
            this.groupBox1.Controls.Add(this.EMAIL);
            this.groupBox1.Controls.Add(this.TB_EM);
            this.groupBox1.Dock = System.Windows.Forms.DockStyle.Top;
            this.groupBox1.Font = new System.Drawing.Font("Candara", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(0, 0);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(800, 230);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "사용자관리";
            // 
            // EMAIL
            // 
            this.EMAIL.AutoSize = true;
            this.EMAIL.BackColor = System.Drawing.Color.Transparent;
            this.EMAIL.ForeColor = System.Drawing.Color.Snow;
            this.EMAIL.Location = new System.Drawing.Point(74, 39);
            this.EMAIL.Name = "EMAIL";
            this.EMAIL.Size = new System.Drawing.Size(90, 33);
            this.EMAIL.TabIndex = 1;
            this.EMAIL.Text = "EMAIL";
            // 
            // TB_EM
            // 
            this.TB_EM.Location = new System.Drawing.Point(191, 51);
            this.TB_EM.Multiline = true;
            this.TB_EM.Name = "TB_EM";
            this.TB_EM.Size = new System.Drawing.Size(155, 21);
            this.TB_EM.TabIndex = 0;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.groupBox2);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Location = new System.Drawing.Point(0, 236);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 214);
            this.panel1.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.ForeColor = System.Drawing.Color.Snow;
            this.label1.Location = new System.Drawing.Point(77, 84);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(87, 33);
            this.label1.TabIndex = 3;
            this.label1.Text = "NAME";
            // 
            // TB_NM
            // 
            this.TB_NM.Location = new System.Drawing.Point(191, 96);
            this.TB_NM.Multiline = true;
            this.TB_NM.Name = "TB_NM";
            this.TB_NM.Size = new System.Drawing.Size(155, 21);
            this.TB_NM.TabIndex = 2;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.ForeColor = System.Drawing.Color.Snow;
            this.label2.Location = new System.Drawing.Point(13, 127);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(151, 33);
            this.label2.TabIndex = 5;
            this.label2.Text = "PASSWORD";
            // 
            // TB_PW
            // 
            this.TB_PW.Location = new System.Drawing.Point(191, 139);
            this.TB_PW.Multiline = true;
            this.TB_PW.Name = "TB_PW";
            this.TB_PW.Size = new System.Drawing.Size(155, 21);
            this.TB_PW.TabIndex = 4;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.Transparent;
            this.label3.ForeColor = System.Drawing.Color.Snow;
            this.label3.Location = new System.Drawing.Point(82, 171);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(82, 33);
            this.label3.TabIndex = 7;
            this.label3.Text = "ADDR";
            // 
            // TB_AD
            // 
            this.TB_AD.Location = new System.Drawing.Point(191, 183);
            this.TB_AD.Multiline = true;
            this.TB_AD.Name = "TB_AD";
            this.TB_AD.Size = new System.Drawing.Size(155, 21);
            this.TB_AD.TabIndex = 6;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.dataGridView1);
            this.groupBox2.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.groupBox2.Font = new System.Drawing.Font("Candara", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox2.Location = new System.Drawing.Point(0, 0);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(800, 214);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "사용자";
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(3, 36);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(794, 175);
            this.dataGridView1.TabIndex = 0;
            // 
            // panel3
            // 
            this.panel3.BackColor = System.Drawing.Color.Transparent;
            this.panel3.Controls.Add(this.TB_SR);
            this.panel3.Controls.Add(this.label4);
            this.panel3.Controls.Add(this.button4);
            this.panel3.Controls.Add(this.button3);
            this.panel3.Controls.Add(this.button2);
            this.panel3.Controls.Add(this.button1);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(379, 36);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(418, 191);
            this.panel3.TabIndex = 9;
            // 
            // TB_SR
            // 
            this.TB_SR.Location = new System.Drawing.Point(128, 65);
            this.TB_SR.Multiline = true;
            this.TB_SR.Name = "TB_SR";
            this.TB_SR.Size = new System.Drawing.Size(155, 21);
            this.TB_SR.TabIndex = 19;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.ForeColor = System.Drawing.Color.Snow;
            this.label4.Location = new System.Drawing.Point(13, 53);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(109, 33);
            this.label4.TabIndex = 18;
            this.label4.Text = "SEARCH";
            // 
            // button4
            // 
            this.button4.BackColor = System.Drawing.Color.Transparent;
            this.button4.Location = new System.Drawing.Point(8, 123);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(122, 42);
            this.button4.TabIndex = 17;
            this.button4.Text = "INSERT";
            this.button4.UseVisualStyleBackColor = false;
            // 
            // button3
            // 
            this.button3.BackColor = System.Drawing.Color.Transparent;
            this.button3.Location = new System.Drawing.Point(148, 123);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(122, 42);
            this.button3.TabIndex = 16;
            this.button3.Text = "UPDATE";
            this.button3.UseVisualStyleBackColor = false;
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.Color.Transparent;
            this.button2.Location = new System.Drawing.Point(288, 123);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(122, 42);
            this.button2.TabIndex = 15;
            this.button2.Text = "DELETE";
            this.button2.UseVisualStyleBackColor = false;
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.Transparent;
            this.button1.Location = new System.Drawing.Point(289, 44);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(122, 42);
            this.button1.TabIndex = 14;
            this.button1.Text = "SEARCH";
            this.button1.UseVisualStyleBackColor = false;
            // 
            // UserForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.groupBox1);
            this.Name = "UserForm";
            this.Text = "UserForm";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.groupBox2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label EMAIL;
        private System.Windows.Forms.TextBox TB_EM;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox TB_AD;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox TB_PW;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox TB_NM;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.TextBox TB_SR;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button1;
    }
}
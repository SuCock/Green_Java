namespace WinFormsApp12
{
    public partial class Form1 : Form
    {
        int y = 40;
        int gak = 10;
        public Form1()
        {
            InitializeComponent();

            timer1.Interval = 100;
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            int x = 200 + (int)(Math.Cos((gak * Math.PI) / 180) * 150);
            int y = 200 + (int)(Math.Sin((gak * Math.PI) / 180) * 150);
            button1.Location = new Point(x, y);
            gak += 10;
        }
    }
}

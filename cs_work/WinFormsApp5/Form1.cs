namespace WinFormsApp5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private int y = 30;

        private void button1_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < 10; i++)
            {
                Button btn1 = new Button();
                btn1.Text = "OK";
                btn1.Location = new Point(300, 10 + y * i);
                btn1.UseVisualStyleBackColor = false;
                btn1.Click += Btn1_Click;

                Controls.Add(btn1);
            }
        }
        private void Btn1_Click(object sender, EventArgs e)
        {
            // 랜던하게 ok버튼 위치를 바꿔라
            Random random = new Random();
            int x = random.Next(1, 300);
            int y = random.Next(10, 200);
            Console.WriteLine(x);
            Console.WriteLine(y);

            // 안전한 형 변환 
            // Button이 형변환이 되면 btn에 넣어달라
            Button btn = sender as Button; // 예외가 발생하지않는 형변환
           
            if(btn.BackColor == Color.LightPink )
            {
                btn.BackColor = Color.White;
                btn.Text = "Ok";
                Console.WriteLine("Ok 버튼 또 누름");
                btn.Location = new Point(x, y);
            }
            else
            {
                btn.BackColor = Color.LightPink;
                btn.Text = "Not OK";
                Console.WriteLine("Ok 버튼 누름");
                btn.Location = new Point(x, y);
            }
            
        }
    }
}

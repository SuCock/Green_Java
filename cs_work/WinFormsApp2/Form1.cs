namespace WinFormsApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(((Button)sender).ToString());
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            // try catch문 대신 TryParse를 써서 예외처리한다
            int num1;
            int num2;
            int.TryParse(tb_num1.Text.ToString(), out num1); // tb_num1.Text.ToString()을 num1에 담아달라 없으면 0으로
            int.TryParse(tb_num2.Text.ToString(), out num2);

            lb_result.Text = (num1 + num2) + "";
            //MessageBox.Show("더하기" + (num1 + num2));
        }

        private void button3_Click(object sender, EventArgs e)
        {

            int num1;
            int num2;
            int.TryParse(tb_num1.Text.ToString(), out num1); // tb_num1.Text.ToString()을 num1에 담아달라 없으면 0으로
            int.TryParse(tb_num2.Text.ToString(), out num2);
            lb_result.Text = (num1 - num2) + "";
            //MessageBox.Show("뺴기" + (num1 - num2));
        }

        private void button5_Click(object sender, EventArgs e)
        {
            try
            {
                int num1;
                int num2;
                int.TryParse(tb_num1.Text.ToString(), out num1); // tb_num1.Text.ToString()을 num1에 담아달라 없으면 0으로
                int.TryParse(tb_num2.Text.ToString(), out num2);
                lb_result.Text = (num1 / num2) + "";
                //MessageBox.Show("나누기" + (num1 / num2));
            }
            catch (Exception)
            {

                MessageBox.Show("0으로 나눌 수 없습니다.");
            }
           
        }

        private void button4_Click(object sender, EventArgs e)
        {

            int num1;
            int num2;
            int.TryParse(tb_num1.Text.ToString(), out num1); // tb_num1.Text.ToString()을 num1에 담아달라 없으면 0으로
            int.TryParse(tb_num2.Text.ToString(), out num2);
            lb_result.Text = (num1 * num2) + "";
            //MessageBox.Show("곱하기" + (num1 * num2));
        }

        private void label1_Click_1(object sender, EventArgs e)
        {

        }
    }
}

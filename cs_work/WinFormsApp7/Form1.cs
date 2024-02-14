using WinFormsApp7.aaa; // aaa폴더에 있는것을 사용하겠다.

namespace WinFormsApp7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Hide(); // 지금 화면을 숨겨라
            MessageBox.Show("form2"); // 메세지 박스를 띄워라 -> 확인을 누르면
            new Form2().Show(); // form2를 보여줘라(두개의 창을 동시에 볼 때)
            Show(); // 지금 화면도 보여라
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Hide(); 
            MessageBox.Show("form3"); 
            Login frm3 = new Login();
            frm3.ShowDialog(); // show와 다르게 from3를 닫아야 다음 show가 실행된다 (하나의 창만 볼 때)
            //new Form3().ShowDialog();
            Show(); 
        }
    }
}

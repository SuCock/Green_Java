namespace WinFormsApp11
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            foreach (Control control in Controls) { 
                Console.WriteLine(control);
                if( control is Panel)
                {
                    // 예외 상황이 발생하더라고 종료 안됨
                    //Panel panel1 = (Panel) control; 
                    Panel panel = control as Panel; // 안전한 형변환
                    foreach(Control subcontrol in panel.Controls)
                    {
                        subcontrol.Text = "글자바꾸기 in Panel";
                    }
                }
                // 버튼의 text크기에 따라서 사이즈 변경하기
                if( control is Button)
                {
                    Button button = control as Button;
                    button.AutoSize = true;
                }
                control.Text = "글자바꾸기";
                control.Font = new Font("배달의민족 도현", 14.249981F, FontStyle.Bold); // control이라는 부모객체에 label을 담겨준다.
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}

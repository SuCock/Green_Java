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
                    // ���� ��Ȳ�� �߻��ϴ���� ���� �ȵ�
                    //Panel panel1 = (Panel) control; 
                    Panel panel = control as Panel; // ������ ����ȯ
                    foreach(Control subcontrol in panel.Controls)
                    {
                        subcontrol.Text = "���ڹٲٱ� in Panel";
                    }
                }
                // ��ư�� textũ�⿡ ���� ������ �����ϱ�
                if( control is Button)
                {
                    Button button = control as Button;
                    button.AutoSize = true;
                }
                control.Text = "���ڹٲٱ�";
                control.Font = new Font("����ǹ��� ����", 14.249981F, FontStyle.Bold); // control�̶�� �θ�ü�� label�� ����ش�.
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}

using WinFormsApp7.aaa; // aaa������ �ִ°��� ����ϰڴ�.

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
            Hide(); // ���� ȭ���� ���ܶ�
            MessageBox.Show("form2"); // �޼��� �ڽ��� ����� -> Ȯ���� ������
            new Form2().Show(); // form2�� �������(�ΰ��� â�� ���ÿ� �� ��)
            Show(); // ���� ȭ�鵵 ������
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Hide(); 
            MessageBox.Show("form3"); 
            Login frm3 = new Login();
            frm3.ShowDialog(); // show�� �ٸ��� from3�� �ݾƾ� ���� show�� ����ȴ� (�ϳ��� â�� �� ��)
            //new Form3().ShowDialog();
            Show(); 
        }
    }
}

using System;
using System.Runtime.InteropServices;

namespace ex240219
{
    public partial class Form1 : Form
    {
        List<string> listboxdata = new List<string>() { "ȫ�浿", "�̱浿", "�ڱ浿" };
        List<Person> personList = new List<Person>() {
            new Person(){name = "��浿", age = 20},
            new Person(){name = "�̱浿", age = 30}
        };
        public Form1()
        {
            InitializeComponent();

            dataGridView1.DataSource = null;
            dataGridView1.DataSource = personList;

            List<int> ints = new List<int>() { 11, 22, 33, 44, 55 };
            string result = "";
            foreach (int i in ints)
            {
                result += i;

            }

            label1.Text = result;
        }

        public void myThread()
        {
            Random random = new Random();
            double ran = random.NextDouble();
            //button1.Text = ran.ToString();
            while (true)
            {
                Thread.Sleep(1000);
                Invoke(new Action(() =>
                {
                    button1.Location = new Point(random.Next(700), random.Next(500));
                }));

            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Thread th1 = new Thread(myThread);
            th1.Start();

            button1.Text = "�������� ��ư ����";
            button1.Width = 200;

            for (int i = 0; i < 5; i++)
            {
                Button button = new Button();
                button.Text = i.ToString();
                this.Controls.Add(button);

                Point point = new Point();
                point.X = 10;
                point.Y = 100 + 40 * i;
                button.Location = point;

                bool visible = new Random().Next(2) == 0 ? true : false;

                Thread.Sleep(10);
                button.Visible = visible;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ClassA a = new ClassA() { x = 10, y = 20 };
            ClassA b = a;

            ClassAA aa = new ClassAA() { x = 10, y = 20 };
            ClassAA bb = aa;

            a.x = 100;
            Console.WriteLine($"a.x = {a.x}");
            Console.WriteLine($"b.x = {b.x}");

            aa.x = 100;
            Console.WriteLine($"aa.x = {aa.x}");
            Console.WriteLine($"bb.x = {bb.x}");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            List<int> list = new List<int> { 10, 20, 30, 40, 50 };

            foreach (int i in list)
            {
                Console.WriteLine(i);
            }

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {
            personList.Add(new Person() { name = "�̱浿", age = 30 });
            dataGridView1.DataSource = null;
            dataGridView1.DataSource = personList;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            // null�� ������ ��浿�� �ѹ��� �߰��ȴ�
            // null�� ������ ��浿�� ��ư�� ���������� �߰��ȴ�.
            listBox1.DataSource = null;
            listboxdata.Add("��浿");
            listBox1.DataSource = listboxdata;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}

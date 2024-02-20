using System.Diagnostics;
using System.Drawing;

namespace WinFormsAppClass
{
    public partial class Form1 : Form
    {
        int y = 10;

        class Car
        {
            // prop적고 tab
            // getter setter를 만들어준다
            public string Name { get; set; }
        }
        List<Car> list = new List<Car>();
        
        public Form1()
        {
            InitializeComponent();

            Car car1 = new Car() { Name = "안녕하세요 자동차1 입니다." };
            Car car2 = new Car() { Name = "자동차2 입니다." };

            list.Add(car1);
            list.Add(car2);

            foreach (var car in list) // 자료형 타입으로 바꿔줘도 car를 빌드할때 추론해준다
            {
                Console.WriteLine(car);
                MakeLabel(10, y, car.Name);
                y += 40;
            }
        }
        public void MakeLabel(int x, int y, string text)
        {
            label1 = new Label();
            label1.AutoSize = true;
            label1.Location = new Point(x, y);
            label1.Name = "label1";
            label1.Size = new Size(39, 15);
            label1.TabIndex = 0;
            label1.Text = text;
            label1.Font = new Font("배달의민족 도현", 14.2499981F, FontStyle.Bold);
            Controls.Add(label1);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MakeLabel(10, y = y + 40, textBox1.Text);
            Console.WriteLine(textBox1.Text);
            textBox1.Clear();// textBox1.Text = "";

        }

        private void textBox1_KeyUp(object sender, KeyEventArgs e)
        {
            if(e.KeyCode == Keys.Enter)
            {
                button1_Click(null, null);
            }
        }
    }
}

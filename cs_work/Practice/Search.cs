
using Practice.SRDatabase;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practice
{
    public partial class Search : Form
    {
        DBManager db = new DBManager();
        
        
        public Search()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void Search_Load(object sender, EventArgs e)
        {
            db.selectComoBox(comboBox1);
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text.Equals("용어"))
            {
                if(db.selectWord(textBox1) != null){
                    Dictionary<string, string> dictWord = db.selectWord(textBox1) as Dictionary<string, string>;
                    SearchWord sw = new SearchWord(dictWord);
                    sw.Show();
                };

            }
            else if (comboBox1.Text.Equals("정의"))
            {
                if (db.selectWordMean(textBox1) != null)
                {
                    // null이 들어올 수 있으니깐 null인지 아닌지 정확하게 형변환
                    Dictionary<string, string> dictWordMean =  db.selectWordMean(textBox1) as Dictionary<string,string>;
                    SearchWordMean swm = new SearchWordMean(dictWordMean);
                    swm.Show();
                };
            }
            else
            {
                MessageBox.Show("카테고리를 선택해주세요");
            }
        }
    }
}

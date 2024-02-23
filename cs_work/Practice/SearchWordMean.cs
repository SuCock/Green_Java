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
    public partial class SearchWordMean : Form
    {
        string word;
        public SearchWordMean(Dictionary<string, string> selectWordMean)
        {
            InitializeComponent();

            foreach (var kvp in selectWordMean)
            {
                Console.WriteLine($"Key: {kvp.Key}, Value: {kvp.Value}");
                word = kvp.Key;
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void SearchWordMean_Load(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Request rq = new Request(word);
            rq.Show();
        }
    }
}

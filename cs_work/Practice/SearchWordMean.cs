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
        public SearchWordMean(Dictionary<string, string> selectWordMean)
        {
            InitializeComponent();
            Console.WriteLine(selectWordMean);

            foreach (var kvp in selectWordMean)
            {
                Console.WriteLine($"Key: {kvp.Key}, Value: {kvp.Value}");
                label2.Text = kvp.Key;
                textBox1.Text = kvp.Value;


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
    }
}

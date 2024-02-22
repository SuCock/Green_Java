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
    public partial class SearchWord : Form
    {
        public SearchWord(Dictionary<string, string> selectWord)
        {
            InitializeComponent();
            Console.WriteLine(selectWord);

            foreach (var kvp in selectWord)
            {
                Console.WriteLine($"Key: {kvp.Key}, Value: {kvp.Value}");
                label2.Text = kvp.Key;
                textBox1.Text = kvp.Value;

            }
        }

        private void SearchWord_Load(object sender, EventArgs e)
        {

        }
    }
}

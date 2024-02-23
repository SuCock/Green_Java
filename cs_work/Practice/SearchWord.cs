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
        string word;
        public SearchWord(Dictionary<string, string> selectWord)
        {
            InitializeComponent();

            foreach (var kvp in selectWord)
            {
                Console.WriteLine($"Key: {kvp.Key}, Value: {kvp.Value}");
                word = kvp.Key;
            }
        }

        private void SearchWord_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Request rq = new Request(word);
            rq.Show();
        }
    }
}

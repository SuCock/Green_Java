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
            db.select(comboBox1);
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}

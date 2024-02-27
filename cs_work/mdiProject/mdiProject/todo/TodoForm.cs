using mdiProject.user;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace mdiProject.todo
{
    public partial class TodoForm : Form
    {
        private static TodoForm instance; //  싱글톤으로 만들어주기
        public static TodoForm getInstance()
        {
            if (instance == null || instance.IsDisposed)
            {
                instance = new TodoForm();
                return instance;
            }
            else
            {
                return instance;
            }
        }
        public TodoForm()
        {
            InitializeComponent();
        }
    }
}

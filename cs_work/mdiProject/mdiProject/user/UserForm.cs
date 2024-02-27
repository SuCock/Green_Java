using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace mdiProject.user
{
    public partial class UserForm : Form
    {
        private static UserForm instance; //  싱글톤으로 만들어주기
        public static UserForm getInstance()
        {
            if(instance == null || instance.IsDisposed)
            {
                instance = new UserForm();
                return instance;
            }
            else
            {
                return instance;
            }
        }
        public UserForm()
        {
            InitializeComponent();
        }
    }
}

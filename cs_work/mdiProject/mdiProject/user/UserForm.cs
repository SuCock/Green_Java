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
        private static UserForm instance = null;
        private UserDBManager userDBManager = new UserDBManager();
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
            LoadData();
        }

        private void LoadData()
        {
            DataTable dt = userDBManager.select();
            if (dt != null)
            {
                dataGridView1.DataSource = dt;
            }
        }

        // 삽입기능
        private void button4_Click(object sender, EventArgs e)
        {
            Users users = new Users() {
                                        Email = TB_EM.Text
                                      , Name = TB_NM.Text
                                      , Password = TB_PW.Text
                                      , Addr = TB_AD.Text
                                       };

            bool result = userDBManager.insert(users);
            if (result)
            {
                MessageBox.Show("저장완료");
                TB_PW.Text = "";
                TB_NM.Text = "";
                TB_AD.Text = "";
                TB_EM.Text = "";

                LoadData();
            }
            else
            {
                MessageBox.Show("저장실패");
            }
        }

        // 수정기능
        private void button3_Click(object sender, EventArgs e)
        {

        }

        // 삭제기능
        private void button2_Click(object sender, EventArgs e)
        {

        }

        // 조회기능
        private void button1_Click(object sender, EventArgs e)
        {
            LoadData();
        }
    }
}

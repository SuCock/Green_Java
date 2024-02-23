using autoid_crud.db;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace autoid_crud
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void insert(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(FirstNameTextBox.Text.Trim()) ||
                string.IsNullOrEmpty(LastNameTextBox.Text.Trim()))
            {
                MessageBox.Show("이름을 입력하세요", "경고",  MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else {
                string gender = "남자";
                if(comboBox1.SelectedItem != null)
                {
                    gender = comboBox1.SelectedItem.ToString();    
                }
                string sql = $"INSERT INTO tb_smart_crud (AUTOID, FIRSTNAME, LASTNAME, GENDER) VALUES(TB_SMART_SEQ.NEXTVAL, '{FirstNameTextBox.Text}', '{LastNameTextBox.Text}', '{gender}')";
                CRUD.con.Open();
                CRUD.cmd = new OracleCommand(sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();
                //CRUD.cmd.Parameters.AddWirhValue(firstName);

                CRUD.cmd.ExecuteNonQuery();
                CRUD.con.Close();
                MessageBox.Show("저장되었습니다.");
            }
            
        }
    }
}

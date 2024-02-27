using autoid_crud.db;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace autoid_crud
{
    public partial class Form1 : Form
    {
        private int autoid = 0;

        public Form1()
        {
            InitializeComponent();
            comboBox1.SelectedIndex = 0;
            dataGridView1.ReadOnly = true;
            dataGridView1.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill;
            dataGridView1.AllowUserToAddRows = false;

            select();
        }

        private void select(string searchText="")// 안보내면 빈공백이다.
        {
            CRUD.con.Open();

            OracleDataAdapter oracleDataAdapter = new OracleDataAdapter();
            string sql = $"SELECT * FROM tb_smart_crud WHERE CONCAT(firstname, lastname) LIKE :searchText ORDER BY autoid DESC";

            OracleCommand oracleCommand = new OracleCommand(sql, CRUD.con);
            oracleCommand.Parameters.Add(":serchText", $"%{searchText}%");

            oracleDataAdapter.SelectCommand = oracleCommand;

            DataSet dataSet = new DataSet();
            oracleDataAdapter.Fill(dataSet);

            dataGridView1.DataSource = dataSet.Tables[0];

            CRUD.con.Close();
            cleanContorol();

            if(dataGridView1.Rows.Count > 0)
            {
                this.autoid = int.Parse(dataGridView1.Rows[0].Cells[0].Value.ToString());
            }
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
            }
            MessageBox.Show("등록되었습니다.");
            cleanContorol();


            select();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (searchText.Text.Equals(""))
            {
            select();
            }
            else
            {
                select(searchText.Text);
            }
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            this.autoid = int.Parse(dataGridView1.CurrentRow.Cells[0].Value.ToString());
            string firstName = dataGridView1.CurrentRow.Cells[1].Value.ToString();
            string lastName = dataGridView1.CurrentRow.Cells[2].Value.ToString();
            string gneder = dataGridView1.CurrentRow.Cells[3].Value.ToString(); ;

            FirstNameTextBox.Text = firstName;
            LastNameTextBox.Text = lastName;
            comboBox1.SelectedItem = gneder;

            button2.Text = $"UPDATE({autoid})";
            button3.Text = $"UPDATE({autoid})";

        }

        #region update 버튼 누름
        private void button2_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(FirstNameTextBox.Text.Trim()) ||
               string.IsNullOrEmpty(LastNameTextBox.Text.Trim()))
            {
                MessageBox.Show("이름을 입력하세요", "경고", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                string gender = "남자";
                if (comboBox1.SelectedItem != null)
                {
                    gender = comboBox1.SelectedItem.ToString();
                }
                string sql = $"UPDATE tb_smart_crud SET FIRSTNAME = '{FirstNameTextBox.Text}', LASTNAME = '{LastNameTextBox.Text}', GENDER = '{comboBox1.Text}' WHERE AUTOID = '{this.autoid}'";
                CRUD.con.Open();
                CRUD.cmd = new OracleCommand(sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();                                 

                CRUD.cmd.ExecuteNonQuery();
                CRUD.con.Close();
            }
            MessageBox.Show("수정되었습니다.");
            cleanContorol();

            select();
        }
        #endregion

        #region delete 버튼 누름
        private void button3_Click(object sender, EventArgs e)
        {
            if(autoid == 0)
            {
                MessageBox.Show("선택을 해야 합니다");
                return;
            }
            string sql = $"DELETE FROM tb_smart_crud WHERE autoid = {this.autoid}";
                CRUD.con.Open();
                CRUD.cmd = new OracleCommand(sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();

                CRUD.cmd.ExecuteNonQuery();
                CRUD.con.Close();
            
            MessageBox.Show("삭제되었습니다.");

            select();

            cleanContorol();
        }
        #endregion

        private void cleanContorol()
        {
            FirstNameTextBox.Text = string.Empty;
            LastNameTextBox.Text = string.Empty;
            button2.Text = "UPDATE";
            button3.Text = "DELETE";
        }
    }
}

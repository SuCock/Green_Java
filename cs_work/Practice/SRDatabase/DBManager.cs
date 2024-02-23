﻿using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Practice;

namespace Practice.SRDatabase
{
    public class DBManager
    {
        string strConnection = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=bono;Password=bono;";
        private Dictionary<string, string> myDictionary = new Dictionary<string, string>();

        public void selectComoBox(ComboBox comboBox)
        {
            OracleConnection conn = new OracleConnection(strConnection);
            conn.Open();
            OracleCommand cmd = new OracleCommand($"SELECT group_detail_name FROM group_detail WHERE GROUP_NO = 'RC'", conn);
            OracleDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                comboBox.Items.Add(reader.GetString(0));
            }
            comboBox.SelectedIndex = 0;
            reader.Close();
            conn.Close();
        }

        public Dictionary<string, string> selectWord(TextBox text)
        {   
            string word = text.Text;
            if (word.Equals(""))
            {
                MessageBox.Show("검색어를 입력해주세요");
                return null;
            }
            OracleConnection conn = new OracleConnection(strConnection);
            conn.Open();
            OracleCommand cmd = new OracleCommand($"SELECT * FROM word WHERE word LIKE '%{word}%' AND delete_yn = 'n'", conn);
            OracleDataReader reader = cmd.ExecuteReader();
            int cnt = 0;
            Dictionary<string, string> dWord = new Dictionary<string, string>();
            while (reader.Read())
            {
                cnt++;
                //Console.WriteLine(reader["WORD"].ToString());
                //Console.WriteLine(reader["WORD_MEAN"].ToString());
                
                dWord.Add( reader["WORD"].ToString(), reader["WORD_MEAN"].ToString() );
                
                
            }
            if (cnt == 0)
            {
                MessageBox.Show("다시 검색하세요");
                return null;
            }
            reader.Close();
            conn.Close();
            return dWord; // return을 반복문 안에 넣어서 한번밖에 못돈다
        }
        public Dictionary<string, string> selectWordMean(TextBox text)
        {   
            string wordMean = text.Text;
            if (wordMean.Equals(""))
            {
                MessageBox.Show("검색어를 입력해주세요");
                return null;
            }
            OracleConnection conn = new OracleConnection(strConnection);
            conn.Open();
            OracleCommand cmd = new OracleCommand($"SELECT * FROM word WHERE word_mean LIKE '%{wordMean}%' AND delete_yn = 'n'", conn);
            OracleDataReader reader = cmd.ExecuteReader();
            int cnt = 0;
            Dictionary<string, string> dWordMean = new Dictionary<string, string>();
            while (reader.Read())
            {
                cnt++;
                //Console.WriteLine(reader["WORD"].ToString());
                //Console.WriteLine(reader["WORD_MEAN"].ToString());


                dWordMean.Add(reader["WORD"].ToString(), reader["WORD_MEAN"].ToString()); 
                
                
            }
            if (cnt == 0)
            {
                MessageBox.Show("다시 검색하세요");
                return null;
            }
            reader.Close();
            conn.Close();
            return dWordMean;

        }

        public void requestBtn()
        {

        }
    }
}

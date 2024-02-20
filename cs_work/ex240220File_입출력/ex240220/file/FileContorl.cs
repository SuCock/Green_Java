using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex240220.file
{
    public class FileContorl
    {
        string filePath = "data.txt";

        public void write(string text, List<String> list)
        {
            //Console.WriteLine($"write -> {text}");
            //File.WriteAllText(filePath, text );
            foreach(var item in list)
            {
                Console.WriteLine(item);
            }
            File.WriteAllLines(filePath, list);
        }
        public List<string> read()
        {
            List<string> list = new List<string>(File.ReadAllLines(filePath));
            return list;
            //Console.WriteLine("read");
            //string text = File.ReadAllText(filePath);
            //Console.WriteLine($"text = {text}");
        }
    }
}

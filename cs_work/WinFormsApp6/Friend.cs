using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace WinFormsApp6
{
    public class Friend
    {
        private string name;

        public Friend(string name)
        {
            this.name = name;
        }

        public string getName()
        {
            return name;
        }

        public override string ToString() {
            return $"Friend name = {name}";
        }

    }
}

﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mdiProject.todo
{
    public class Todo
    {
        public int idx { get; set; }
        public int user_idx { get; set; }
        public string title { get; set; }
        public string content {  get; set; }
        public DateTime finishdate { get; set; }

        public string name {  get; set; }
    }
}

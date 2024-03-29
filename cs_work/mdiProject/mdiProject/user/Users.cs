﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mdiProject.user
{
    public class Users
    {
        public int Idx {  get; set; }
        public string Email { get; set; }
        public string Name { get; set; }
        public string Password { get; set; }
        public string Addr { get; set; }

        public override string ToString()
        {
            return base.ToString() + $"IDX = {Idx} \n" +
                                     $"EMAIL = {Email} \n" +
                                     $"NAME = {Name} \n" +
                                     $"PASSWORD = {Password} \n" +
                                     $"ADDR = {Addr} \n";
        }
    }
}

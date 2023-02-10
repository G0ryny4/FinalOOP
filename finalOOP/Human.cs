using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Inheritance
{
    public class Human
    {
        protected string name;
        protected string lastName;
        protected ushort age;
        // public Human() { }
        // public Human(string name) { }

        public Human(string name, string lastName, ushort age)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public override string ToString()
        {
            return String.Format("{0}, {1}, {2}", this.name, this.lastName, this.age);
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Inheritance
{
    public class Worker : Human
    {
        ulong salary;

        public Worker(string name, string lastName, ushort age, ulong salary) : base(name, lastName, age)
        {
            this.salary = salary;
        }

        public override string ToString()
        {
            return string.Format("{0}, {1}", base.ToString(), this.salary);
        }
    }
}
using System;
using System.Text;

namespace MagicTreesApp
{
    class MagicTrees
    {
        static void Main(string[] args)
        {
            string strN = Console.ReadLine();
            int totalBuds = 0;
            StringBuilder sb = new StringBuilder();
            StringBuilder sbWithInitialValue = new StringBuilder("o");

            if(!int.TryParse(strN, out int n))
            {
                Console.WriteLine("Not a valid int");
                return;
            }

            for (int i = 0; i < n; i++)
            {
                string strAge = Console.ReadLine();

                if(!int.TryParse(strAge, out int age))
                {
                    Console.WriteLine("Not a valid int");
                    return;
                }

                totalBuds = totalBuds + age*age;
                CreateTree(age, sb);
                sb.AppendLine();
            }

            Console.WriteLine(totalBuds);
            Console.WriteLine(sb);
        }

        void CreateTree(int age, StringBuilder sb){
            for (int i = 0; i < age*age; i++)
            {
                sb.Append(" o");
            }
        }
    }
}
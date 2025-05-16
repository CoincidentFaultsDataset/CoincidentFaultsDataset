using System;
using System.Text;

namespace MagicTreesApp
{
    class MagicTrees
    {
        static void Main(string[] args)
        {
            string strN = Console.ReadLine();

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

                CreateTree(age);
            }
        }

        void CreateTree(int age){
            StringBuilder sb = new StringBuilder();
            StringBuilder sbWithInitialValue = new StringBuilder("Initial value");
            
            for (int i = 0; i < age*age-1; i++)
            {
                
            }
        }
    }
}
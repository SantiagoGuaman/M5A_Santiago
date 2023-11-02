using System;

namespace ClienteCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CSService.Service1Client client = new CSService.Service1Client();

            //Call métodos
            //Login
            if (client.GetLogin("admin", "admin"))
            {
                Console.WriteLine("Bienvenido Cliente C#");
            }

            //Pow Number
            Console.WriteLine(client.GetPowNumber(5,8));
        }
    }
}

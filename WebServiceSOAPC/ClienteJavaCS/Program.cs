using System;

namespace ClienteJavaCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            JavaServices.WSOperationsClient client = new JavaServices.WSOperationsClient();
            //Call Java

            //Register
            if(client.Register("Maria", "ABC123", 900.00))
            {
                Console.WriteLine("Cliente C# en Java registrado");
            } else
            {
                Console.WriteLine("Cliente C# en Java no registrado");
            }

            //Login
            if (client.login("Steve", "One"))
            {
                Console.WriteLine("Ingreso del cliente C# en Java completado");
            } else
            {
                Console.WriteLine("Verifique sus credenciales");
            }

            //Payment
            Console.WriteLine(client.ProcesarPago(500.00, 200.00));
            Console.WriteLine(client.ProcesarPago(100.00, 200.00));
        }
    }
}

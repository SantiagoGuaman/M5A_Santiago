using System;

namespace WebServiceSOAPC
{
    public class Service1 : IService1
    {
        public bool GetLogin(string user, string password)
        {
            return (user.Equals("admin") && password.Equals("admin"));
        }

        public string GetPowNumber(Double value, int pow)
        {
            return ("El valor " + value + " elevado a " + pow + " es " + Math.Pow(value, pow));
        }
    }
}

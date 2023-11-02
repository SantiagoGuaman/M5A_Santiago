using System;
using System.ServiceModel;

namespace WebServiceSOAPC
{
    [ServiceContract]
    public interface IService1
    {

        [OperationContract]
        string GetPowNumber(Double value, int pow);

        [OperationContract]
        Boolean GetLogin(string user, string password);
    }

}

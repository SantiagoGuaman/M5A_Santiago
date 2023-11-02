from zeep import Client

#Creación de Cliente
cliente = Client('http://localhost:8080/ServicioWebSOAP/WSOperations?WSDL')

#Registro Call
if cliente.service.Register("Rommel", "", -100.00):
    print("Registro del Cliente Python correcto...")
else:
    print("El cliente Python no se pudo registrar...")

#Login Call
if cliente.service.login("user", "admin"):
    print("Ingreso exitoso")
else:
    print("Datos de ingreso no válidos")

#Payment Call
if cliente.service.ProcesarPago(100.00, 10.2) >= 0:
    print("Pago exitoso...")
else:
    print("Saldo insuficiente, pago no realizado...")
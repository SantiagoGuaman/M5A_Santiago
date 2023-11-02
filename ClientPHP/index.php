<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        require 'lib/nusoap.php';
        $WSDL = 'http://localhost:8080/ServicioWebSOAP/WSOperations?WSDL';
        try {

            $client = new nusoap_client($WSDL);
            
            echo "<br>Registro Operation<br>";
            if ($client->call("registro", ["Mike", "12345", 1000.00])) {
                echo "Registro completado<br>";
            } else {
                echo "El registro no se pudo completar...<br>";
            }

            echo "<br>Login Operation<br>";
            if ($client->call("login", ["Marco", "Bank"])) {
                echo "Bievenido Cliente PHP<br>";
            } else {
                echo "Verifique sus credneciales cliente PHP<br>";
            }
            
        } catch (SoapFault $e) {
            print ("Error: " . $e->getMessage());
        }
        ?>
    </body>
</html>

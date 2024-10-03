#language:es
Característica: Tranferir fondos de una cuenta a otra
  yo como usuario deseo transferir fondos de una cuenta a otra
  @Transferir
  Escenario: Tranferir fondos de una cuenta a otra  EXITOSAMENTE
    Dado que el usuario ingresa a la pagina
    Cuando el usaurio se logea y  procede a realizar la transferencia de fondos
    Entonces puede visualizar el mensaje de transaccion exitosa

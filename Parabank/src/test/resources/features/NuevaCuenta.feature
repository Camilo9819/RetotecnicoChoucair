#language:es
Característica: Realizar el proceso de la nueva cuenta
  yo como usuario deseo crear una nueva cuenta de tipo SAVINGS
  @NuevaCuenta
  Escenario: Realizar el proceso de la nueva cuenta EXITOSAMENTE
    Dado que el usuario ingresa a la pagina
    Cuando el usaurio se logea y  procede a realizar la creacion de la cuenta nueva
    Entonces puede visualizar el mensaje de que fue creada exitosamente

#language:es
Característica: Realizar el proceso de registro
  yo como usuario deseo registrarme en la pagina parabank
  @Registro
  Escenario: Realizar el proceso de registroexitosamente
    Dado que el usuario ingresa a la pagina
    Cuando el usaurio procede a realizar el proceso de registro
    Entonces puede visualizar el mensaje de bienvenida

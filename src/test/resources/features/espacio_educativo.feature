#languaje:es
@tag
Feature: Espacio educativo
  Quiero generar una cuenta y realizar el login

  Scenario Outline: Registrarme
    When Ingreso a la pagina de registro para ingresar el "<nombre>" el "<apellido>" el "<correo>" la "<contrasenia>" y la "<cedula>"
    Then Valido el mensaje de "<validacion>"

    Examples:
      | nombre| apellido | correo | contrasenia|cedula |validacion |
      | pepito| perez|alejandro2586@gmail.com|prueba1|cedula|Lo sentimos, el correo electrónico ingresado no está autorizado para el registro. |

    Scenario Outline: Ingresar a la pagina
      When Ingreso a la pagina e ingresio mi "<correo>" y "<contrasenia>"
      Then Valido el mensaje de "<>" para inicio de sesion

      Examples:
        | correo | contrasenia|
      |alejandro2586@gmail.com|prueba1|
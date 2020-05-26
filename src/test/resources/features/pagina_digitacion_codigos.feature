#languaje:es
@tag
Feature: Sacar número según imagen
  Quiero digitar un código en imágenes con respecto al src

  Scenario Outline: Copiar codigo
    When Ingreso a la pagina para loguearme con "<usuario>" y "<contrasenia>"
    When Quiero dar muchos clicks
    Then Termino todo

    Examples:
      | usuario| contrasenia|
      |prueba06|prueba06|
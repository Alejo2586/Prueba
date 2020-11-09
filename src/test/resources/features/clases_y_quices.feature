#languaje:es
@tag
Feature: Smart
  Quiero programar clases y quices

  Scenario Outline: Clase
    When Lleno el formulario en la parte de datos personales para llenar el "<email>" el "<codigoEstudiante>" el "<nombreApellidos>" y el "<celular>"
    When Indico el "<servicioATomar>" e ingreso el "<nivelIngles>"
    When Indico la "<claseATomar>" el "<dia>" que deseo y la "<hora>" con la "<notaQuiz>"

    Examples:
    |email|codigoEstudiante|nombreApellidos|celular|servicioATomar|nivelIngles|notaQuiz|claseATomar|dia|hora|
    |alejandro2586@gmail.com|10032720|Alejandro Ocampo Gomez|3207287665|CLASE VIRTUAL INGLES|A2|        |54|            ||


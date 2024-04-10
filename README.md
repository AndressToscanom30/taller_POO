#Cree una clase llamada Persona que siga las siguientes condiciones:

*Sus atributos son: nombre, edad, cedula, sexo (H hombre, M mujer), peso y altura.
*Por defecto, todos los atributos menos la cedula serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, use una constante para esto.
*Debe implementar varios constructores:
*Un constructor por defecto.
*Un constructor con el nombre, edad y sexo, el resto por defecto.
*Un constructor con todos los atributos como parámetro.
1. Los métodos que debe implementar son:
*calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Como recomendacion usar constantes para devolver los valores.
*esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
*comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H.
*toString(): devuelve toda la información del objeto.
*generaCedula(): genera un número aleatorio de 10 digitos. Este método sera invocado cuando se construya el objeto.
*Métodos get y set de cada atributo.

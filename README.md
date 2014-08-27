shopear_test
============

Shopear Test

1) Escribir el c�digo de la fabricaci�n de un Sandwich. Dar una breve descripci�n de cada clase
utilizada. Nota: no hace falta escribir toda la definici�n de las clases utilizadas, solo una breve
descripci�n de cada una.
Ingredientes:
� pan de miga negro
� jam�n crudo
� queso
� manteca
2) Si el Sandwich fabricado, y cada uno de sus ingredientes, del anterior punto implementara la
interfaz Eatable (ver abajo), �Cu�l ser�a la mejor estrategia para verificar que cada parte y el
conjunto estan funcionando bien?
/**
* Eatable Interface.
*/
interface Eatable
{
/**
* Bites the eatable object, subtracting weight from it.
*
* @return grams subtracted
*/
function bite(int $grams);
}
3) Dar un ejemplo de un test unitario (s�lo el test unitario) de alguna de las clases utilizadas en
el anterior punto, que implementan la interfaz Eatable.
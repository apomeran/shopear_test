shopear_test
============

Shopear Test

1) Escribir el código de la fabricación de un Sandwich. Dar una breve descripción de cada clase
utilizada. Nota: no hace falta escribir toda la definición de las clases utilizadas, solo una breve
descripción de cada una.
Ingredientes:
­ pan de miga negro
­ jamón crudo
­ queso
­ manteca
2) Si el Sandwich fabricado, y cada uno de sus ingredientes, del anterior punto implementara la
interfaz Eatable (ver abajo), ¿Cuál sería la mejor estrategia para verificar que cada parte y el
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
3) Dar un ejemplo de un test unitario (sólo el test unitario) de alguna de las clases utilizadas en
el anterior punto, que implementan la interfaz Eatable.
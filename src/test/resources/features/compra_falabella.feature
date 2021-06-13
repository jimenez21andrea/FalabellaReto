# language: es
# encoding: UTF-8
#Autor: apjimene@bancolombia.com.co

Característica: : Yo como usuario ncesito realizar una compra de un articulo en la pagina de falabella


Escenario: Comprar articulo
Dado que el usuario ingresa a la pagina de falabella
Cuando el usuario elige comprar el producto tenis
Y llena la informacion necesaria en la bolsa de compras

|departamento| ciudad | direccion|
|ANTIOQUIA   |MEDELLIN| CALLE291 |

  Entonces el usuario verifica que llego hasta el Pago


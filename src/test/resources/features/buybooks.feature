#language: es
Característica: Comprar libros sin descuentos
  Como aspirante a mago
  quiero poder comprar los libros de harry potter
  para inspirarme con las historias de este heroe.

  Escenario: comprar 1 libro
    Dado ingreso a la libreria
    Cuando selecciono 1 libro de "La piedra filosofal"
    Y compro mi seleccion de libros
    Entonces veo "Total de su compra: 8 USD"
#language: es
Característica: Comprar libros sin descuentos
  Como aspirante a mago
  quiero poder comprar los libros de harry potter
  para inspirarme con las historias de este heroe.

  Escenario: comprar 1 libro
    Dado ingreso a la libreria
    Y selecciono 1 libro de "La piedra filosofal"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 8 USD"

  Escenario: comprar 2 libro
    Dado ingreso a la libreria
    Y selecciono 1 libro de "La piedra filosofal"
    Y selecciono 1 libro de "La camara secreta"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 16 USD"

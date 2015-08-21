#language: es
Característica: iniciar juego
  Como jugador
  quiero que el juego me de la bienvenida
  para engancharme al juego

  Escenario: veo la pantalla de bienvenida
    Dado ingreso al juego
    Entonces veo el mensaje "Mortal Kombat"
    Y veo segundo mensaje "Press Start"

  Escenario: veo la pantalla de bienvenida
    Dado ingreso al juego
    Cuando presiono Start
    Entonces el juego muestra la pantalla de ingreso de jugadores con el mensaje "Fight!"
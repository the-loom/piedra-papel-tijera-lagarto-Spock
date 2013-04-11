# Piedra, papel, tijera, lagarto, Spock

## Contexto
[Creado por Sam Kaas](http://www.samkass.com/theories/RPSSL.html) y luego popularizado por la comedia [The Big Bang Theory](http://www.cbs.com/shows/big_bang_theory/), este juego busca complejizar las reglas del tradicional **piedra, papel o tijera** mediante el agregado de dos componentes nuevos: el lagarto y Spock.  
La idea fundamental tras este cambio fue la de reducir las chances de empate, situación que se daba muy a menudo entre jugadores que se conocían lo suficiente.

### Reglas
Si bien Sheldon tiene [una excelente explicación](http://www.youtube.com/watch?v=O5j4RGw6fHQ&t=0m26s) de las reglas del juego, las transcribimos aquí mismo:

* Tijera corta papel
* Papel cubre piedra
* Piedra aplasta lagarto
* Lagarto envenena Spock
* Spock destroza tijera
* Tijera decapita lagarto
* Lagarto come papel
* Papel refuta Spock
* Spock vaporiza piedra
* Piedra aplasta tijera

Aunque es más sencillo con una imagen:

![Reglas gráficas](http://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg/220px-Pierre_ciseaux_feuille_l%C3%A9zard_spock_aligned.svg.png)

Sugerimos que lo jueguen un par de veces para comprender la temática, aunque es bastante sencilla

## Consigna

Se pide implementar una solución que permita jugar al **piedra, papel, tijera, lagarto, Spock**, calculando el resultado de cada partida en función de las formas elegidas por las manos.
Aquí un ejemplo de cómo debería funcionar:

    Mano jugadorUno = new Mano(Forma.PAPEL);
    Mano jugadorDos = new Mano(Forma.LAGARTO);
    
    Resultado resultadoJuego = jugadorUno.jugarContra(jugadorDos);
    // resultadoJuego debe valer Resultado.PIERDE
    
    resultadoJuego = jugadorDos.jugarContra(jugadorUno);
    // resultadoJuego debe valer Resultado.GANA
    
    resultadoJuego = jugadorUno.jugarContra(jugadorUno);
    // resultadoJuego debe valer Resultado.EMPATA

### Material proporcionado

Se otorga la implementación base de la clase `Mano`, donde deberás completar, agregando tu propio código y eliminando las excepciones correspondientes, que hacen fallar el programa tal cual se entrega.
Adicionalmente se entrega una implementación básica de los enumerados `Forma` y `Resultado`.

También se te proveerá un *test* (dentro de la clase `PartidaTests`) a modo de testigo, probando uno de los casos emblemáticos. Idealmente deberías hacer crecer esas pruebas, o agregar las tuyas propias para asegurarte de que tu solución es correcta.

### Sugerencias

La implementación más sencilla, completamente válida pero no recomendada, implica una gran cantidad de estructuras condicionales anidadas. Ese código no es mantenible, legible ni prolijo.  
Te alentamos a que pruebes otras implementaciones, con algoritmos más sencillos que, idealmente, no tengan ninguna estructura condicional `if`, ni su reemplazo, `switch`.

## Criterios de evaluación

Este trabajo tendrá una nota normalizada en 10.0 puntos, los cuales se componen según el siguiente detalle:

<table>
 <thead>
 <tr>
  <th>Concepto</th>
  <th>Puntos totales</th>
  <th>Porcentaje sobre el total</th>
 </tr>
 </thead>
 <tr>
  <td>Funcionalidad</td>
  <td>8.0</td>
  <td>80 %</td>
 </tr>
 <tr>
  <td>Estilo</td>
  <td>2.0</td>
  <td>20 %</td>
 </tr>
 <tr>
  <td>Total</td>
  <td>10.0</td>
  <td>100 %</td>
 </tr>
</table>

Por lo tanto, se te evaluará tanto la funcionalidad como la correctitud de estilo (tabulación, espacios, nombres, etcétera).

## Consideraciones

1. Recordá no cambiar la firma de los métodos proporcionados por la cátedra.
2. Podés hacer **tantos tests como consideres necesarios**, pero los mismos no se utilizarán para evaluar tu código.
3. Recordá que podés enviar la tarea a corrección tantas veces como quieras, dentro del período de vigencia de la misma.

package edu.tallerweb.pptls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PartidaTests extends BaseTests {
	
	@Test(timeout = 500)
	public void queSePuedeInstanciarMano() {

		Mano unaMano = new Mano(Forma.SPOCK);

		assertNotNull("puede crearse una mano", unaMano);

	}

	@Test(timeout = 500)
	public void queSePuedeJugar() {

		Mano unaMano = new Mano(Forma.SPOCK);

		unaMano.jugarCon(unaMano);

	}

	@Test(timeout = 500)
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza tijera", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queSpockEmpataConSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock empata con Spock", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queSpockPierdeConLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock pierde con lagarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queSpockPierdeConPapel() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock pierde con papel", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("piedra aplasta lagarto", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("piedra aplasta tijera", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePiedraEmpataConPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("piedra empata con piedra", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePiedraPierdeConPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("piedra pierde con papel", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePiedraPierdeConSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("piedra pierde con Spock", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("papel cubre piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("papel refuta Spock", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePapelEmpataConPapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("piedra empata con piedra", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePapelPierdeConLagarto() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("papel pierde con lagarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void quePapelPierdeConTijera() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("papel pierde con tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("tijera corta papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("tijera decapita lagarto", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queTijeraEmpataConTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("tijera empata con tijera", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queTijeraPierdeConSpock() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("tijera pierde con Spock", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queTijeraPierdeConPiedra() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("tijera pierde con piedra", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("lagarto come papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("lagarto envenena Spock", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queLagartoEmpataConLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("lagarto empata con lagarto", Resultado.EMPATA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queLagartoPierdeConTijera() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("lagarto pierde con tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test(timeout = 500)
	public void queLagartoPierdeConPiedra() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("lagartoPierdeConPiedra", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));

	}

}

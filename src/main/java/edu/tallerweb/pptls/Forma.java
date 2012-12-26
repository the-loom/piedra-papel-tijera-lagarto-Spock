package edu.tallerweb.pptls;

/**
 * Las diferentes Formas que existen en el juego
 */
public enum Forma {

	PIEDRA(0), SPOCK(1), PAPEL(2), LAGARTO(3), TIJERA(4);

	private final Integer valor;

	private Forma(final Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return this.valor;
	}

}

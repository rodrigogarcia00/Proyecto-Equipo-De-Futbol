package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenNumeroCamiseta implements Comparator <Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		Integer numero1 = o1.getNumero();
		Integer numero2 = o2.getNumero();
		return numero1.compareTo(numero2);
	}

}

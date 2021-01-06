package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenCompra implements Comparator <Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		Integer precio1 = o1.getPrecio();
		Integer precio2 = o2.getPrecio();
		return precio1.compareTo(precio2);
	}

}

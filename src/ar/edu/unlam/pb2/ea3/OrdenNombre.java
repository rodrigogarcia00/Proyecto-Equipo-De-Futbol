package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenNombre implements Comparator <Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		String nombre1 = o1.getNombre();
		String nombre2 = o2.getNombre();
		return nombre1.compareTo(nombre2);
	}

}

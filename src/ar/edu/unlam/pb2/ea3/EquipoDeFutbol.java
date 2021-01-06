package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol{
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}
	
	public EquipoDeFutbol(String nombre, Comparator ordenamiento) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>(ordenamiento);
	}

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException{
		if(jugadores.size()>=23) {
			throw new CapacidadMaximaException("Se excedio la capacidad maxima de jugadores");
		}
			if(jugadores.contains(jugador)) {
				throw new JugadorDuplicadoException("El jugador a agregar ya se encuentra en el equipo");
			}
		
		jugadores.add(jugador);
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadorInexistenteException {
	if(jugadores.contains(saliente)) {
		jugadores.remove(saliente);
	}else {
		throw new JugadorInexistenteException("El jugador a salir no existe en el equipo");
	}
	return jugadores.add(entrante);
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		OrdenNombre orden = new OrdenNombre();
		TreeSet <Jugador> ordenadosPorNombre = new TreeSet<>(orden);
		ordenadosPorNombre.addAll(jugadores);
		return ordenadosPorNombre;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		OrdenCompra orden= new OrdenCompra();
		TreeSet <Jugador> ordenadosPorCompra = new TreeSet<>(orden);
		ordenadosPorCompra.addAll(jugadores);
		return ordenadosPorCompra;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		OrdenNumeroCamiseta orden= new OrdenNumeroCamiseta();
		TreeSet <Jugador> ordenadosPorNumero = new TreeSet <>(orden);
		ordenadosPorNumero.addAll(jugadores);
		return ordenadosPorNumero;
	}

	private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = new TreeSet<>(criterioDeOrdenacion);
		equipoOrdenado.addAll(jugadores);
			return equipoOrdenado;

	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}

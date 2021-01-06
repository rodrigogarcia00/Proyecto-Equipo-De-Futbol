package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;


public class EquipoDeFultbolTest {
	@Test
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		assertEquals(0,e.getJugadores().size());
	}
	@Test
	public void queSePuedanAgregarJugadorAlEquipo() throws CapacidadMaximaException, JugadorDuplicadoException {
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		
		e.agregarJugador(j1);
		assertEquals(1,e.getJugadores().size());
	}
	@Test (expected=JugadorDuplicadoException.class)
	public void queAlIntentarAgregarUnJugadorExistenetLanceExcepcion() throws CapacidadMaximaException, JugadorDuplicadoException{
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		e.agregarJugador(j1);
		e.agregarJugador(j1);
		
	}
	@Test (expected=CapacidadMaximaException.class)
	public void queAlIntentarAgregarCantidadExcesivaDeJugadoresLanceExcepcion() throws CapacidadMaximaException, JugadorDuplicadoException{
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		Jugador j2 = new Jugador(7,"ronald",20000);
		Jugador j3 = new Jugador(7,"ronal",20000);
		Jugador j4 = new Jugador(7,"rona",20000);
		Jugador j5 = new Jugador(7,"ron",20000);
		Jugador j6 = new Jugador(7,"ro",20000);
		Jugador j7 = new Jugador(7,"r",20000);
		Jugador j8 = new Jugador(7,"gabriel",20000);
		Jugador j9 = new Jugador(7,"jorge",20000);
		Jugador j10 = new Jugador(7,"carlos",20000);
		Jugador j11 = new Jugador(7,"jesus",20000);
		Jugador j12 = new Jugador(7,"dario",20000);
		Jugador j13 = new Jugador(7,"german",20000);
		Jugador j14 = new Jugador(7,"gustavo",20000);
		Jugador j15 = new Jugador(7,"cristiano",20000);
		Jugador j16 = new Jugador(7,"lionel",20000);
		Jugador j17 = new Jugador(7,"hugo",20000);
		Jugador j18 = new Jugador(7,"gonzalo",20000);
		Jugador j19 = new Jugador(7,"jonathan",20000);
		Jugador j20 = new Jugador(7,"ramiro",20000);
		Jugador j21 = new Jugador(7,"leonel",20000);
		Jugador j22 = new Jugador(7,"ariel",20000);
		Jugador j23 = new Jugador(7,"lucas",20000);
		Jugador demas = new Jugador(1,"tomas",231);
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		
		e.agregarJugador(j1);
		e.agregarJugador(j2);
		e.agregarJugador(j3);
		e.agregarJugador(j4);
		e.agregarJugador(j5);
		e.agregarJugador(j6);
		e.agregarJugador(j7);
		e.agregarJugador(j8);
		e.agregarJugador(j9);
		e.agregarJugador(j10);
		e.agregarJugador(j11);
		e.agregarJugador(j12);
		e.agregarJugador(j13);
		e.agregarJugador(j14);
		e.agregarJugador(j15);
		e.agregarJugador(j16);
		e.agregarJugador(j17);
		e.agregarJugador(j18);
		e.agregarJugador(j19);
		e.agregarJugador(j20);
		e.agregarJugador(j21);
		e.agregarJugador(j22);
		e.agregarJugador(j23);
		e.agregarJugador(demas);
		
	}
	@Test
	public void queSePuedaCambiarUnJugador() throws CapacidadMaximaException, JugadorDuplicadoException, JugadorInexistenteException{
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		Jugador j2 = new Jugador(10,"lionel",50000);
		Jugador entrante = new Jugador(11,"andres",50000);
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		
		e.agregarJugador(j1);
		e.agregarJugador(j2);
		assertTrue(e.cambiarJugador(j1, entrante));
		
		Iterator <Jugador> it = e.getJugadores().iterator();
		Integer x=1;
		while(it.hasNext()) {
			Jugador j = it.next();
			switch (x) {
			case 1:	assertEquals("andres",j.getNombre());
				x++;
				break;

			case 2:	assertEquals("lionel",j.getNombre());
			x++;
				break;
			}
		}
	}
	@Test (expected=JugadorInexistenteException.class)
	public void queAlCambiarUnJugadorInexistenteLanceExcepcion() throws CapacidadMaximaException, JugadorInexistenteException{
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		Jugador j2 = new Jugador(10,"lionel",50000);
		Jugador j3 = new Jugador(11,"andres",50000);
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos");
		
		
		try {
			e.agregarJugador(j2);
		} catch (JugadorDuplicadoException e1) {
	
			e1.printStackTrace();
		}
		e.cambiarJugador(j1, j3);
		
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNombre() throws CapacidadMaximaException, JugadorDuplicadoException{
		Jugador j1 = new Jugador(7,"ronaldo",20000);
		Jugador j2 = new Jugador(7,"ronald",20000);
		Jugador j3 = new Jugador(7,"ronal",20000);
		Jugador j4 = new Jugador(7,"rona",20000);
		Jugador j5 = new Jugador(7,"ron",20000);
		Jugador j6 = new Jugador(7,"ro",20000);
		Jugador j7 = new Jugador(7,"r",20000);
		Jugador j8 = new Jugador(7,"gabriel",20000);
		Jugador j9 = new Jugador(7,"jorge",20000);
		Jugador j10 = new Jugador(7,"carlos",20000);
		Jugador j11 = new Jugador(7,"jesus",20000);
		Jugador j12 = new Jugador(7,"dario",20000);
		Jugador j13 = new Jugador(7,"german",20000);
		Jugador j14 = new Jugador(7,"gustavo",20000);
		Jugador j15 = new Jugador(7,"cristiano",20000);
		Jugador j16 = new Jugador(7,"lionel",20000);
		Jugador j17 = new Jugador(7,"hugo",20000);
		Jugador j18 = new Jugador(7,"gonzalo",20000);
		Jugador j19 = new Jugador(7,"jonathan",20000);
		Jugador j20 = new Jugador(7,"ramiro",20000);
		Jugador j21 = new Jugador(7,"leonel",20000);
		Jugador j22 = new Jugador(7,"ariel",20000);
		Jugador j23 = new Jugador(7,"lucas",20000);
		OrdenNombre orden = new OrdenNombre();
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos", orden);
		e.agregarJugador(j1);
		e.agregarJugador(j2);
		e.agregarJugador(j3);
		e.agregarJugador(j4);
		e.agregarJugador(j5);
		e.agregarJugador(j6);
		e.agregarJugador(j7);
		e.agregarJugador(j8);
		e.agregarJugador(j9);
		e.agregarJugador(j10);
		e.agregarJugador(j11);
		e.agregarJugador(j12);
		e.agregarJugador(j13);
		e.agregarJugador(j14);
		e.agregarJugador(j15);
		e.agregarJugador(j16);
		e.agregarJugador(j17);
		e.agregarJugador(j18);
		e.agregarJugador(j19);
		e.agregarJugador(j20);
		e.agregarJugador(j21);
		e.agregarJugador(j22);
		e.agregarJugador(j23);
		
		e.devolverPlanteOrdenadoPorNombreDeJugador();
		
		Iterator <Jugador> it = e.getJugadores().iterator();
		Integer x=1;
		while(it.hasNext()) {
			Jugador j = it.next();
			switch (x) {
			case 1:	assertEquals("ariel",j.getNombre());
				x++;
				break;

			case 2:	assertEquals("carlos",j.getNombre());
			x++;
				break;
			
			case 3:	assertEquals("cristiano",j.getNombre());
			x++;
			break;

			case 4:	assertEquals("dario",j.getNombre());
			x++;
			break;
			
			case 5:	assertEquals("gabriel",j.getNombre());
			x++;
			break;

			case 6:	assertEquals("german",j.getNombre());
			x++;
			break;
			
			case 7:	assertEquals("gonzalo",j.getNombre());
			x++;
			break;

			case 8:	assertEquals("gustavo",j.getNombre());
			x++;
			break;
			
			case 9:	assertEquals("hugo",j.getNombre());
			x++;
			break;

			case 10:	assertEquals("jesus",j.getNombre());
			x++;
			break;
			
			case 11:	assertEquals("jonathan",j.getNombre());
			x++;
			break;

			case 12:	assertEquals("jorge",j.getNombre());
			x++;
			break;
			case 13:	assertEquals("leonel",j.getNombre());
			x++;
			break;
			
			case 14:	assertEquals("lionel",j.getNombre());
			x++;
			break;
			
			case 15:	assertEquals("lucas",j.getNombre());
			x++;
			break;
			
			case 16:	assertEquals("r",j.getNombre());
			x++;
			break;
			
			case 17:	assertEquals("ramiro",j.getNombre());
			x++;
			break;
			
			case 18:	assertEquals("ro",j.getNombre());
			x++;
			break;
			
			case 19:	assertEquals("ron",j.getNombre());
			x++;
			break;
			
			case 20:	assertEquals("rona",j.getNombre());
			x++;
			break;
			
			case 21:	assertEquals("ronal",j.getNombre());
			x++;
			break;
			
			case 22:	assertEquals("ronald",j.getNombre());
			x++;
			break;
			
			case 23:	assertEquals("ronaldo",j.getNombre());
			x++;
			break;
			
			}
		}
		
		System.out.println();
		
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorPrecioDeCompra() throws CapacidadMaximaException, JugadorDuplicadoException{
		Jugador j1 = new Jugador(7,"ronaldo",1);
		Jugador j2 = new Jugador(7,"ronald",2);
		Jugador j3 = new Jugador(7,"ronal",3);
		Jugador j4 = new Jugador(7,"rona",4);
		Jugador j5 = new Jugador(7,"ron",5);
		Jugador j6 = new Jugador(7,"ro",6);
		Jugador j7 = new Jugador(7,"r",7);
		Jugador j8 = new Jugador(7,"gabriel",8);
		Jugador j9 = new Jugador(7,"jorge",9);
		Jugador j10 = new Jugador(7,"carlos",10);
		Jugador j11 = new Jugador(7,"jesus",11);
		Jugador j12 = new Jugador(7,"dario",12);
		Jugador j13 = new Jugador(7,"german",13);
		Jugador j14 = new Jugador(7,"gustavo",14);
		Jugador j15 = new Jugador(7,"cristiano",15);
		Jugador j16 = new Jugador(7,"lionel",16);
		Jugador j17 = new Jugador(7,"hugo",17);
		Jugador j18 = new Jugador(7,"gonzalo",18);
		Jugador j19 = new Jugador(7,"jonathan",19);
		Jugador j20 = new Jugador(7,"ramiro",20);
		Jugador j21 = new Jugador(7,"leonel",21);
		Jugador j22 = new Jugador(7,"ariel",22);
		Jugador j23 = new Jugador(7,"lucas",23);
		OrdenCompra orden = new OrdenCompra();
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos", orden);
		
		e.agregarJugador(j1);
		e.agregarJugador(j2);
		e.agregarJugador(j3);
		e.agregarJugador(j4);
		e.agregarJugador(j5);
		e.agregarJugador(j6);
		e.agregarJugador(j7);
		e.agregarJugador(j8);
		e.agregarJugador(j9);
		e.agregarJugador(j10);
		e.agregarJugador(j11);
		e.agregarJugador(j12);
		e.agregarJugador(j13);
		e.agregarJugador(j14);
		e.agregarJugador(j15);
		e.agregarJugador(j16);
		e.agregarJugador(j17);
		e.agregarJugador(j18);
		e.agregarJugador(j19);
		e.agregarJugador(j20);
		e.agregarJugador(j21);
		e.agregarJugador(j22);
		e.agregarJugador(j23);
		
		e.devolverPlanteOrdenadoPorPrecioDeCompraDeJugador();
		Iterator <Jugador> it = e.getJugadores().iterator();
		Integer x=1;
		while(it.hasNext()) {
			Jugador j = it.next();
			switch (x) {
			case 1:	assertEquals(1,j.getPrecio().intValue());
				x++;
				break;

			case 2:	assertEquals(2,j.getPrecio().intValue());
			x++;
				break;
			
			case 3:	assertEquals(3,j.getPrecio().intValue());
			x++;
			break;

			case 4:	assertEquals(4,j.getPrecio().intValue());
			x++;
			break;
			
			case 5:	assertEquals(5,j.getPrecio().intValue());
			x++;
			break;

			case 6:	assertEquals(6,j.getPrecio().intValue());
			x++;
			break;
			
			case 7:	assertEquals(7,j.getPrecio().intValue());
			x++;
			break;

			case 8:	assertEquals(8,j.getPrecio().intValue());
			x++;
			break;
			
			case 9:	assertEquals(9,j.getPrecio().intValue());
			x++;
			break;

			case 10:	assertEquals(10,j.getPrecio().intValue());
			x++;
			break;
			
			case 11:	assertEquals(11,j.getPrecio().intValue());
			x++;
			break;

			case 12:	assertEquals(12,j.getPrecio().intValue());
			x++;
			break;
			case 13:	assertEquals(13,j.getPrecio().intValue());
			x++;
			break;
			
			case 14:	assertEquals(14,j.getPrecio().intValue());
			x++;
			break;
			
			case 15:	assertEquals(15,j.getPrecio().intValue());
			x++;
			break;
			
			case 16:	assertEquals(16,j.getPrecio().intValue());
			x++;
			break;
			
			case 17:	assertEquals(17,j.getPrecio().intValue());
			x++;
			break;
			
			case 18:	assertEquals(18,j.getPrecio().intValue());
			x++;
			break;
			
			case 19:	assertEquals(19,j.getPrecio().intValue());
			x++;
			break;
			
			case 20:	assertEquals(20,j.getPrecio().intValue());
			x++;
			break;
			
			case 21:	assertEquals(21,j.getPrecio().intValue());
			x++;
			break;
			
			case 22:	assertEquals(22,j.getPrecio().intValue());
			x++;
			break;
			
			case 23:	assertEquals(23,j.getPrecio().intValue());
			x++;
			break;
			
			}
		}
		
		
	}
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNumeroDeCamiseta() throws CapacidadMaximaException, JugadorDuplicadoException{
		Jugador j1 = new Jugador(4,"ronaldo",20000);
		Jugador j2 = new Jugador(3,"ronald",20000);
		Jugador j3 = new Jugador(2,"ronal",20000);
		Jugador j4 = new Jugador(1,"rona",20000);
		Jugador j5 = new Jugador(5,"ron",20000);
		Jugador j6 = new Jugador(6,"ro",20000);
		Jugador j7 = new Jugador(7,"r",20000);
		Jugador j8 = new Jugador(8,"gabriel",20000);
		Jugador j9 = new Jugador(9,"jorge",20000);
		Jugador j10 = new Jugador(10,"carlos",20000);
		Jugador j11 = new Jugador(11,"jesus",20000);
		Jugador j12 = new Jugador(12,"dario",20000);
		Jugador j13 = new Jugador(13,"german",20000);
		Jugador j14 = new Jugador(14,"gustavo",20000);
		Jugador j15 = new Jugador(15,"cristiano",20000);
		Jugador j16 = new Jugador(16,"lionel",20000);
		Jugador j17 = new Jugador(17,"hugo",20000);
		Jugador j18 = new Jugador(18,"gonzalo",20000);
		Jugador j19 = new Jugador(19,"jonathan",20000);
		Jugador j20 = new Jugador(20,"ramiro",20000);
		Jugador j21 = new Jugador(21,"leonel",20000);
		Jugador j22 = new Jugador(22,"ariel",20000);
		Jugador j23 = new Jugador(23,"lucas",20000);
		OrdenNumeroCamiseta orden = new OrdenNumeroCamiseta();
		EquipoDeFutbol e = new EquipoDeFutbol("Los panchos", orden);
		
		e.agregarJugador(j1);
		e.agregarJugador(j2);
		e.agregarJugador(j3);
		e.agregarJugador(j4);
		e.agregarJugador(j5);
		e.agregarJugador(j6);
		e.agregarJugador(j7);
		e.agregarJugador(j8);
		e.agregarJugador(j9);
		e.agregarJugador(j10);
		e.agregarJugador(j11);
		e.agregarJugador(j12);
		e.agregarJugador(j13);
		e.agregarJugador(j14);
		e.agregarJugador(j15);
		e.agregarJugador(j16);
		e.agregarJugador(j17);
		e.agregarJugador(j18);
		e.agregarJugador(j19);
		e.agregarJugador(j20);
		e.agregarJugador(j21);
		e.agregarJugador(j22);
		e.agregarJugador(j23);
		
		e.devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador();

		Iterator <Jugador> it = e.getJugadores().iterator();
		Integer x=1;
		while(it.hasNext()) {
			Jugador j = it.next();
			switch (x) {
			case 1:	assertEquals(1,j.getNumero().intValue());
				x++;
				break;

			case 2:	assertEquals(2,j.getNumero().intValue());
			x++;
				break;
			
			case 3:	assertEquals(3,j.getNumero().intValue());
			x++;
			break;

			case 4:	assertEquals(4,j.getNumero().intValue());
			x++;
			break;
			
			case 5:	assertEquals(5,j.getNumero().intValue());
			x++;
			break;

			case 6:	assertEquals(6,j.getNumero().intValue());
			x++;
			break;
			
			case 7:	assertEquals(7,j.getNumero().intValue());
			x++;
			break;

			case 8:	assertEquals(8,j.getNumero().intValue());
			x++;
			break;
			
			case 9:	assertEquals(9,j.getNumero().intValue());
			x++;
			break;

			case 10:	assertEquals(10,j.getNumero().intValue());
			x++;
			break;
			
			case 11:	assertEquals(11,j.getNumero().intValue());
			x++;
			break;

			case 12:	assertEquals(12,j.getNumero().intValue());
			x++;
			break;
			case 13:	assertEquals(13,j.getNumero().intValue());
			x++;
			break;
			
			case 14:	assertEquals(14,j.getNumero().intValue());
			x++;
			break;
			
			case 15:	assertEquals(15,j.getNumero().intValue());
			x++;
			break;
			
			case 16:	assertEquals(16,j.getNumero().intValue());
			x++;
			break;
			
			case 17:	assertEquals(17,j.getNumero().intValue());
			x++;
			break;
			
			case 18:	assertEquals(18,j.getNumero().intValue());
			x++;
			break;
			
			case 19:	assertEquals(19,j.getNumero().intValue());
			x++;
			break;
			
			case 20:	assertEquals(20,j.getNumero().intValue());
			x++;
			break;
			
			case 21:	assertEquals(21,j.getNumero().intValue());
			x++;
			break;
			
			case 22:	assertEquals(22,j.getNumero().intValue());
			x++;
			break;
			
			case 23:	assertEquals(23,j.getNumero().intValue());
			x++;
			break;
			
			}
		}
}
}

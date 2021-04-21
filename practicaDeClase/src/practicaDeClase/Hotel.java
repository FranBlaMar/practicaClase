package practicaDeClase;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hotel {
	private ArrayList <Reserva> listaReservas;
	private LinkedList <Instalaciones> listaInstalaciones;
	
	
	public Hotel() {
		super();
		this.listaReservas = new ArrayList<Reserva>();
		this.listaInstalaciones = new LinkedList<Instalaciones> ();
	}
	
	public void inicializarHotel() {
		//For de 5 vueltas para crear 5 habitaciones simples
		for (int i = 0; i < 5;i++) {
			listaInstalaciones.add(new HaSimple ());
		}
		//For de 3 vueltas para crear 3 habitaciones dobles
		for (int i = 0; i < 3;i++) {
			listaInstalaciones.add(new HaDoble ());
		}
		//Creamos una suit
		listaInstalaciones.add(new HaSuit());
				
		//For de dos vueltas para crear dos salas de cada tipo
		for (int i = 0; i < 2;i++) {
			listaInstalaciones.add(new SaReuniones());
			listaInstalaciones.add(new SaCelebra());
		}
	}
	
	public String listarInstalaciones() {
		return listaInstalaciones.toString();
	}
	
	public void addReserva(Reserva r) {
		
	}
	
	public int calcularIngresosGenerados() {
		
	}
	
	public String listarReservaInstalaciones() {
		return listaReservas.toString();
	}
}

package practicaDeClase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Instalaciones {
	protected Persona dueñoReserva;
	protected int codigo;
	protected static int codigoSiguiente=1;
	protected int numeroAsistentes;
	protected static final double PRECIO = 10.75;
	protected double factorFijo;
	
	//Builder que otorga un codigo unico
	public Instalaciones() {
		super();
		this.codigo = codigoSiguiente;
		this.codigoSiguiente ++;
	}

	
	public Reserva reservar(LocalDate fechaini, LocalDate fechaFin, ArrayList<Persona> asistentes, int codigoSala, double precio) {
		//Obtenemos el numero de inquilinos
		this.numeroAsistentes = asistentes.size();
		//El dueño es el primero de la lista
		this.dueñoReserva = asistentes.get(0);
		//calculamos el precio
		double preci = precioReserva(fechaini,fechaFin, this.numeroAsistentes); 
		//devolvemos una reserva, para añadirla a Hotel
		return new Reserva (fechaini, fechaFin, asistentes, codigoSala, preci);
		
	}
	
	protected double precioReserva(LocalDate fechaini, LocalDate fechaFin, int inquilinos ) {
		long dias = ChronoUnit.DAYS.between(fechaini, fechaFin);
		return (inquilinos*dias) * PRECIO;
	}

	
	
	//Hashcode, equals y toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instalaciones other = (Instalaciones) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DueñoReserva: " + dueñoReserva + ", codigo: " + codigo + ", numeroAsistentes: "
				+ numeroAsistentes + ".";
	}
	
	
	
}

package practicaDeClase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class HaSimple extends Instalaciones{
	private static final int MAXINQUILINOS = 1;
	private static final double FACTOR = 1.15;
	
	//Constructor vacio, solo nos interesa que genere el codigo del padre
	public HaSimple() {
		super();
	}

	@Override
	public Reserva reservar(LocalDate fechaini, LocalDate fechaFin, ArrayList<Persona> asistentes, int codigoSala, double precio) {
		super.numeroAsistentes = asistentes.size();
		double preci = precioReserva(fechaini,fechaFin, super.numeroAsistentes); 
		return new Reserva (fechaini, fechaFin, asistentes, codigoSala, preci);
		
	}
	
	@Override
	protected double precioReserva(LocalDate fechaini, LocalDate fechaFin, int inquilinos ) {
		long dias = ChronoUnit.DAYS.between(fechaini, fechaFin);
		return (inquilinos*dias) * PRECIO * FACTOR;
	}
}

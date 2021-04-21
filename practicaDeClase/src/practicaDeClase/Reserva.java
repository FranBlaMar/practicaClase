package practicaDeClase;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
	private LocalDate fechaInicio;
	private LocalDate fechaFinreserva;
	ArrayList<Persona> asistentes;
	private int codigoSala;
	private double precio;
	
	//builder
	public Reserva(LocalDate fechaInicio, LocalDate fechaFinreserva, ArrayList<Persona> asistentes, int codigoSala, double precio) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinreserva = fechaFinreserva;
		this.asistentes = asistentes;
		this.codigoSala = codigoSala;
		this.precio = precio;
	}


	//HashCode y equals con el codigo de sala y la fecha de inicio
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoSala;
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
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
		Reserva other = (Reserva) obj;
		if (codigoSala != other.codigoSala)
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		return true;
	}

	//ToString
	@Override
	public String toString() {
		return "Reserva con fecha de inici: " + fechaInicio + ", fecha Fin: " + fechaFinreserva + ", asistentes: "
				+ asistentes + ", codigoSala:" + codigoSala + ". ";
	}
	
	
}

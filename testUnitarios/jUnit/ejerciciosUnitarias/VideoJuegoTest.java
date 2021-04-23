package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VideoJuegoTest {
	private Videojuego v;
	
	@BeforeEach
	public void init() {
	 v = new Videojuego();
	}
	
	@Test
	void testEntregar_Devolver_isEntregado() {
		
		assertEquals(false,v.isEntregado());
		v.entregar();
		assertEquals(true,v.isEntregado());
		v.devolver();
		assertEquals(false,v.isEntregado());
		
	}

	@Test
	void testGetsYSets() {
		v.setcompañia("EA");
		assertEquals("EA",v.getcompañia());
		v.setGenero("Shooter");
		assertEquals("Shooter",v.getGenero());
		v.setHorasEstimadas(50);
		assertEquals(50,v.getHorasEstimadas());
		v.setTitulo("Final Fantasy");
		assertEquals("Final Fantasy",v.getTitulo());
	}
	
	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

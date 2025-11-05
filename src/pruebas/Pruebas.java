package pruebas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import logica.Parcial;

public class Pruebas {
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		parcial = new Parcial();
	}
	
	@Test
	public void testDosSoluciones() throws Exception {
		double[] soluciones = parcial.calcularSoluciones(1, -5, 6);
		assertEquals(2, soluciones.length);
		assertTrue((soluciones[0] == 3.0 && soluciones[1] == 2.0) || (soluciones[0] == 2.0 && soluciones[1] == 3.0));
	}
	
	@Test
	public void testUnaSolucion() throws Exception {
		double[] soluciones = parcial.calcularSoluciones(1, -4, 4);
		assertEquals(1, soluciones.length);
		assertEquals(2.0, soluciones[0]);
	}
	
	@Test
	public void testSinSolucion() {
		Exception exception = assertThrows(Exception.class, () -> {
			parcial.calcularSoluciones(1, 2, 5);
		});
		assertEquals("No hay solucion real", exception.getMessage());
	}
	
	@Test
	public void testCoeficienteACero() {
		assertThrows(Exception.class, () -> this.parcial.calcularSoluciones(0,0,0));	
	}

}

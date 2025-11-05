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
		double[] soluciones = parcial.calcularSoluciones(1, 5, 1);
		assertEquals(2, soluciones.length);
		assertTrue((soluciones[0] == -0.20871215252208009 && soluciones[1] == -4.7912878474779195) || (soluciones[0] == -4.7912878474779195 && soluciones[1] == -0.20871215252208009));
	}
	
	@Test
	public void testUnaSolucion() throws Exception {
		double[] soluciones = parcial.calcularSoluciones(2, 4, 2);
		assertEquals(1, soluciones.length);
		assertEquals(-1, soluciones[0]);
	}
	
	@Test
	public void testSinSolucion() {
		Exception exception = assertThrows(Exception.class, () -> {
			parcial.calcularSoluciones(1, 2, 5);
		});
		assertEquals("No hay solucion real, la expresion a resolver tiene una raiz negativa (solucion imaginaria o compleja)", exception.getMessage());
	}
	
	@Test
	public void testCoeficienteACero() {
		assertThrows(Exception.class, () -> this.parcial.calcularSoluciones(0,0,0));	
	}

}

package presentacion;

import logica.Parcial;

public class Principal {
	public static void main(String[] args) {
		Parcial parcial = new Parcial();
		
		try {
			int a = 0;
			int b = -5;
			int c = 6;
			double[] soluciones = parcial.calcularSoluciones(a, b, c);
			if (soluciones.length == 2) {
				System.out.println("Dos soluciones: " + soluciones[0] + " y " + soluciones[1]);
			} else if (soluciones.length == 1) {
				System.out.println("Una solucion: " + soluciones[0]);
			}
		} catch (Exception e) {
			System.out.println("No se pudo resolver: " + e.getMessage());
			
		}
	
	try {
		int a = 1;
		int b = 5;
		int c = 1;
		double[] soluciones = parcial.calcularSoluciones(a, b, c);
		if (soluciones.length == 2) {
			System.out.println("Dos soluciones: " + soluciones[0] + " y " + soluciones[1]);
		} else if (soluciones.length == 1) {
			System.out.println("Una solucion: " + soluciones[0]);
		}
	} catch (Exception e) {
		System.out.println("No se pudo resolver: " + e.getMessage());
		
	}
	try {
		int a = 2;
		int b = 4;
		int c = 2;
		double[] soluciones = parcial.calcularSoluciones(a, b, c);
		if (soluciones.length == 2) {
			System.out.println("Dos soluciones: " + soluciones[0] + " y " + soluciones[1]);
		} else if (soluciones.length == 1) {
			System.out.println("Una solucion: " + soluciones[0]);
		}
	} catch (Exception e) {
		System.out.println("No se pudo resolver: " + e.getMessage());
	}
	
	try {
		int a = 10;
		int b = 1;
		int c = 10;
		double[] soluciones = parcial.calcularSoluciones(a, b, c);
		if (soluciones.length == 2) {
			System.out.println("Dos soluciones: " + soluciones[0] + " y " + soluciones[1]);
		} else if (soluciones.length == 1) {
			System.out.println("Una solucion: " + soluciones[0]);
		}
	} catch (Exception e) {
		System.out.println("No se pudo resolver: " + e.getMessage());
}
	
	
	}}
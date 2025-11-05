package logica;

public class Parcial {
	public double [] calcularSoluciones(double a, double b, double c) throws Exception {
		if (a == 0) {
			throw new Exception("Entrada inválida, el coeficiente a no puede ser igual a 0 para el ejercicio (Solo ecuaciones de segundo orden)");}
		
		double dentroRaiz = (double)(Math.pow(b,2)-(4*a*c));
		
		if (dentroRaiz < 0) {
			throw new Exception("No hay solucion real, la expresion a resolver tiene una raiz negativa (solucion imaginaria o compleja)"); }
		
		else if (dentroRaiz == 0) {
			return new double[] {(double)-b/(2*a)};}
		
		else {
			double sol1 = (-b + Math.sqrt(dentroRaiz))/(2*a);
			double sol2 = (-b - Math.sqrt(dentroRaiz))/(2*a);
			return new double[] {sol1, sol2};}
}
}

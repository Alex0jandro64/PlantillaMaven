package it.pkg;

import java.it.pkg.InputMismatchException;
import java.it.pkg.Scanner;

public class Utilidades {
	/**
	 * Metodo que captura y devuelve una opcion entre los valores minimos y maximos
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public int capturarOpcion(int minimo, int maximo) {
		Scanner leerCapturaOpcion = new Scanner(System.in);
		int opcion;
		
		while (true) {
            try {
                opcion = leerCapturaOpcion.nextInt();

                if (opcion < minimo || opcion > maximo) {
                    System.out.println("Número fuera de rango. Intente de nuevo.");
                } else {
                    break; // Salir del bucle si se ingresó un número válido
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
                leerCapturaOpcion.next(); // Limpiar el búfer de entrada
            }
        }
		leerCapturaOpcion.close();
		return opcion;
	}
}

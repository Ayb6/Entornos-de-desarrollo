package com.entornos.ayyoub.poligonos.main;

import com.entornos.ayyoub.poligonos.figuras.Circulo;
import com.entornos.ayyoub.poligonos.figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo (5, 10);
		/**
		 * Crear un array con cinco circulos con radio aleatorio y comprobar la salida del depurador. Crearlos con un bucle. Poner en el FOR.		
		 */
		
		Circulo circulos[] = new Circulo[5];
		
		for (int i=0; i<circulos.length; i++) {
			circulos[i] = new Circulo();
		}
	}

}

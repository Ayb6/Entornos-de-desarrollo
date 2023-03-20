package com.entornos.ayyoub.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear un circulo dado el radio 
 * y para crear un circulo con un radio aleatorio entero entre 1 y 10. Contiene metodos 
 * para calcular el area y el perimetro.
 * 
 * @author ayyub
 *
 */
public class Circulo {

	int radio;
	
	 /**
     * Crea un circulo con el radio especificado.
     *
     * @param radio el radio del circulo
     * 
     */
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	/**
	 * Crea un circulo con un radio aleatorio
	 * 
	 */
	public Circulo() {
		Random numeroAleatorio = new Random();
		this.radio= numeroAleatorio.nextInt(10)+1;
	}
	
	
	/**
	 * Calcula el area del circulo
	 * @return el area del circulo
	 */
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	/**
	 * Calcula el perimetro del circulo
	 * @return el perimetro del circulo
	 */
	public double perimetro() {
		return 2*Math.PI*radio;
	}
	
	/**
	 * Getter para obtener radio
	 * @return radio
	 */
	public int getRadio () {
		return this.radio;
	}
	
	/**
	 * Setter para establecer un radio
	 * @param radio
	 */
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	/**
	 * Metodo toString para representar el circulo
	 */
	public String toString() {
		String res ="";
		res+="Circulo con radio: "+this.radio+"\n";
		res+="Circulo con area: "+area()+"\n";
		res+="Circulo con perimetro: "+perimetro()+"\n";
		return res;
	}
}

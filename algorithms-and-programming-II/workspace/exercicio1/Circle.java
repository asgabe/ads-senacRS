package com.senac.exercicio1;

public class Circle {
	private double a;
	private double c;
	private double r;
	
	public void setRaio(double raio) {
		this.r = raio;
		this.setup();
	}

	private void area() {
		this.a = 3.14 * Math.pow(this.r, 2);
	}
	
	private void circunferencia() {
		this.c = 2 * 3.14 * this.r;
	}

	private void setup() {
		this.area();
		this.circunferencia();
	}

	public String toString() {
		return "Área " + this.a + "\nCircunferência " +  this.c;
	}

}
package com.senac.exercicio1;

import com.senac.SimpleJava.Console;

public class Main {
	public void run() {
		Circle circle;
		circle = new Circle();
		
		
		double x1 = 3;
		double y1 = 4;

		double x2 = 6;
		double y2 = 8;

		double r1 = 3;
		double r2 = 5;
		
		circle.setRaio(r1);
		Console.println(circle.toString());
		circle.setRaio(r2);
		Console.println(circle.toString());
		
		double dx = Math.pow(x2-x1, 2) + Math.pow(y1-y2, 2);
		double dy = Math.pow(r1 + r2, 2);
		
		if(dx < dy) {
			Console.println("Collision");
		} else {
			Console.println("Not Collision");
		}

	}
}

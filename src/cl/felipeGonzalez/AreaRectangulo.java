package cl.felipeGonzalez;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		double base = 0.0;
		double altura = 0.0;
		double area = 0.0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ingrese la base del Rectangulo:");
			base = sc.nextDouble();
			if (base <= 0) {
				System.out.println("Dato Invalido");

			}

		} while (base <= 0);

		do {
			System.out.println("ingrese altura del Rectangulo:");
			altura = sc.nextDouble();
			if (base <= 0) {
				System.out.println("Dato Invalido");
			}

		} while (altura <= 0);

		area = base * altura;
		
		System.out.println("el area del rectangulo es: " +area);

	}
}

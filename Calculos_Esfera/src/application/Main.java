package application;

import java.util.Scanner;

import entities.Calculo;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		double raio = ler.nextDouble();

		double c = Calculo.circunferencia(raio);
		double v = Calculo.volume(raio);

		System.out.printf("Circunferência: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", Calculo.PI);

	}

}

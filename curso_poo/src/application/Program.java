package application;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args)
	{	
		Scanner ler = new Scanner(System.in);
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		double p;
		System.out.println("Entre com os valores do triangulo X: ");
		x.a = ler.nextDouble();
		x.b = ler.nextDouble();
		x.c= ler.nextDouble();
		System.out.println("Entre com os valores do triangulo Y: ");
		y.a = ler.nextDouble();
		y.b = ler.nextDouble();
		y.c = ler.nextDouble();
		
		
		double areaX = x.calcularArea();
		
		double areaY = y.calcularArea();
		System.out.printf("Triangulo X: %.4f%n", areaX);
		System.out.printf("Triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY)
		{
			System.out.println("X é maior");
		}
		else if (areaY > areaX)
		{
			System.out.println("Y é maior");
		}
		else
		{
			System.out.println("Áreas iguais");
		}
		
		
	}

}

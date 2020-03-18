package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Rectangle;
import entities.Circle;

import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		System.out.println("Enter the number of shapes: ");
		int n = ler.nextInt();
		List<Shape> shapes = new ArrayList<>();
		
		for (int i=1; i<=n;i++)
		{
			System.out.println("Shape #" + i + "data: ");
			System.out.println("REctangle or Circle(r/c)?");
			char ch = ler.next().charAt(0);
			System.out.println("Color(BLACK/BLUE/RED): ");
			Color color = Color.valueOf(ler.next());
			if (ch == 'r')
			{
				System.out.println("Width: ");
				double width = ler.nextDouble();
				System.out.println("Height: ");
				double height = ler.nextDouble();
				shapes.add(new Rectangle(color, width, height));  
			}
			else
			{
				System.out.println("Radius: ");
				double radius = ler.nextDouble();
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape: shapes)
		{
			System.out.printf(String.format("%.2f%n", shape.area()));
		}
		ler.close();
	}

}

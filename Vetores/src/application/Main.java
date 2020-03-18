package application;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		System.out.println("Quantos produtos serão contados? ");
		int n = ler.nextInt();		
		Produto[] vetor = new Produto[n];
		for (int i=0;i<vetor.length;i++)
		{
			ler.nextLine();
			System.out.println("Informe o nome do produto: ");
			String nome = ler.nextLine();
			System.out.println("Informe o preco do produto: ");
			double preco = ler.nextDouble();
			vetor[i] = new Produto(nome,preco);
		}
		
		double soma=0;
		for(int i=0;i<vetor.length;i++)
		{
			soma += vetor[i].getPreco();
		}
		
		double media = soma/n;
		System.out.printf("A media dos valores é igual a %.2f%n",media);
		
		ler.close();
	}

}

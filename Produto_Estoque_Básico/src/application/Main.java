package application;
import java.util.Scanner;
import entities.Produto;

public class Main {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);				
		System.out.println("Informe o nome do produto: ");
		String nome = ler.nextLine();
		System.out.print("Informe preco do produto: ");
		double preco = ler.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		int qt = ler.nextInt();
		Produto p = new Produto(nome, preco, qt);
		System.out.println();
		System.out.println("Dados do produto: \n" + p);
		System.out.println("Entre com os produtos a serem adicionados: ");
		int quantidade = ler.nextInt();
		p.adicionarProdutos(quantidade);		
		System.out.println("Dados atualizados: ");
		System.out.println(p);
		System.out.println("Entre com os produtos a serem removidos: ");
		quantidade = ler.nextInt();
		p.removerProdutos(quantidade);
		System.out.println("Dados atualizados");
		System.out.println(p);
		ler.close();
	}

}

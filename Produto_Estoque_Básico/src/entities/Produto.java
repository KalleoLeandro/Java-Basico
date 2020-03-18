package entities;

public class Produto 
{
	private String nome;
	private double preco;
	private int qt;
	
	public Produto()
	{
		
	}
	
	public Produto(String nome, double preco, int qt)
	{
		this.nome = nome;
		this.preco = preco;
		this.qt = qt;
	}
	
	public Produto(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	public double getPreco()
	{
		return preco;
	}
	
	public void  setQt(int qt)
	{
		this.qt = qt;
	}
	
	public int getQt()
	{
		return qt;
	}	
	
	public double valorTotalEmEstoque()
	{
		return preco*qt;
	}
	
	public void adicionarProdutos(int qt)
	{
		this.qt += qt;
	}
	
	public void removerProdutos(int qt)
	{
		this.qt -= qt;
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + " " +
				"Preço: R$" + String.format("%.2f" , this.preco) + " " +
				"Quantidade: "+this.qt + " "+
				"Total: R$" + String.format("%.2f" ,valorTotalEmEstoque());
	}
}

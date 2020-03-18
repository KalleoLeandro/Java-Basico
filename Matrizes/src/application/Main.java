package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		int [][] mat = new int [n][n];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j] = ler.nextInt();
			}
		}
		
		ler.close();
	}

}

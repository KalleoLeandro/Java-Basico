package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main 
{
	public static void main(String[] args)
	{
		List <String> list = new ArrayList<>();
		list.add("Kalleo");
		list.add("Leandro");
		list.add("dos Santos");
		list.add("Leal");
		list.add(2,"NULL");
		System.out.println(list.size());
		for (String x: list)
		{
			System.out.print(x + " ");
		}
		list.remove("NULL");
		System.out.println(" ");
		for (String x: list)
		{
			System.out.print(x + " ");
		}
		
		List<String> result = list.stream().filter(x-> x.charAt(0)== 'L').collect(Collectors.toList());
		System.out.println(" ");
		for(String x:result)
		{
			System.out.println(x);
		}		
		System.out.println(" ");
		
		String name = list.stream().filter(x-> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}
}
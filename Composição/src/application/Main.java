package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Entre com o nome do departamento: ");
		String departmentName = ler.nextLine(); 
		System.out.println("Entre com o nome do funcionário: ");
		String workerName = ler.nextLine();
		System.out.println("Entre com o nível do funcionário: ");
		String workerLevel = ler.nextLine();
		System.out.print("Entre com o salário base do funcionário: ");
		double baseSalary = ler.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		System.out.println("Quantos contratos esse funcionário possui? ");
		int n = ler.nextInt();		
		for (int i=1; i<=n;i++)
		{
			System.out.println("Entre com o contrato #" + i + " :");
			System.out.println("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(ler.next());
			System.out.print("Valor por hora: R$");
			double valuePerHour = ler.nextDouble();
			System.out.print("Duração(horas): ");
			int hours = ler.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);	
		}
		
		System.out.println();
		System.out.println("Entre com o mes e ano (MM/YYYY)");
		String monthAndYear = ler.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("------------------------");
		System.out.println("Nome:" + worker.getName());
		System.out.println("Departamento:" + worker.getDepartment().getName());
		System.out.println("Valor a receber em " + monthAndYear + " : " + "R$"+ String.format("%.2f", worker.income(year,month)));
		ler.close();

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import TaxPayer_OO.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> person = new ArrayList<>();
		TaxPayer tax = new TaxPayer();

		System.out.print("Quantos contribuintes você vai digitar?: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("\nDigite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com salário:");
			double salary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço:");
			double serviceProvision = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital:");
			double capitalGain = sc.nextDouble();
			System.out.print("Gastos médicos:");
			double medicalExpenses = sc.nextDouble();
			System.out.print("Gastos educacionais:");
			double educationExpenses = sc.nextDouble();

			tax = new TaxPayer(salary, serviceProvision, capitalGain, medicalExpenses, educationExpenses);
			person.add(tax);

		}

		for (int i = 0; i < N; i++) {
		
			System.out.println("\nResumo do "+(i+1) +"o contribuinte:" + person.get(i));
		}

		sc.close();
	}

}

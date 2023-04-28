import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--------------- Testes 1 --------------");

		int y = 2;
		double x = 8.1231231;
		
		System.out.printf("%.2f%n", x);
		System.out.println(y);

		System.out.println("Bom dia");
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		System.out.println("RESULTADO = " + x + " metros");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		
		
		
		//Atividade feita na aula 23 - Saída de dados em Java.
		
		System.out.println("");
		System.out.println("--------------- Atividade 1 --------------");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
		System.out.printf(" Nome: %s%n Idade: %d anos %n Renda: %.2f reais %n", nome, idade, renda);
		
		
		
		//Atividade feita na aula 23 - Saída de dados em Java.
		
		System.out.println("");
		System.out.println("--------------- Atividade 2 --------------");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println(" Products:");
		System.out.printf("  %s, which price is %.2f%n", product1, price1);
		System.out.printf("  %s, which price is %.2f%n%n", product2, price2);
		
		System.out.printf("  Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("  Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("  Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("  US  decimal point: %.3f%n", measure);
		
	}

}

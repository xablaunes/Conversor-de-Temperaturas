import java.util.Scanner;

public class conversortemperatura {
    public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
	
		int temperatura1;
		int temperatura2;
		double valor;
	 
		System.out.print("Este programa irá lhe perguntar duas temperatures e os valores delas.\nApós isso, irá convertar o valor da primeira temperatura para o valor da segunda temperatura.");	
			
		try {

				Thread.sleep(3000); 
			} catch (InterruptedException e) {

			e.printStackTrace();
		
		}
		
		System.out.print("\n\nATENÇÃO!\ncaso deseje finalizar o programa, basta digitar o numero 4 na hora que perguntar qual a primeira ou segunda temperatura.");
		
		try {

				Thread.sleep(3000); 
			} catch (InterruptedException e) {

			e.printStackTrace();
		
		}
		
		while (true) {
		
		System.out.println();
		System.out.print("\nInforme a primeira temperatura (Digite 1 para kelvin, 2 para fahrenheit e 3 para celsius): ");
		temperatura1 = scan.nextInt();

		System.out.print("Digite a segunda temperatura (Digite 1 para kelvin, 2 para fahrenheit e 3 para celsius): ");
		temperatura2 = scan.nextInt();
	
		if (temperatura1 == 1 && temperatura2 == 1 || temperatura1 == 2 && temperatura2 == 2 || temperatura1 == 3 && temperatura2 == 3) {
			System.out.print("Não há como realizar a conversão pois você informou duas temperaturas iguais. As temperaturas devem ser distintas.");
		}	
		
		System.out.print("Informe o valor da temperatura: ");
		valor = scan.nextDouble();
	
		if (temperatura1 == 3 && temperatura2 == 2) {
			double resultado = valor*1.8+32;
		
			System.out.printf("%.2f celsius convertidos para fahrenheit é igual: %.2f", valor, resultado);
		}
		
		if (temperatura1 == 3 && temperatura2 == 1) {
			double resultado = valor+273;
			
			System.out.printf("%.2f celsius convertidos para kelvin é igual: %.2f", valor, resultado);
		}
		
		else if (temperatura1 == 2 && temperatura2 == 3) {
			double resultado = (valor-32)/1.8;
			
			System.out.printf("%.2f fahrenheit convertidos para celsius é igual: %.2f", valor, resultado);
		}

		else if (temperatura1 == 2 && temperatura2 == 1) {
			double resultado = (valor+459.67)*5/9;
			
			System.out.printf("%.2f fahrenheit convertidos para kelvin é igual: %.2f", valor, resultado);
		}
			
		else if (temperatura1 == 1 && temperatura2 == 3) {
			double resultado = valor-273.15;
			
			System.out.printf("%.2f kelvin convertidos para celsius é igual: %.2f", valor, resultado);
		}
		
		else if (temperatura1 == 1 && temperatura2 == 2) {
			double resultado = (valor-273.15)*9/5+32;
			
			System.out.printf("%.2f kelvin convertidos para fahrenheit é igual: %.2f", valor, resultado);
		}

		
		else if (temperatura1 != 1 || temperatura1 != 2 || temperatura1 != 3 || temperatura2 != 1 || temperatura2 != 2 || temperatura2 != 3) {
		
		 System.out.print("Número de temperatura Inválido! Digite apenas 1 ou 2 ou 3.");
			
		}
	}
  }
}

	
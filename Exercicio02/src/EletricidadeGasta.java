import java.util.Scanner;

public class EletricidadeGasta {
	public static void main(String[] args) {
		Scanner contaDeLuz;
		contaDeLuz = new Scanner(System.in);
		int salarioMin, valorDoKw, valorEmReais, valorDoDesc, valorComDesc;

		System.out.println(" Digite o Salário Minimo:");
		salarioMin = contaDeLuz.nextInt();

		valorEmReais = salarioMin / 7;
		System.out.println("Valor a ser pago é R$ " + valorEmReais + "Reais");

		valorDoKw = valorEmReais / 100;
		System.out.println("Valor de cada KW é " + valorDoKw + " KW");
		
		valorDoDesc=valorEmReais/10;
		valorComDesc=valorEmReais-valorDoDesc;
		System.out.println("Valor com desconto é R$" + valorComDesc + " Reais");
		

	}

}

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		int resto;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		int saque;
		
		System.out.println(" Digite o valor do seu saque");
		saque = teclado.nextInt();

		nota100 = saque / 100;
		resto = saque % 100;
		nota50 = resto / 50;
		resto = resto % 50;
		nota20 = resto / 20;
		resto = resto % 20;
		nota10 = resto / 10;
		resto = resto % 10;
		nota5 = resto / 5;
		resto = resto % 5;
		nota2 = resto / 2;
		resto = resto % 2;
		nota1 = resto / 1;
		resto = resto % 1;

		System.out.println("Sairá do caixa " + nota100 + " nota de R$100");
		System.out.println("Sairá do caixa " + nota50 + " nota de R$50");
		System.out.println("Sairá do caixa " + nota20 + " nota de R$20");
		System.out.println("Sairá do caixa " + nota10 + " nota de R$10");
		System.out.println("Sairá do caixa " + nota5 + " nota de R$5");
		System.out.println("Sairá do caixa " + nota2 + " nota de R$2");
		System.out.println("Sairá do caixa " + nota1 + " nota de R$1");

	}

}

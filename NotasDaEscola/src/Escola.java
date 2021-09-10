import java.util.Scanner;

public class Escola {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite nota 1:");
		n1 = teclado.nextDouble();

		System.out.println("Digite nota 2:");
		n2 = teclado.nextDouble();

		media = (n1 + n2) / 2;
		System.out.println("A média é: " + media);

		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
		} else {
			System.out.println("Infelizmente, você foi Reprovado. Estude mais!");
		}
	}
}

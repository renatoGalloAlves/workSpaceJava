import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite nota 1:");
		n1 = teclado.nextDouble();

		System.out.println("Digite nota 2:");
		n2 = teclado.nextDouble();

		media = (n1 + n2) / 2;
		System.out.println("A média é: " + media);

		if (media >= 9) {
			System.out.println("Parabéns, você foi aprovado com conceito A !");
		} else if (media >= 8 && media < 9) {
			System.out.println("Parabéns, você foi aprovado com conceito B !");
		} else if (media >= 7 && media < 8) {
			System.out.println("Parabéns, você foi aprovado com conceito C !");
		} else if (media >= 6 && media < 7) {
			System.out.println("Parabéns, você foi aprovado com conceito D !");
		} else if (media >= 5 && media < 6) {
			System.out.println("Parabéns, você foi aprovado com conceito E !");
		} else {
			System.out.println("Infelizmente, você foi Reprovado, com conceito F! Estude mais!");
		}
	}

}

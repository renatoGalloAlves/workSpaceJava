import java.util.Scanner;

public class Inversaonumerica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, n2, n1, numeroInvertido, resto;
		
		System.out.println(" Digite um numero de três digitos:");
		numero = teclado.nextInt();
		
		n2 = numero/100;
		resto = n2;
		System.out.println(resto);

	}
}
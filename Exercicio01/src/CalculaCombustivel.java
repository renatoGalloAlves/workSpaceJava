import java.util.Scanner;

public class CalculaCombustivel {
	public static void main(String[] args) {
		Scanner viagem;
		viagem = new Scanner(System.in);
		int qtdlitros, tempo, vel, kmporl;

		kmporl = 12;

		System.out.println(" Digite o tempo de viagem: (em horas)");
		tempo = viagem.nextInt();

		System.out.println(" Digite o velocidade da viagem: (em KM por hora)");
		vel = viagem.nextInt();

		int distancia;

		distancia = vel * tempo;
		System.out.println(" A distancia percorrida foi de " + distancia+ " Km");

		qtdlitros = distancia / kmporl;
		System.out.println(" A quantindade de combustivel gasta foi de " + qtdlitros + " Litros");

	}

}

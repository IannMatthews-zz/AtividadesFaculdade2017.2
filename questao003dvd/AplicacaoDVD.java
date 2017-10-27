package questao003dvd;

import java.util.Scanner;

public class AplicacaoDVD {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		Dvd dvd = new Dvd();
		boolean sair = false;

		while (!sair) {
			System.out.println("==============================");
			System.out.println("1) Liga");
			System.out.println("2) Desliga");
			System.out.println("3) Play");
			System.out.println("4) Stop");
			System.out.println("5) Pause");
			System.out.println("6) Vota");
			System.out.println("7) Avança");
			System.out.println("8) Sair");

			int opc = ler.nextInt();

			switch (opc) {
			case 1:
				dvd.liga();
				break;
			case 2:
				dvd.desliga();
				break;
			case 3:
				dvd.play();
				break;
			case 4:
				dvd.stop();
				break;
			case 5:
				dvd.pause();
				break;
			case 6:
				dvd.volta();
				break;
			case 7:
				dvd.avanca();
				break;
			default:
				System.out.println("Saindo");
				sair = true;
				break;
			}
		}
		ler.close();
	}
}

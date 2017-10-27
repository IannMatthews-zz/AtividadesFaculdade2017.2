package geometriaplana;

import java.util.Scanner;

public class AplicacaoTriangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a base do tri�ngulo: ");
		double base = Double.parseDouble(ler.nextLine());

		System.out.print("Digite a altura do tri�ngulo: ");
		double altura = Double.parseDouble(ler.nextLine());

		TrianguloRetangulo tri = new TrianguloRetangulo(base, altura);

		System.out.println("�rea: " + tri.area());
		System.out.println("Per�metro: " + tri.perimetro());
		ler.close();
	}
}

package geometriaplana;

import java.util.Scanner;

public class AplicacaoTriangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a base do triângulo: ");
		double base = Double.parseDouble(ler.nextLine());

		System.out.print("Digite a altura do triângulo: ");
		double altura = Double.parseDouble(ler.nextLine());

		TrianguloRetangulo tri = new TrianguloRetangulo(base, altura);

		System.out.println("Área: " + tri.area());
		System.out.println("Perímetro: " + tri.perimetro());
		ler.close();
	}
}

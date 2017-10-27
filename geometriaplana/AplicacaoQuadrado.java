package geometriaplana;

import java.util.Scanner;

public class AplicacaoQuadrado {

	public static void main(String[] args) {
		System.out.print("Digite o lado do quadrado: ");
		
		Scanner ler = new Scanner(System.in);
		double lado = Double.parseDouble(ler.nextLine());
		
		Quadrado quad = new Quadrado(lado);
		
		quad.desenha();
		System.out.println("Área: " + quad.area());
		System.out.println("Perímetro: " + quad.perimetro());
		System.out.println("Lado: " + quad.getLado());
		
	}

}

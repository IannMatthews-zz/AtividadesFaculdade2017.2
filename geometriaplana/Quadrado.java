package geometriaplana;

public class Quadrado implements IFormaGeometrica {
	private double lado;

	public Quadrado() {
	}

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}

	public void desenha() {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if(i == 0 || i == lado-1 || j == 0 || j == lado-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

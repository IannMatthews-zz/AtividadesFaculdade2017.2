package geometriaplana;

public class TrianguloRetangulo implements IFormaGeometrica {
	private double base;
	private double altura;
	private double hipotenusa;

	public TrianguloRetangulo() {
	}

	public TrianguloRetangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.hipotenusa = Math.sqrt((this.base * this.base) + (this.altura * this.altura));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	@Override
	public double area() {
		if(base > 0 && altura > 0 && hipotenusa > 0)
		{			
			return (base * altura) / 2;		
		}
		else
		{
			System.out.println("Triângulo inválido!");
			return -1;
		}
	}
	
	@Override
	public double perimetro() {
		if(base > 0 && altura > 0 && hipotenusa > 0)
		{			
			return base + altura + hipotenusa;
		}
		else
		{
			System.out.println("Triângulo inválido!");
			return -1;
		}
	}
}

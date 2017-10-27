// Codigo referente as questoes 1.16, 1.26 e 1.27

package questao001;

public class Empregado {
	// ATRIBUTOS
	private String nome;
	private String departamento;
	private double horasNormaisTrabalhadasNoMes;
	private double horasExtrasTrabalhadasNoMes;
	private double salarioPorHoraNormal;
	private double salarioPorHoraExtra;

	// GETTERS AND SETTERS
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getHorasNormaisTrabalhadasNoMes() {
		return horasNormaisTrabalhadasNoMes;
	}

	public void setHorasNormaisTrabalhadasNoMes(double horasNormaisTrabalhadasNoMes) {
		this.horasNormaisTrabalhadasNoMes = horasNormaisTrabalhadasNoMes;
	}

	public double getHorasExtrasTrabalhadasNoMes() {
		return horasExtrasTrabalhadasNoMes;
	}

	public void setHorasExtrasTrabalhadasNoMes(double horasExtrasTrabalhadasNoMes) {
		this.horasExtrasTrabalhadasNoMes = horasExtrasTrabalhadasNoMes;
	}

	public double getSalarioPorHoraNormal() {
		return this.salarioPorHoraNormal;
	}

	public void setSalarioPorHora(double salarioPorHoraNormal) {
		this.salarioPorHoraNormal = salarioPorHoraNormal;
	}

	public double getSalarioPorHoraExtra() {
		return salarioPorHoraExtra;
	}

	public void setSalarioPorHoraExtra(double salarioPorHoraExtra) {
		this.salarioPorHoraExtra = salarioPorHoraExtra;
	}

	// METODOS
	public void mostraDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println(this.getHorasNormaisTrabalhadasNoMes() + " horas normais trabalhadas no mês");
		System.out.println(this.getHorasExtrasTrabalhadasNoMes() + " horas extras trabalhadas no mês");
		System.out.println("Salário por hora normal: " + this.getSalarioPorHoraNormal());
		System.out.println("Salário por hora extra: " + this.getSalarioPorHoraExtra());
	}

	public double calculaSalarioMensal() {
		double salario = (this.getHorasNormaisTrabalhadasNoMes() * this.getSalarioPorHoraNormal())
				+ (this.getHorasExtrasTrabalhadasNoMes() * this.getSalarioPorHoraExtra());

		if (this.getDepartamento().equals("Diretoria")) {
			return salario * 1.1;
		} else {
			return salario;
		}
	}

}
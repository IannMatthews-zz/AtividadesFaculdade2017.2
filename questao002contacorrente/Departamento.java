package questao002contacorrente;

public class Departamento {
	private int codigo;
	private String nome;
	
	public Departamento(int codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
		else {
			System.out.println("C�digo inv�lido");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals(null) || nome.equals(""))
		{
			System.out.println("Nome inv�lido");
		}
		else {
			this.nome = nome;
		}
	}
	
	@Override
	public String toString() {
		String info = "C�digo: " + this.getCodigo() + "\nNome: " + this.getNome();
		return info;
	}
}

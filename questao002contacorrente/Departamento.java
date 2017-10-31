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
			System.out.println("Código inválido");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals(null) || nome.equals(""))
		{
			System.out.println("Nome inválido");
		}
		else {
			this.nome = nome;
		}
	}
	
	@Override
	public String toString() {
		String info = "Código: " + this.getCodigo() + "\nNome: " + this.getNome();
		return info;
	}
}

package questao002contacorrente;

public class ContaCorrente {
	// ATRIBUTOS
	private int numeroConta;
	private String correntista;
	private double saldo;

	// CONSTRUTORES
	public ContaCorrente(int numeroConta, String correntista) {
		this.setNumeroConta(numeroConta);
		this.setCorrentista(correntista);
	}

	// GETTERS AND SETTERS
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta > 0) {
			this.numeroConta = numeroConta;
		} else {
			System.out.println("N�mero inv�lido!");
		}
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		if (correntista != "" && correntista != null) {
			this.correntista = correntista;
		} else {
			System.out.println("Nome inv�lido!");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	// METODOS
	public void creditar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Dep�sito de R$" + valor + " realizado com sucesso!");
		} else {
			System.out.println("Valor inv�lido!");
		}
	}

	public void debitar(double valor) {
		if (valor > 0) {
			if (this.getSaldo() >= valor) {
				this.saldo -= valor;
				System.out.println("Saque de R$" + valor + " realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("S� � poss�vel debitar valores acima de 0");
		}
	}

	public void transferir(double valor, ContaCorrente c2) {
		if (c2 != null) {
			if (valor > 0) {
				if (this.saldo >= valor) {
					this.debitar(valor);
					c2.creditar(valor);
					System.out.println("Transfer�ncia de R$" + valor + " realizada com sucesso!");
				} else {
					System.out.println("Saldo insuficiente!");
				}
			} else {
				System.out.println("Valor deve ser maior que 0");
			}
		} else {
			System.out.println("Conta destinat�ria inv�lida!");
		}
	}
	
	
}

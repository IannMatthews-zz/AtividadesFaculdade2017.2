package questao002contacorrente;

public class RepositorioContasArray implements IRepositorio {
	private ContaCorrente contas[];

	public RepositorioContasArray(int tamanho) {
		contas = new ContaCorrente[tamanho];
	}

	public RepositorioContasArray(ContaCorrente[] contas) {
		this.contas = contas;
	}

	@Override
	public void adicionarConta(ContaCorrente c1) {
		int indice = repositorioCheio(); 
		if(indice >= 0) {
			contas[indice] = c1;
		}
	}

	private int repositorioCheio() {
		for (int i = 0; i < contas.length; i++) {
			if(contas[i] == null) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void removerConta(int numeroConta) {
		for(int i = 0; i < contas.length ; i++) {
			if(contas[i].getNumeroConta() == numeroConta) {
				contas[i] = null;
				break;
			}
		}
	}

	@Override
	public ContaCorrente BuscaContaNumero(int numeroConta) {
		for(ContaCorrente c1 : contas) {
			if(c1.getNumeroConta() == numeroConta) {
				return c1;
			}
		}
		return null;
	}

	@Override
	public boolean existe(ContaCorrente c1) {
		if(c1 == null) {
			return false;
		}
		for(ContaCorrente c2 : contas) {
			if(c2.equals(c1)) {
				return true;
			}
		}
		return false;
	}

}

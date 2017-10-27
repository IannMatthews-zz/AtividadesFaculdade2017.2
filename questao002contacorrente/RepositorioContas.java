package questao002contacorrente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContas implements IRepositorio{
	private List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

	@Override
	public void adicionarConta(ContaCorrente c1) {
		if (c1 != null && this.BuscaContaNumero(c1.getNumeroConta()) == null) {
			contas.add(c1);
		} else {
			System.out.println("Já existe conta com essa numeração!");
		}
	}

	@Override
	public void removerConta(int numeroConta) {
		boolean achou = false;

		ContaCorrente c1 = this.BuscaContaNumero(numeroConta);

		if (c1 != null) {
			contas.remove(c1);
			achou = true;
		}

		if (!achou) {
			System.out.println("Conta não encontrada!");
		}
	}

	@Override
	public ContaCorrente BuscaContaNumero(int numeroConta) {
		for (ContaCorrente c1 : contas) {
			if (c1.getNumeroConta() == numeroConta) {
				return c1;
			}
		}

		return null;
	}

	@Override
	public boolean existe(ContaCorrente c1) {
		if (c1 == null) {
			return false;
		}
		if (contas.contains(c1)) {
			return true;
		}
		return false;
	}

}

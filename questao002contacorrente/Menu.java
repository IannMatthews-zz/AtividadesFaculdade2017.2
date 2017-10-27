package questao002contacorrente;

import java.util.Scanner;

public class Menu {
	private Scanner ler = new Scanner(System.in);
	RepositorioContas repositorio = new RepositorioContas();

	/*
	 * public Menu(RepositorioContas repositorio) {
	 * 
	 * }
	 */

	public void inicial() {
		System.out.println("===================================");

		System.out.println("\tBanco Central");
		System.out.println("1) Criar conta");
		System.out.println("2) Apagar conta");
		System.out.println("3) Creditar");
		System.out.println("4) Debitar");
		System.out.println("5) Transferir");
		System.out.println("6) Detalhes");

		int opc = ler.nextInt();
		switch (opc) {
		case 1:
			this.criarConta();
			break;
		case 2:
			this.removerConta();
			break;
		case 3:
			this.creditar();
			break;
		case 4:
			this.debitar();
			break;
		case 5:
			this.transferir();
			break;
		case 6:
			this.detalhes();
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

	private int coletarNumeroConta() {
		System.out.println("Digite o número da conta: ");
		int numeroConta = ler.nextInt();
		return numeroConta;
	}

	private double coletarValor() {
		System.out.println("Digite o valor: ");
		double valor = ler.nextDouble();
		return valor;
	}

	private String coletarNome() {
		System.out.println("Digite o Nome: ");
		String nome = ler.next();
		return nome;

	}

	public void criarConta() {

		int numero = this.coletarNumeroConta();
		String nome = this.coletarNome();

		ContaCorrente conta = new ContaCorrente(numero, nome);
		repositorio.adicionarConta(conta);

		if (repositorio.BuscaContaNumero(numero).getNumeroConta() == conta.getNumeroConta()
				&& repositorio.BuscaContaNumero(numero).getCorrentista() == nome) {
			System.out.println("Conta criada com sucesso!");
		} else {
			System.out.println("Não foi possível criar conta, tente novamente.");
		}

	}

//	private boolean numeroVago(int numeroConta) {
//		if (repositorio.BuscaContaNumero(numeroConta) == null) {
//			return true;
//		}
//		return false;
//	}

	private void removerConta() {
		ContaCorrente c1 = repositorio.BuscaContaNumero(this.coletarNumeroConta());
		
		if(repositorio.existe(c1))
		{
			repositorio.removerConta(c1.getNumeroConta());
		}
		else
		{
			System.out.println("Conta não encontrada!");
		}
	}

	private void creditar() {
		ContaCorrente c1 = repositorio.BuscaContaNumero(this.coletarNumeroConta());
		
		if(repositorio.existe(c1))
		{
			c1.creditar(this.coletarValor());
		}
		else
		{
			System.out.println("Conta não encontrada!");
		}
	}

	private void debitar() {
		ContaCorrente c1 = repositorio.BuscaContaNumero(this.coletarNumeroConta());

		if (repositorio.existe(c1)) {
			c1.debitar(this.coletarValor());
		} else {
			System.out.println("Conta não encontrada!");
		}
	}

	private void transferir() {
		System.out.println("Digite o número da conta de origem: ");
		int numeroConta1 = ler.nextInt();

		System.out.println("Digite o número da conta destinatária: ");
		int numeroConta2 = ler.nextInt();

		ContaCorrente c1 = repositorio.BuscaContaNumero(numeroConta1);
		ContaCorrente c2 = repositorio.BuscaContaNumero(numeroConta2);
		if (repositorio.existe(c1)) {
			if (repositorio.existe(c2)) {
				c1.transferir(this.coletarValor(), c2);
			} else {
				System.out.println("Conta destino não encontrada!");
			}
		} else {
			System.out.println("Conta origem não encontrada!");
		}
	}

	private void detalhes() {
		int numero = this.coletarNumeroConta();
		ContaCorrente c1 = repositorio.BuscaContaNumero(numero);

		if (repositorio.existe(c1)) {
			System.out.println("===================================");
			System.out.println("Detalhes da conta de número " + c1.getNumeroConta());
			System.out.println("Nome: " + c1.getCorrentista());
			System.out.println("Saldo: " + c1.getSaldo());
		} else {
			System.out.println("Conta não encontrada!");
		}

	}

}

package questao002contacorrente;

public interface IRepositorio {
	void adicionarConta(ContaCorrente c1);
	void removerConta(int numeroConta);
	ContaCorrente BuscaContaNumero(int numeroConta);
	boolean existe(ContaCorrente c1);
}

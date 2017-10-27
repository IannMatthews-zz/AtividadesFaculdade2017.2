package questao003dvd;

public class Dvd {
	private boolean estado;
	private String operacaoEmExecucao;

	public Dvd() {
		estado = Constantes.DESLIGADO;
		operacaoEmExecucao = Constantes.PARADO;
	}

	// GETTERS
	public boolean getEstado() {
		return this.estado;
	}

	public String getOperacaoEmExecucao() {
		return this.operacaoEmExecucao;
	}
	
	public void liga()
	{
		this.estado = Constantes.LIGADO;
		this.operacaoEmExecucao = Constantes.PARADO;
		this.estadoDvd();
	}
	
	public void desliga()
	{
		this.estado = Constantes.DESLIGADO;
		this.operacaoEmExecucao = Constantes.PARADO;
		this.estadoDvd();
	}
	
	public void play()
	{
		if(this.getEstado() == Constantes.LIGADO)
		{
			this.operacaoEmExecucao = Constantes.REPRODUZINDO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void stop()
	{
		if(this.getEstado() == Constantes.LIGADO)
		{
			this.operacaoEmExecucao = Constantes.PARADO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void pause()
	{
		if(this.getEstado() == Constantes.LIGADO)
		{
			this.operacaoEmExecucao = Constantes.EM_PAUSA;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void volta()
	{
		if(this.getEstado() == Constantes.LIGADO)
		{
			this.operacaoEmExecucao = Constantes.VOLTANDO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void avanca()
	{
		if(this.getEstado() == Constantes.LIGADO)
		{
			this.operacaoEmExecucao = Constantes.AVANCANDO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void estadoDvd()
	{
		System.out.println("==============================");
		System.out.println("Estado: " + this.getEstado());
		System.out.println("Operação em execução: " + this.getOperacaoEmExecucao());
		System.out.println("==============================");
	}
}

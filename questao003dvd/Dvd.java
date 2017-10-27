package questao003dvd;

public class Dvd {
	public final boolean LIGADO = true;
	public final boolean DESLIGADO = false;
	public final String PARADO = "";
	public final String REPRODUZINDO = "REPRODUZINDO O DVD...";
	public final String EM_PAUSA = "REPRODUÇÃO DO DVD EM PAUSA...";
	public final String VOLTANDO = "VOLTANDO O DVD...";
	public final String AVANCANDO = "AVANÇANDO O DVD...";

	private boolean estado;
	private String operacaoEmExecucao;

	public Dvd() {
		estado = DESLIGADO;
		operacaoEmExecucao = PARADO;
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
		this.estado = LIGADO;
		this.operacaoEmExecucao = PARADO;
		this.estadoDvd();
	}
	
	public void desliga()
	{
		this.estado = DESLIGADO;
		this.operacaoEmExecucao = PARADO;
		this.estadoDvd();
	}
	
	public void play()
	{
		if(this.getEstado() == LIGADO)
		{
			this.operacaoEmExecucao = REPRODUZINDO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void stop()
	{
		if(this.getEstado() == LIGADO)
		{
			this.operacaoEmExecucao = PARADO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void pause()
	{
		if(this.getEstado() == LIGADO)
		{
			this.operacaoEmExecucao = EM_PAUSA;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void volta()
	{
		if(this.getEstado() == LIGADO)
		{
			this.operacaoEmExecucao = VOLTANDO;
			this.estadoDvd();
		}
		else
		{
			System.out.println("DVD desligado");
		}
	}
	
	public void avanca()
	{
		if(this.getEstado() == LIGADO)
		{
			this.operacaoEmExecucao = AVANCANDO;
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

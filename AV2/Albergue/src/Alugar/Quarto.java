package Alugar;

public class Quarto {
	
	private int id;
	private String nomeQuarto;
	private int qtdeCamas;
	private boolean temBanheiro;
	private String descricao;
	
	
	public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
		this.id = id;
		this.nomeQuarto = nomeQuarto;
		this.qtdeCamas = qtdeCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}


	public int getId() {
		return id;
	}


	public String getNomeQuarto() {
		return nomeQuarto;
	}


	public int getQtdeCamas() {
		return qtdeCamas;
	}


	public boolean isTemBanheiro() {
		return temBanheiro;
	}


	public String getDescricao() {
		return descricao;
	}
	
}

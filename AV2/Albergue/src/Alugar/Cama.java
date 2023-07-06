package Alugar;

public class Cama {
	private int id;
	private int codigoCama;
	private boolean ehBeliche;
	private String posicao;
	private String descricao;
	
	public Cama(int id, int codigoCama, boolean ehBeliche, String posicao, String descricao) {
		this.id = id;
		this.codigoCama = codigoCama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}

	
	public int getId() {
		return id;
	}

	public int getCodigoCama() {
		return codigoCama;
	}

	public boolean isEhBeliche() {
		return ehBeliche;
	}

	public String getPosicao() {
		return posicao;
	}

	public String getDescricao() {
		return descricao;
	}	
	
	
	
}

package br.org.fpf.pingpong.constants;

public enum FaixaRendaEnum {

	A_MIN ("FAIXA A", 0D),
	A_MAX ("FAIXA A", 1903.98D),
	
	B_MIN ("FAIXA B", 1903.99D),
	B_MAX ("FAIXA B", 2826.65D),
	
	C_MIN ("FAIXA C", 2826.66D),
	C_MAX ("FAIXA C", 3751.05D),
	
	D_MIN ("FAIXA D", 3751.06D),
	D_MAX ("FAIXA D", 4664.68D),
	
	E_MIN ("FAIXA E", 4664.69D);
	
	private String nome;
	private Double valor;
	
	private FaixaRendaEnum(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}
	
	public Double getValor() {
		return valor;
	}
}

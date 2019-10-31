package hello.entidade;

public class Produto {
	private String nome;
	private float valor;
	private Integer totalVendas;
	
	public Produto(String nome, float valor, Integer totalVendas) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.totalVendas = totalVendas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Integer getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}

}

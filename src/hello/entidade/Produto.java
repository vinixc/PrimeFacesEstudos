package hello.entidade;

public class Produto {
	private String nome;
	private float valor;
	private Integer totalVendas;
	private String descricao;
	private String categoria;
	
	public Produto(String nome, float valor, Integer totalVendas, String categoria) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.totalVendas = totalVendas;
		this.categoria = categoria;
	}
	
	public Produto() {
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

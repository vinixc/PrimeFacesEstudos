package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hello.entidade.Produto;

@ManagedBean
@SessionScoped
public class CriarProdutosBean {

	private Produto produto;

	private List<Produto> produtos;

	public CriarProdutosBean() {
		produto = new Produto();
		produtos = new ArrayList<Produto>();
	}

	public String reiniciar() {
		produto = new Produto();
		return null;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}

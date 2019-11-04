package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hello.entidade.Produto;

@ManagedBean
@SessionScoped
public class TableContextBean {
	
	private List<Produto> produtos;
	
	private Produto produtoSelecionado;
	
	public TableContextBean() {
		produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("Laranja", 2.5f, 30));
		produtos.add(new Produto("Maça", 1.8f, 15));
		produtos.add(new Produto("Uva", 1.5f, 25));
		produtos.add(new Produto("Melão", 3.7f, 10));
		produtos.add(new Produto("Banana", 1.8f, 32));
	}
	
	public void removerProduto() {
		produtos.remove(produtoSelecionado);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
}

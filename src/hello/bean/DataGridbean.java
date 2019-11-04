package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import hello.entidade.Produto;

@ManagedBean
@ViewScoped
public class DataGridbean {
	
	private List<Produto> produtos;
	
	

	public DataGridbean() {
		produtos = new ArrayList<Produto>(); 
		
		produtos.add(new Produto("PS3", 999, 250, "Console"));
		produtos.add(new Produto("PS4", 1999, 564, "Console"));
		produtos.add(new Produto("XBOX", 999, 245, "Console"));
		produtos.add(new Produto("WII", 1939, 34, "Console"));
		produtos.add(new Produto("IPHONE 5", 1499, 2234, "Mobile/Tablet"));
		produtos.add(new Produto("IPHONE 6", 3999, 1234, "Mobile/Tablet"));
		produtos.add(new Produto("IPHONE 7", 4999, 567, "Mobile/Tablet"));
		produtos.add(new Produto("NOTEBOOK DELL i7", 4499, 340, "Notebook"));
		produtos.add(new Produto("NOTEBOOK SONY ", 2499, 234, "Notebook"));
		produtos.add(new Produto("NOTEBOOK LENOVO ", 1199, 455, "Notebook"));

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}

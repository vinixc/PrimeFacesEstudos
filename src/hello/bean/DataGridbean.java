package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import hello.entidade.Produto;

@ManagedBean
@ViewScoped
public class DataGridbean {
	
	private List<Produto> produtos;
	private SelectItem[] listaCategoria;
	private Produto produtoSelecionado;
	
	private Produto[] produtosSelecionado;

	

	public DataGridbean() {
		produtos = new ArrayList<Produto>(); 
		
		produtos.add(new Produto(1,"PS3", 999, 250, "Console"));
		produtos.add(new Produto(2,"PS4", 1999, 564, "Console"));
		produtos.add(new Produto(3,"XBOX", 999, 245, "Console"));
		produtos.add(new Produto(4,"WII", 1939, 34, "Console"));
		produtos.add(new Produto(5,"IPHONE 5", 1499, 2234, "Mobile/Tablet"));
		produtos.add(new Produto(6,"IPHONE 6", 3999, 1234, "Mobile/Tablet"));
		produtos.add(new Produto(7,"IPHONE 7", 4999, 567, "Mobile/Tablet"));
		produtos.add(new Produto(8,"NOTEBOOK DELL i7", 4499, 340, "Notebook"));
		produtos.add(new Produto(9,"NOTEBOOK SONY ", 2499, 234, "Notebook"));
		produtos.add(new Produto(10,"NOTEBOOK LENOVO ", 1199, 455, "Notebook"));
		
		listaCategoria = new SelectItem[4];
		listaCategoria[0] = new SelectItem("","Selecione");
		listaCategoria[1] = new SelectItem("Console","Console");
		listaCategoria[2] = new SelectItem("Mobile/Tablet","Mobile/Tablet");
		listaCategoria[3] = new SelectItem("Notebook","Notebook");


	}
	
	public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Produto Selecionado", ((Produto)event.getObject()).getNome());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Seleçao removida", ((Produto)event.getObject()).getNome());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public SelectItem[] getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(SelectItem[] listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public Produto[] getProdutosSelecionado() {
		return produtosSelecionado;
	}

	public void setProdutosSelecionado(Produto[] produtosSelecionado) {
		this.produtosSelecionado = produtosSelecionado;
	}
	
}

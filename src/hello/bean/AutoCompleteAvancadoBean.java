package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutoCompleteAvancadoBean {
	
	private List<String> contatos;
	
	public AutoCompleteAvancadoBean() {
		contatos = new ArrayList<String>();
		
		contatos.add("wesley@gmail.com");
		contatos.add("douglas@gmail.com");
		contatos.add("fernando@gmail.com");
		contatos.add("vinicius@gmail.com");
		contatos.add("teste@gmail.com");
		contatos.add("erick@gmail.com");
		contatos.add("brunao@gmail.com");
		contatos.add("jojo@gmail.com");
		
	}
	
	public List<String> complete(String busca){
		List<String> results = new ArrayList<String>();
		for(String contatos : contatos) {
			if(contatos.toUpperCase().contains(busca.toUpperCase()))
				results.add(contatos);
		}
		return results;
	}
	
	private List<String> contatosSelecionados;

	
	public List<String> getContatosSelecionados() {
		return contatosSelecionados;
	}

	public void setContatosSelecionados(List<String> contatosSelecionados) {
		this.contatosSelecionados = contatosSelecionados;
	}

}

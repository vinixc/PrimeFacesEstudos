package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import hello.entidade.Contato;

@ManagedBean
@ViewScoped
public class ContatoBean {
	
	private Contato contato;
	private List<Contato> contatos;
	
	public ContatoBean() {
		contato = new Contato();
		contatos = new ArrayList<Contato>();
	}
	
	public void inserirContato() {
		if(contatos.contains(contato)) {
			FacesMessage msg = new FacesMessage("Registro Duplicado!", "O Contato que você está inserindo já existe.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}else {
			contatos.add(0,contato);
			contato = new Contato();
		}
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}

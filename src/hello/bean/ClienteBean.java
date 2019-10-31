package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class ClienteBean {
	
	private String nome;
	private String cargo;
	
	public void inserirCliente(ActionEvent actionEvent) {
		try {
			Thread.sleep(3000);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente inserido com sucesso!"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}

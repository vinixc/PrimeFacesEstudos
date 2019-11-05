package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.PrimeFaces;

import hello.entidade.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private Usuario usuario;
	
	public LoginBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void login(ActionEvent event) {
		
		FacesMessage msg = new FacesMessage();
		
		boolean logado = false;
		
		if(usuario != null && usuario.getLogin().equals("admin") && usuario.getSenha() != null) {
			logado = true;
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Seja Bem Vindo", "Senha bem vindo " + usuario.getLogin());
		}else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro ao realizar login", "Login ou senha incorretos");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		PrimeFaces.current().ajax().addCallbackParam("logado", logado);
	}
}

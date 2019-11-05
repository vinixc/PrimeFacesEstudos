package hello.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hello.entidade.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean {
	
	private Usuario usuario;
	
	public UsuarioBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

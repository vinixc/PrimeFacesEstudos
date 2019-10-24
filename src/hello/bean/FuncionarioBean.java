package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class FuncionarioBean {
	
	private String nome;
	private String funcao;
	
	public void salvarFuncionario() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Olá "+ nome + ". Você Trabalha como " + funcao + "."));
		try {
			Thread.sleep(4000);
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}

package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class BotaoDireitoBean {
	
	public void acessarWifi(ActionEvent event) {
		adicionarMensagem("Conexao realizada com sucesso ao Wifi");
	}
	
	public void salvar(ActionEvent event) {
		adicionarMensagem("Operação salva com sucesso.");
	}
	
	public void adicionarMensagem(String mensagem) {
		FacesMessage facesMensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMensagem);
	}
}

package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class ContextMenuGalleryBean {
	
	public void enviar(ActionEvent event) {
		adicionarMensagem("Operação enviada com sucesso.");
	}
	
	public void adicionarMensagem(String mensagem) {
		FacesMessage facesMensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMensagem);
	}
}

package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class CaptchaBean {
	
	public void enviar(ActionEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso","Captcha validado com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}

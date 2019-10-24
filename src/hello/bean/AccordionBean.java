package hello.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.TabChangeEvent;

@ManagedBean
@ViewScoped
public class AccordionBean {

	public void onTabChange(TabChangeEvent event) {
		FacesMessage msg = new FacesMessage("Tab modificada", "Tab atual: " + event.getTab().getTitle());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}

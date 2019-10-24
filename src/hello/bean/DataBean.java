package hello.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "data")
@RequestScoped
public class DataBean {

	private Date data;
	private String dataFormat;

	public void printData() {
		System.out.println(data);
	}

	public void mostrarMsgMudancaData(SelectEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Selecionada", sfd.format(event.getObject())));
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDataFormat() {
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		if (data != null) {
			dataFormat = sfd.format(data);
		}
		return dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}
}

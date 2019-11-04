package hello.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class ColorBean {
	
	private String cor1;
	private String cor2;
	
	
	
	public String getCor1() {
		return cor1;
	}
	public void setCor1(String cor1) {
		this.cor1 = cor1;
	}
	public String getCor2() {
		return cor2;
	}
	public void setCor2(String cor2) {
		this.cor2 = cor2;
	}	
}

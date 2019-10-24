package hello.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PoolBean {
	
	private int count = 0;
	private Date data;
	
	public void incrementar() {
		count+= count + 1;
	}
	
	public Date novaData() {
		return data = new Date();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	

}

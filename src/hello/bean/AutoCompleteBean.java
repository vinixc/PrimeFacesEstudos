package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoCompleteBean {
	
	public AutoCompleteBean() {
		clientes = new ArrayList<String>();
		
		clientes.add("Alex");
		clientes.add("Antonio");
		clientes.add("Antonia");
		clientes.add("Alberto");
		clientes.add("Albania");
		clientes.add("Alessandra");
		clientes.add("Alexsandro");
	}
	
	private List<String> clientes;
	
	private String cliente;
	
	public List<String> complete(String busca){
		List<String> results = new ArrayList<String>();
		for(String cliente: clientes) {
			if(cliente.toUpperCase().contains(busca.toUpperCase())) 
				results.add(cliente);
		}
		return results;
	}

	public List<String> getClientes() {
		return clientes;
	}

	public void setClientes(List<String> clientes) {
		this.clientes = clientes;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}

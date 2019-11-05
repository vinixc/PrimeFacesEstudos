package hello.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.DragDropEvent;

import hello.entidade.Carro;

@ManagedBean
@SessionScoped
public class DragDropEscolhaCarrosBean {
	
	public DragDropEscolhaCarrosBean() {
		carrosDisponiveis = new ArrayList<Carro>();
		carrosSelecionados = new ArrayList<Carro>();
		carrosDisponiveis.add(new Carro("Classic", 2010, "Ar"));
		carrosDisponiveis.add(new Carro("Cobalt", 2013, "Completo"));
		carrosDisponiveis.add(new Carro("Gol", 2012, "Ar, Direção"));
		carrosDisponiveis.add(new Carro("Fiat Uno", 2011, "Basico"));
		carrosDisponiveis.add(new Carro("Peugeout", 2012, "Ar, Direção, Vidro"));
		carrosDisponiveis.add(new Carro("Celta", 2009, "Direção"));
		carrosDisponiveis.add(new Carro("Hilux SW4", 2008, "Completo"));
		carrosDisponiveis.add(new Carro("Corolla", 2005, "Completo"));

	}
	
	private List<Carro> carrosDisponiveis;
	private List<Carro> carrosSelecionados;
	
	public void onCarroSelecionado(DragDropEvent eddEvent) {
		Carro carro = ((Carro)eddEvent.getData());
		carrosDisponiveis.remove(carro);
		carrosSelecionados.add(carro);
	}
	
	public void removerCarro(Carro carro) {
		carrosSelecionados.remove(carro);
		carrosDisponiveis.add(carro);
		
	}

	public List<Carro> getCarrosDisponiveis() {
		return carrosDisponiveis;
	}

	public void setCarrosDisponiveis(List<Carro> carrosDisponiveis) {
		this.carrosDisponiveis = carrosDisponiveis;
	}

	public List<Carro> getCarrosSelecionados() {
		return carrosSelecionados;
	}

	public void setCarrosSelecionados(List<Carro> carrosSelecionados) {
		this.carrosSelecionados = carrosSelecionados;
	}
	
	
}

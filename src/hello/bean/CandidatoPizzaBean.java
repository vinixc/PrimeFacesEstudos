package hello.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;



@ManagedBean
@SessionScoped
public class CandidatoPizzaBean {
	
	private PieChartModel pizzaModel;
	
	
	public CandidatoPizzaBean() {
		criarPizzaModel();
	}

	private void criarPizzaModel() {
		pizzaModel = new PieChartModel();
		
		pizzaModel.set("Bolsonaro", 40);
		pizzaModel.set("Dilma", 20);
		pizzaModel.set("Lula", 10);
		pizzaModel.set("Vinicius", 100);
		
		pizzaModel.setTitle("Candidatos");
		pizzaModel.setLegendPosition("w");
		pizzaModel.setShadow(false);
		pizzaModel.setSliceMargin(5);
		pizzaModel.setShowDataLabels(true);
		pizzaModel.setFill(true);
		
	}

	public PieChartModel getPizzaModel() {
		return pizzaModel;
	}

	public void setPizzaModel(PieChartModel pizzaModel) {
		this.pizzaModel = pizzaModel;
	}
	
}

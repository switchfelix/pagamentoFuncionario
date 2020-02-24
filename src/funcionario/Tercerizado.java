package funcionario;

public class Tercerizado extends Fixado{
	private Double adcional;

	public Tercerizado(String nome, Integer hora, Double valorHora, Double adcional) {
		super(nome, hora, valorHora);
		this.adcional = adcional;
	}

	public Double getAdcional() {
		return adcional;
	}

	public void setAdcional(Double adcional) {
		this.adcional = adcional;
	}
	
	@Override
	public Double salario() {
		return super.salario() + adcional;
	}
		
	
	
}

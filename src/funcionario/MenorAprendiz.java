package funcionario;

public class MenorAprendiz extends Fixado{
	private Double desconto;
	public MenorAprendiz(String nome, Integer hora, Double valorHora, Double desconto) {
		super(nome, hora, valorHora);
		this.desconto = desconto;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	@Override
	public Double salario() {
		return super.salario() - desconto;
	}
}

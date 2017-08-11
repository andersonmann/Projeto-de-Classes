package heranca2;

public class MestreDeObras extends Servente {

	private int totalFuncionarios;

	public MestreDeObras(int codigo, String nome, double salarioBase, int totalFunc) {
		super(codigo, nome, salarioBase);
		totalFuncionarios = totalFunc;
	}

	public int getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public void setTotalFuncionarios(int totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}

	public double getSalarioLiquido() {
		double salBase = getSalarioBase() * 1.05;
		salBase = salBase + salBase * (totalFuncionarios / 10) * 0.1;
		return salBase - calculaDescontos(salBase);
	}

	public String toString() {
		return super.toString() + "\n   Total func: " + totalFuncionarios;
	}

}

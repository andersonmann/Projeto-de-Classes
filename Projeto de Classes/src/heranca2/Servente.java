package heranca2;

public class Servente extends Funcionario {

	public Servente(int codigo, String nome, double salarioBase) {
		super(codigo, nome, salarioBase);
		// TODO Auto-generated constructor stub
	}

	// public double getSalarioLiquido()
	// {
	// double salLiquido = super.getSalarioLiquido();
	// return salLiquido * 1.05;
	// }

	public double getSalarioLiquido() {
		double salBase = getSalarioBase() * 1.05;
		return salBase - calculaDescontos(salBase);
	}
}

package heranca2;

public class Funcionario {
	private String nome;
	private int codigo;
	private double salarioBase;

	public Funcionario(int codigo, String nome, double salarioBase) {
		this.codigo = codigo;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calculaDescontos(double sal) {
		double inss = sal* 0.1;
		double ir = 0.0;
		if (sal> 2000.0) {
			ir = (sal- 2000.0) * 0.12;
		}
		return inss + ir;
	}
	
	public double getSalarioLiquido() {
		return salarioBase - calculaDescontos(salarioBase);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n   Codigo: " + getCodigo()
				+ "\n   Nome: " + getNome() + "\n   Salario Base: "
				+ getSalarioBase() + "\n   Salario liquido: " + getSalarioLiquido();
	}
}
package polimorfismo;

public class ProfessorDE extends Professor {

	private double salario;

	public ProfessorDE(String nome, String matricula, double salario) {
		super(nome, matricula, 40);
		this.salario = salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getSalario() {
		return salario;
	}
}

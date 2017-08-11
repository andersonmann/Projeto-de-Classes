package polimorfismo;

public class ProfessorPesq extends ProfessorDE {

	public ProfessorPesq(String nome, String matricula, double salario) {
		super(nome, matricula, salario);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return super.getSalario() * 1.15;
	}
}
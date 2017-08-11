package polimorfismo2;

public class ContaPoupanca extends Conta {
	private int diaAniver;

	public ContaPoupanca(String numero, String nome, int dia) {
		super(numero, nome);
		this.diaAniver = dia;
	}

	public int getDiaAniver() {
		return diaAniver;
	}

	@Override
	public String toString() {
		return super.toString() + " dia: " + diaAniver;
	}
}

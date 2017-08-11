package polimorfismo2;

public class ContaSuper extends Conta {

	private double limite;

	public ContaSuper(String numero, String nome, double limite) {
		super(numero, nome);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if (valor <= saldo + limite)
			saldo = saldo - valor;
	}

	public String toString() {
		return super.toString() + " - lim: R$ " + limite;
	}
}

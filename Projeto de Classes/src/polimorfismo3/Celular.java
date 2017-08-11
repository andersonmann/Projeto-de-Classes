package polimorfismo3;

public abstract class Celular extends Telefone {

	private double custoMinBase;
	private String operadora;

	public Celular(String ddd, String nro, double custoMinBase, String operadora) {
		super(ddd, nro);
		this.custoMinBase = custoMinBase;
		this.operadora = operadora;
	}

	public double getCustoMinBase() {
		return custoMinBase;
	}

	public String getOperadora() {
		return operadora;
	}

	@Override
	public String toString() {
		return super.toString() + " - R$ " + custoMinBase + " - " + operadora;
	}

}

package polimorfismo3;

public class Fixo extends Telefone {

	private double custoMinuto;

	public Fixo(String ddd, String nro, double custo) {
		super(ddd, nro);
		custoMinuto = custo;
	}

	public double getCustoMinuto() {
		return custoMinuto;
	}

	@Override
	public double calculaCusto(int tempo) {
		return tempo * custoMinuto;
	}

	@Override
	public String toString() {
		return super.toString() + " - R$ " + custoMinuto;
	}
}

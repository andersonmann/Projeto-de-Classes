package polimorfismo3;

public class PrePago extends Celular {

	public PrePago(String ddd, String nro, double custoMinBase, String operadora) {
		super(ddd, nro, custoMinBase, operadora);
	}

	@Override
	public double calculaCusto(int tempo) {
		return getCustoMinBase() * 1.4 * tempo;
	}

	@Override
	public String toString() {
		return super.toString() + " [pré pago]";
	}
}

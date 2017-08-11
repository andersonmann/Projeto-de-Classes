package polimorfismo3;

public class PosPago extends Celular {

	public PosPago(String ddd, String nro, double custoMinBase, String operadora) {
		super(ddd, nro, custoMinBase, operadora);
	}

	@Override
	public double calculaCusto(int tempo) {
		return getCustoMinBase() * 0.9 * tempo;
	}

	@Override
	public String toString() {
		return super.toString() + " [pós pago]";
	}
}

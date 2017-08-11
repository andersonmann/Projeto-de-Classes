package polimorfismo3;

public abstract class Telefone {

	private String ddd;
	private String nro;

	public Telefone(String ddd, String nro) {
		this.ddd = ddd;
		this.nro = nro;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNro() {
		return nro;
	}

	public abstract double calculaCusto(int tempo);

	@Override
	public String toString() {
		return getClass().getName() + "(" + ddd + ") " + nro;
	}

}

package polimorfismo2;

public class Conta {

	private String numero;
	private String nome;
	protected double saldo;

	public Conta(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0;
	}

	public void depositar(double valor) {
		if (valor > 0)
			saldo = saldo + valor;
	}

	public void sacar(double valor) {
		if (valor <= saldo)
			saldo = saldo - valor;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return numero + ", " + nome + " : R$ " + saldo;
	}
}

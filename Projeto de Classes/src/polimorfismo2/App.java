package polimorfismo2;

public class App {

	public static void main(String[] args) {

		Conta conta1 = new Conta("01", "Fulano");
		ContaSuper conta2 = new ContaSuper("02", "Beltrano", 100);
		ContaPoupanca conta3 = new ContaPoupanca("03", "Ciclano", 5);

		conta1.depositar(200);
		conta1.sacar(200);
		System.out.println("Saldo conta 1: " + conta1.getSaldo());

		conta2.depositar(200);
		conta2.sacar(300);
		System.out.println("Saldo conta 2: " + conta2.getSaldo());

		System.out.println(conta3);
	}
}

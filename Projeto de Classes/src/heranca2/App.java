package heranca2;

public class App {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario(1, "Fulano", 2000);
		Servente func2 = new Servente(2, "Beltrano", 2000);
		MestreDeObras func3 = new MestreDeObras(3, "Ciclano", 2000, 24);
		System.out.println(func1);
		System.out.println(func2);
		System.out.println(func3);
	}
}

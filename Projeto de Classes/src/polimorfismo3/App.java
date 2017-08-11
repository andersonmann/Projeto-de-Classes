package polimorfismo3;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Telefone tel1 = new Telefone("51", "3172-3223");
		Telefone tel2 = new Fixo("51", "3172-3223", 1.5);
		Telefone tel3 = new PrePago("54", "8273-3355", 1.5, "Seilá");
		Telefone tel4 = new PosPago("51", "9398-3231", 1.5, "Opa");
		System.out.println(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
		
		System.out.println("Tel2: "+tel2.calculaCusto(10));
		System.out.println("Tel3: "+tel3.calculaCusto(10));
		System.out.println("Tel4: "+tel4.calculaCusto(10));
	}

}

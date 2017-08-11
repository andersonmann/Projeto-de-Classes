package sobrecarga;

public class App
{
	public static void main(String args[])
	{
		System.out.println("Total de objetos: "+Circulo.getContador());
		Circulo circ1 = new Circulo();
		System.out.println("Total de objetos: "+Circulo.getContador());
		Circulo circ2 = new Circulo(1, 2, 4);
		System.out.println("Total de objetos: "+Circulo.getContador());
		Circulo circ3 = new Circulo(10,10,100);
		System.out.println("Total de objetos: "+Circulo.getContador());
		//System.out.println("Total de objetos: "+circ1.getContador());
		
		System.out.println("Valor de PI em Circulo: "+ Circulo.PI);
		
		System.out.println("Area circ1= " + circ1.area());
		System.out.println("Area circ2= " + circ2.area());
		System.out.println("Area circ3= " + circ3.area());
	}
}
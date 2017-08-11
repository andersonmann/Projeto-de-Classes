package sobrecarga;

public class Circulo {

	public static final double PI = 3.14;
	private static int contador = 0;
	private int centrox;
	private int centroy;
	private int raio;

	public static int getContador() {
		return contador;
	}

	public int getCentrox() {
		return centrox;
	}

	public void setCentrox(int centrox) {
		this.centrox = centrox;
	}

	public int getCentroy() {
		return centroy;
	}

	public void setCentroy(int centroy) {
		this.centroy = centroy;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public double area() {
		return PI * raio * raio;
	}

	public Circulo(int x, int y, int r) {
		if (x >= 0)
			centrox = x;
		else
			centrox = 0;
		if (y >= 0)
			centroy = y;
		else
			centroy = 0;
		if (r > 0)
			raio = r;
		else
			raio = 1;
		contador++;
	}

	public Circulo() {
		centrox = 0;
		centroy = 0;
		raio = 1;
		contador++;
	}
}

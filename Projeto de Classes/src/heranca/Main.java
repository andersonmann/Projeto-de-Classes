package heranca;

import java.util.ArrayList;

/**
 *
 * @author flash
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ProfessorDE prof1 = new ProfessorDE("Ana", "001", 2000);
		ProfessorHorista prof2 = new ProfessorHorista("José", "002", 20, 20.5);

		System.out.println(prof1.getNome() + " - " + prof1.getSalario());
		System.out.println(prof2.getNome() + " - " + prof2.getSalario());
	}

}

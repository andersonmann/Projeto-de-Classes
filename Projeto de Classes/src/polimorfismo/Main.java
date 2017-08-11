package polimorfismo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Professor> cad = new ArrayList<>();
		cad.add(new ProfessorDE("Ana", "001", 2000));
		cad.add(new ProfessorHorista("José", "002", 20, 20.5));
		cad.add(new ProfessorHorista("Pedro", "003", 22, 30));
		cad.add(new ProfessorDE("João", "004", 3200));
		cad.add(new ProfessorPesq("Fulano", "005", 2000));
		//cad.add(new Professor("Beltrano", "006", 22));

		for (Professor p : cad)
			System.out.println(p.getNome() + " - " + p.getSalario());
	}

}

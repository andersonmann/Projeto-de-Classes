/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heranca;

/**
 *
 * @author flash
 */
public class Professor {

	private String nome;
	private String matricula;
	private int cargaHoraria;

	public Professor(String nome, String matricula, int cargaHoraria) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

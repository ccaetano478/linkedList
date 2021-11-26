package listaEncadeada;

import java.util.Random;

public class Employee {
	
	private String nomeFuncionario;
	private int matricula; 
	private String cargo;
	private float salario;
	
	public Employee(String nomeFuncionario, String cargo, float salario) {
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
		setMatricula(matriculaAle);
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getMatricula() {
		return matricula;
	}
	
	private int gerarMatriculaAleatoria() {
		Random rand = new Random();
	    int randomNum = rand.nextInt((1000 - 1) + 1) + 1;
	    return randomNum;
	}
	private int matriculaAle = gerarMatriculaAleatoria();
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Employee [nomeFuncionario=" + nomeFuncionario + ", matricula=" + matricula + ", cargo=" + cargo
				+ ", salario=" + salario + "]";
	}
	
	
	
}

package listaEncadeada;

import java.util.*;

public class main {

	public static void main (String[] args) {
		
		int stop = 0;
		NodeList list = new NodeList();
		do {
			System.out.println("Digite para: \n"
					+ "1 - Adicionar novo funcionário \n"
					+ "2 - Exibir Relatório de funcionários \n"
					+ "3 - Buscar funcionário \n"
					+ "4 - Remover Funcionário \n"
					+ "5 - sair");
			
			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("Digite um nome: ");
				String nome = scan.next();
				System.out.println("Digite um cargo: ");
				String cargo = scan.next();
				System.out.println("Defina o salário: ");
				float salario = scan.nextFloat();
				
				Employee func = new Employee(nome, cargo, salario);
				list.addH(func);
				System.out.println("Funcionario adicionado \n");
				break;
			case 2:
				list.createReport();
				break;
			case 3:
				System.out.println("informar matricula: /n");
				int matricula = scan.nextInt();
				list.searchEmployee(matricula);
				break;
			case 5:
				stop = 5;
				break;
			}

			
		} while (stop != 5);
	
	}

}

package aula01;

public class ExemploSaidaDados {

	public static void main(String [] args) {
		
		String disciplina = "POO";
		String professor = "Vin�cius";
		
		System.out.println("==== PRINTLN ====");
		System.out.println("Universidade Tecnol�gica Federal do Paran�");
		System.out.println(disciplina + " ministrada pelo Prof. " + professor);
		
		System.out.println("\n==== PRINT ====");
		System.out.print("Universidade Tecnol�gica Federal do Paran�");
		System.out.print(disciplina + " ministrada pelo Prof. " + professor);
		
		System.out.println("\n\n==== PRINTF ====");
		System.out.printf("Universidade Tecnol�gica Federal do Paran�");
		System.out.printf("%s ministrada pelo Prof. %s", disciplina, professor);
	}
}







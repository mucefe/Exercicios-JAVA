package funcoes;

public class Funcoes {

	public static void main(String[] args) {
		mostrarOlaMundo();
		mostrarMeuNome("Murilo");
		String nome = "Thiago";
		mostrarMeuNome(nome);
		mostrarMeuNome("Murilo","Ferreira");
		nascimento(25);
		imprimirNascimento(25);
		
	}

	public static void mostrarOlaMundo() {
		System.out.println("Olá, Mundo");
	}

	public static void mostrarMeuNome(String nome) {
		System.out.println(nome);
	}

	public static void mostrarMeuNome(String nome, String sobrenome) {
		System.out.println(nome+" "+sobrenome);
		
	}
	public static int nascimento(int idade) {
		return 2022-idade;
		
	}
	public static void imprimirNascimento(int idade) {
		System.out.println(nascimento(idade));
	}
	
}

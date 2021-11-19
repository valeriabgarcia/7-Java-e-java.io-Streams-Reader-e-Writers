package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; // String(classe), nome(referência), Alura(objeto)
		
		nome.replace("A", "a"); // não funciona, pois uma String é imutável
		
		//String outra = nome.replace("A", "a");
		String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
		System.out.println(nome.substring(3));
		System.out.println(nome.indexOf("ur"));
		System.out.println(nome.isEmpty());  // está vazio? 
		System.out.println(nome.trim());  // remove os espaços
		System.out.println(nome.isEmpty());
		System.out.println(nome.contains("ra"));  // contém esses caracteres? 
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}

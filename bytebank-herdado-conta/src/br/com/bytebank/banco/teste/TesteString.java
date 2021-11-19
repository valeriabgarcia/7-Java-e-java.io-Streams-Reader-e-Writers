package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; // String(classe), nome(refer�ncia), Alura(objeto)
		
		nome.replace("A", "a"); // n�o funciona, pois uma String � imut�vel
		
		//String outra = nome.replace("A", "a");
		String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
		System.out.println(nome.substring(3));
		System.out.println(nome.indexOf("ur"));
		System.out.println(nome.isEmpty());  // est� vazio? 
		System.out.println(nome.trim());  // remove os espa�os
		System.out.println(nome.isEmpty());
		System.out.println(nome.contains("ra"));  // cont�m esses caracteres? 
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}

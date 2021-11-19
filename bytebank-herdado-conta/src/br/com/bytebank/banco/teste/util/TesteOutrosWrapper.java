package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {

		int[] idades = new int[5];

		String[] nomes = new String[5];

		int idade = 29; // é usado o Integer por trás desse primitivo
		Integer idadeRef = new Integer(29);
		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(29); // Autoboxing

		System.out.println(idade);

	}

}

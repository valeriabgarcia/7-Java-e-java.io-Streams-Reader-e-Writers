package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListaEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>(); //nesse caso, o ArrayList só vai guardar referências do tipo Conta

		Conta cc = new ContaCorrente(11, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(12, 222);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(12, 222);

		boolean existe = lista.contains(cc3);

		System.out.println("Já existe?: " + existe);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// <> Generics - usamos para não misturar os tipos de referências
		// ArrayList<Conta> lista = new ArrayList<Conta>(); //nesse caso, o ArrayList só vai guardar referências do tipo Conta
 
		
		List<Conta> lista = new ArrayList<Conta>();
		// List<Conta> lista = new LinkedList<Conta>();
		// List<Conta> lista = new Vector<Conta>();

		Conta cc = new ContaCorrente(11, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(12, 222);
		lista.add(cc2);

		System.out.println("Tamanho da lista: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println("Numero da conta: " + ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho da lista: " + lista.size());
		
		
		Conta cc3 = new ContaCorrente(113, 223);
		lista.add(cc3);  // add faz parte do pacote ArrayList
		
		Conta cc4 = new ContaCorrente(114, 224);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("----------------");
		
		// jeito mais atual de mostrar 
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}

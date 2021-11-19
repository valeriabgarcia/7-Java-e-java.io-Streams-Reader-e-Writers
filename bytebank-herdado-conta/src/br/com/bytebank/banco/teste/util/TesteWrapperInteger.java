package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; // autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // que locura!! unboxing

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // ok
		lista.add(primitivo); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1); // ok

		System.out.println(i1); // 29
		System.out.println(i2); // 21

		// Agora vamos testar o parsing, que é a conversão do String para um tipo
		// específico

		Integer iParseado1 = Integer.valueOf("42"); // parseando e devolvendo referencia
		int iParseado2 = Integer.parseInt("44"); // parseando e devolvendo primitivo

		System.out.println(iParseado1); // 42
		System.out.println(iParseado2); // 44

		// Verifique as constantes da classe Integer

		System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		System.out.println(Integer.MIN_VALUE); // -2^31
		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); // 4 Bytes

	}

}

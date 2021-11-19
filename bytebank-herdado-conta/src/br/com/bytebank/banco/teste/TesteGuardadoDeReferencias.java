package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadoDeReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(11, 22);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(111, 222);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		// tem que fazer um cast, para transformar referência genérica em referência específica
		Conta ref = (Conta) guardador.getReferencia(1);  
		System.out.println(ref.getNumero());

	}

}

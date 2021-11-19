package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
// IMPORTS ESPECIFICOS
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

// IMPORT GEN�RICO
//import br.com.bytebank.banco.modelo.*;


public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(123, 555);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(456, 444);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}

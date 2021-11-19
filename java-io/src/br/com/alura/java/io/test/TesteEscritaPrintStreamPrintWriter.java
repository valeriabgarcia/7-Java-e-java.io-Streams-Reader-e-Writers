package br.com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		FileOutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		// PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assdﬂ");

		ps.close();

	}

}

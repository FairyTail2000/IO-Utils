package io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class IOServer {

	private Scanner scanner;
	private PrintStream stream, error_stream;
	
	public IOServer (InputStream input, PrintStream output, PrintStream error) {
		this.scanner = new Scanner(input);
		this.stream = output;
		this.error_stream = error;
	}
	
	public Scanner reader () {
		return this.scanner;
	}
	
	public String readLine () {
		return this.scanner.nextLine();
	}
	
	public PrintStream output () {
		return this.stream;
	}
	
	public <T> void error (T msg) {
		error_stream.println(msg);
		error_stream.flush();
	}
}

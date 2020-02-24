package io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class IOServer {

	private Scanner scanner;
	private PrintStream stream, error_stream;
	
	/**
	 * 
	 * @param input Der InputStream zum einlesen von Daten
	 * @param output Der Stream wo Daten ausgegeben werden
	 * @param error Der Stream wo Fehler ausgegeben werden
	 */
	public IOServer (InputStream input, PrintStream output, PrintStream error) {
		this.scanner = new Scanner(input);
		this.stream = output;
		this.error_stream = error;
	}
	
	/**
	 * @return Den globalen Konsolen leser
	 */
	public Scanner reader () {
		return this.scanner;
	}
	
	/**
	 * Liest eine Zeile aus der Konsole ein
	 * @return
	 */
	public String readLine () {
		return this.scanner.nextLine();
	}
	
	/**
	 * @return Den Konsolen stream
	 */
	public PrintStream output () {
		return this.stream;
	}
	
	/**
	 * Gibt einen Fehler aus
	 * @param msg Den auszugebenen Fehler
	 */
	public <T> void error (T msg) {
		error_stream.println(msg);
		error_stream.flush();
	}
}

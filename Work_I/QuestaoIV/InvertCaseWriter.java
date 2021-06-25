package QuestaoIV;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class InvertCaseWriter extends Writer {

	private OutputStream os;
	
	@Override
	public void close() throws IOException {}
	@Override
	public void flush() throws IOException {}
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {}
	
	public InvertCaseWriter () {}
	
	public InvertCaseWriter (OutputStream os) {
		this.os = os;
	}
	
	public void writeSysout (String word) {
		PrintWriter pw = new PrintWriter(os);
		
		String acc = "";
		
		for(int i=0; i<word.length(); i++) {
			if (word.charAt(i)+0 <= 90) {
				acc += word.toLowerCase().charAt(i);
			}else {
				acc += word.toUpperCase().charAt(i);
			}
		}
		pw.println(acc);
		pw.close();
	}
	
	public void writeFile (String word) throws IOException {
		PrintWriter pw = new PrintWriter(os);

		String acc = "";
		
		for(int i=0; i<word.length(); i++) {
			if (word.charAt(i)+0 <= 90) {
				acc += word.toLowerCase().charAt(i);
			}else {
				acc += word.toUpperCase().charAt(i);
			}
		}
		pw.print(acc);
		pw.close();
	}
	
	public void writeTCP (String word) throws IOException {
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF(word);
		dos.close();
	}
}

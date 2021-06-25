package QuestaoV;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InvertCaseReader {

	InputStream input;
	
	public InvertCaseReader (InputStream input) {
		this.input = input;
	}
	
	public InvertCaseReader () {}
		
	public String readSysout () {
		Scanner in = new Scanner(input);
		
		String word = in.nextLine();
		String acc = "";
		
		for(int i=0; i<word.length(); i++) {
			if (word.charAt(i)+0 <= 90) {
				acc += word.toLowerCase().charAt(i);
			}else {
				acc += word.toUpperCase().charAt(i);
			}
		}
		in.close();
		return acc;
	}
	
	public String readFile( ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		
		String word = br.readLine();
		
		String acc = "";
		
		for(int i=0; i<word.length(); i++) {
			if (word.charAt(i)+0 <= 90) {
				acc += word.toLowerCase().charAt(i);
			}else {
				acc += word.toUpperCase().charAt(i);
			}
		}
		br.close();
		return acc;
	}
	
	//Queria poder fazer o outro metodo mas nao consegui interpretar o que era pedido ou não soube implementar o que foi pedido
}

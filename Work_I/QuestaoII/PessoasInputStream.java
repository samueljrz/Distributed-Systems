package QuestaoII;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.stream.Collectors;

import QuestaoI.Pessoa;
import QuestaoI.PessoasOutputStream;

public class PessoasInputStream {
	private static InputStream is;
	
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public PessoasInputStream (InputStream is) {
		PessoasInputStream.is = is;
	}
	
	public static Pessoa[] readSysout () {
		Scanner in = new Scanner(is);
		
		int qtdPeople = in.nextInt();
		
		Pessoa[] people = new Pessoa[qtdPeople];
		
		for(int i=0; i<qtdPeople; i++) {
			String name = in.next();
			String cpf = in.next();
			int age = in.nextInt();
			
			people[i] = new Pessoa(name, cpf, age);
		}
		in.close();
		return people;
	}

	
	public static Pessoa[] readFile () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		int qtdPeople = Integer.parseInt(br.readLine());
		
		Pessoa[] people = new Pessoa[qtdPeople];
		
		for(int i=0; i<qtdPeople; i++) {
			String name = br.readLine();
			String cpf = br.readLine();
			int age = Integer.parseInt(br.readLine());
			
			people[i] = new Pessoa(name, cpf, age);
		}
		br.close();
		return people;
	}
	
	//Queria poder fazer o outro metodo mas nao consegui interpretar o que era pedido ou não soube implementar o que foi pedido
}


package QuestaoII;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import QuestaoI.Pessoa;
import QuestaoI.PessoasOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		// InputStream Sysout
		/*
			PessoasInputStream pis = new PessoasInputStream(System.in);
			Pessoa[] pessoas =  pis.readSysout();
			PessoasOutputStream p = new PessoasOutputStream(pessoas, System.out);
			p.writeSysout();
		*/
		
		//Inputstream File
		/*
			File file = new File("/home/samuel/in.txt");
			boolean exists = file.exists();
			if(!exists) {
				System.out.println("Arquivo não existe");
				return;
			}
			FileInputStream fis = new FileInputStream(file);
			PessoasInputStream pis = new PessoasInputStream(fis);
			Pessoa[] pessoas = pis.readFile();
			PessoasOutputStream p = new PessoasOutputStream(pessoas, System.out);
			p.writeSysout();
		*/

	}
}

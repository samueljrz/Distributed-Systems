package QuestaoV;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// InvertCaseReader Sysout
		/*
			InvertCaseReader icr = new InvertCaseReader(System.in);
			String res = icr.readSysout();
			System.out.println(res);
		*/
		
		//InvertCaseReader File
		/*
			File file = new File("/home/samuel/q4.txt");
			boolean exists = file.exists();
			if(!exists) {
				System.out.println("Arquivo não existe");
				return;
			}
			FileInputStream fis = new FileInputStream(file);
			InvertCaseReader icr = new InvertCaseReader(fis);
			String res = icr.readSysout();
			System.out.println(res);
		*/
	}
}

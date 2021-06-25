package QuestaoI;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Pessoa[] pessoas = new Pessoa[5];
		
		Pessoa p1 = new Pessoa("Samuel", "12345678", 22);
		Pessoa p2 = new Pessoa("Pedro", "12345678", 42);
		Pessoa p3 = new Pessoa("Paulo", "12345678", 32);
		Pessoa p4 = new Pessoa("Peçanha", "12345678", 52);
		Pessoa p5 = new Pessoa("Picolino", "12345678", 33);
		
		pessoas[0] = p1;
		pessoas[1] = p2;
		pessoas[2] = p3;
		pessoas[3] = p4;
		pessoas[4] = p5;
		
		
		//Testar OutputStreamSysout
		/*
			PessoasOutputStream p = new PessoasOutputStream(pessoas, System.out);
			p.writeSysout();
		*/
		
		//Testar OutputStreamFile
		/*
			File file = new File("/home/samuel/out.txt");
			boolean exists = file.exists();
			if(!exists) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file, true);
			PessoasOutputStream p = new PessoasOutputStream(pessoas, fos);
			p.writeFile();
		*/
		
		//Testar OutputStreamTCP
		/*
			Socket s = null;
			try{
				int serverPort = 7896;
				s = new Socket("localhost", serverPort);    
				OutputStream out = new DataOutputStream(s.getOutputStream());
				PessoasOutputStream p = new PessoasOutputStream(pessoas, out);
				PessoasOutputStream.writeTCP();
			}catch (UnknownHostException e){System.out.println("Socket: "+e.getMessage());
			}catch (EOFException e){System.out.println("EOF: "+e.getMessage());
			}catch (IOException e){System.out.println("readline: "+e.getMessage());
			}finally {if(s!=null) try {s.close();}catch (IOException e){System.out.println("close: "+e.getMessage());}}	
		*/
	}
	

}

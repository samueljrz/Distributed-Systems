package QuestaoIV;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		//Testar InvertCaseSysout
		/*
			InvertCaseWriter icw = new InvertCaseWriter(System.out);
			icw.writeSysout("I Know YOU see SoMeHoW the WORLD wIIl ChanGE for me");
		*/
				
		//Testar InvertCaseFile
		/*
			File file = new File("/home/samuel/q4.txt");
			boolean exists = file.exists();
			if(!exists) {
				file.createNewFile();
			}else {
				file.delete();
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file, true);
			InvertCaseWriter icw = new InvertCaseWriter(fos);
			icw.writeFile("I Know YOU see SoMeHoW the WORLD wIIl ChanGE for me");
		*/
				
		//Testar InvertCaseTCP
		/*
			Socket s = null;
			try{
				int serverPort = 7896;
				s = new Socket("localhost", serverPort);    
				OutputStream out = new DataOutputStream(s.getOutputStream());
				InvertCaseWriter icw = new InvertCaseWriter(out);
				icw.writeTCP("I Know YOU see SoMeHoW the WORLD wIIl ChanGE for me");
			}catch (UnknownHostException e){System.out.println("Socket: "+e.getMessage());
			}catch (EOFException e){System.out.println("EOF: "+e.getMessage());
			}catch (IOException e){System.out.println("readline: "+e.getMessage());
			}finally {if(s!=null) try {s.close();}catch (IOException e){System.out.println("close: "+e.getMessage());}}	
		*/		
	}
}

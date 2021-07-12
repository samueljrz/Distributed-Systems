package TrabalhoII;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Socket;
import java.net.UnknownHostException;
import com.google.gson.Gson;

public class TCPClient {
	
	public static void main (String args[]) throws Exception {
		Socket s = null;
		
		DataInputStream in;
		DataOutputStream out;
		
		try{
			int serverPort = 7896;
			s = new Socket("localhost", serverPort); 
					
			in = new DataInputStream(s.getInputStream());
			out = new DataOutputStream(s.getOutputStream());
			
			Casa casa = new Casa("Azul", 7, "Rua X, numero 100, SP, Brasil");
			Apartamento ap = new Apartamento("Ceramica Preta", 8, "Rua Pinhos, numero 1955, CE, Brasil");
			Sitio sitio = new Sitio("Branco", 20, "Rua do Boi, numero 1150, MG, Brasil");
			String CorAnterior = casa.getCor();
			
			Gson gson = new Gson();
			
			//Serialização
			String data = gson.toJson(casa);
			
			out.writeUTF(data);
			
			//Desserialização
			Casa casaRecive = (Casa) gson.fromJson(in.readUTF(), Casa.class);
			System.out.println("Se a cor não for Verde, a cor " + CorAnterior + " foi alterada para Verde: ");
			System.out.println(casaRecive.toString());
			
			
			
			out.flush();
			out.close();
			in.close();					
			
		}catch (UnknownHostException e){System.out.println("Socket:"+e.getMessage());
		}catch (EOFException e){System.out.println("EOF:"+e.getMessage());
		}catch (IOException e){System.out.println("readline:"+e.getMessage());
		}finally {if(s!=null) try {s.close();}catch (IOException e){System.out.println("close:"+e.getMessage());}}
     }
}
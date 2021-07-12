package TrabalhoII;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class TCPServer {
	public static void main (String args[]) throws Exception {
		try{
			int serverPort = 7896; // the server port
			ServerSocket listenSocket = new ServerSocket(serverPort);
			System.out.println("Server is running");
			while(true) {
				Socket clientSocket = listenSocket.accept();
				Connection c = new Connection(clientSocket);
			}
		} catch(IOException e) {System.out.println("Listen socket:"+e.getMessage());}
	}
}

class Connection extends Thread {
	
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	
	public Connection (Socket aClientSocket) throws ClassNotFoundException {
		try {
			clientSocket = aClientSocket;
			in = new  DataInputStream( clientSocket.getInputStream() );
			out = new DataOutputStream ( clientSocket.getOutputStream() );
			this.start();
		} catch(IOException e) {System.out.println("Connection:"+e.getMessage());}
		
		try {			             
			
			Gson gson = new Gson();
			
			//Desserialização
			Casa casa = gson.fromJson(in.readUTF(), Casa.class);
			
			if(!(casa.getCor().compareTo("Verde") == 0)) {
				casa.setCor("Verde");
			}
			
			//Serialização
			String dataSend = gson.toJson(casa);
			out.writeUTF(dataSend);
			
			out.flush();
			out.close();
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{ try {clientSocket.close();}catch (IOException e){/*close failed*/}}

	}
}
package QuestaoIV;

import java.net.*;
import java.io.*;

public class ServerRemoteTCP {
	public static void main (String args[]) {
		try{
			int serverPort = 7896; // the server port
			ServerSocket listenSocket = new ServerSocket(serverPort);
			System.out.println("Server is running");
			while(true) {
				Socket clientSocket = listenSocket.accept();
				Connection c = new Connection(clientSocket);
			}
		} catch(IOException e) {System.out.println("Listen socket: "+e.getMessage());}
	}
}

class Connection extends Thread {
	
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	
	public Connection (Socket aClientSocket) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out = new DataOutputStream( clientSocket.getOutputStream());
			this.start();
		} catch(IOException e) {System.out.println("Connection: "+e.getMessage());}
	}
	public void run(){
		try {			             
			String word = in.readUTF();
			
			String acc = "";
			
			for(int i=0; i<word.length(); i++) {
				if (word.charAt(i)+0 <= 90) {
					acc += word.toLowerCase().charAt(i);
				}else {
					acc += word.toUpperCase().charAt(i);
				}
			}	
			System.out.println(acc);
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{ try {clientSocket.close();}catch (IOException e){/*close failed*/}}

	}
}
package QuestaoII;
import java.net.*;
import java.util.Scanner;
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
		} catch(IOException e) {System.out.println("Listen socket:"+e.getMessage());}
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
		} catch(IOException e) {System.out.println("Connection:"+e.getMessage());}
	}
	public void run(){
		try {			             
			
			Scanner entrada = new Scanner(in);
			
			String campo1 = in.readUTF();
			String campo2 = in.readUTF();
			String campo3 = in.readUTF();
			String campo4 = in.readUTF();
			String campo5 = in.readUTF();
			
			
			System.out.println(campo1);
			System.out.println(campo2);
			System.out.println(campo3);
			System.out.println(campo4);
			System.out.println(campo5);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{ try {clientSocket.close();}catch (IOException e){/*close failed*/}}

	}
}
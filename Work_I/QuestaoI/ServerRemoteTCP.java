package QuestaoI;
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
			int qtdPeople = in.read();
			
			System.out.println(qtdPeople);
			
			for(int i=0; i<qtdPeople; i++) {
				int sizeName = in.read();
				String name = in.readUTF();
				String cpf = in.readUTF();
				int age =  in.read();
				
				System.out.println("Number of bytes used to store the name: " + sizeName);	
				System.out.println("Person's name: " + name);
				System.out.println("Person's CPF: " + cpf);
				System.out.println("Person's age: " + age);
			}
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{ try {clientSocket.close();}catch (IOException e){/*close failed*/}}

	}
}
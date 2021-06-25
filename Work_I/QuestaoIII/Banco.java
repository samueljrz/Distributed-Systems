package QuestaoIII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Banco {
	Conta[] accounts;
	
	public Banco (int qtdAccounts) {
		this.accounts = new Conta[qtdAccounts];
	}
	
	public void setContas (int index, Conta account) {
		this.accounts[index] = account;
	}
	
	public Integer getCountContas() {
		return this.accounts.length;
	}
	
	public void showAccounts () {
		for ( Conta account : accounts) {
			System.out.println(account.getAccount());
		}
	}
	
	public void gravarContasArquivo(String fileName) throws IOException {
		File file = new File("/home/samuel/"+fileName);
		
		boolean exists = file.exists();
		if(!exists) {
			file.createNewFile();
		}else {
			file.delete();
			file.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(file, true);
		
		PrintWriter pw = new PrintWriter(fos);
		
		pw.println(accounts.length);
		
		for(Conta account : accounts) {
			if(account.getStatus()) {
				pw.println(account.getAgency());
				pw.println(account.getAccount());
				pw.println(account.getType());
				pw.println(account.getBalance());
			}
		}
		pw.close();
		fos.close();
	}

	public void carregarContasArquivo(String fileName) throws IOException {
		File file = new File("/home/samuel/"+fileName);
		FileInputStream fis = new FileInputStream(file);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		int qtdAccounts = Integer.parseInt(br.readLine());
				
		accounts = new Conta[qtdAccounts];
		
		for(int i=0; i<qtdAccounts; i++) {
			int agency = Integer.parseInt(br.readLine());
			int account = Integer.parseInt(br.readLine());
			int type = Integer.parseInt(br.readLine());
			double balance = Double.parseDouble(br.readLine());
			
			accounts[i] = new Conta(agency, account, type, balance);
		}
		br.close();
		fis.close();
	}
}

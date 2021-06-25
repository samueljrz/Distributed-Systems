package QuestaoIII;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Conta c1 = new Conta(2694, 10761, 178, 7);
		Conta c2 = new Conta(1934, 26342, 662, 13);
		Conta c3 = new Conta(1278, 13258, 124, 1);

		Banco banco = new Banco(3);
		
		banco.setContas(0, c1);
		banco.setContas(1, c2);
		banco.setContas(2, c3);
		
		banco.gravarContasArquivo("arquivo.txt");
		banco.carregarContasArquivo("arquivo.txt");
		banco.showAccounts();
	}
}

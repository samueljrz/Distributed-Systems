package QuestaoIII;

public class Conta {

	private int agency;
	private int account;
	private int type;
	private double balance;
	private Boolean status;
	
	public Conta (int account, int agency, int type, double balance) {
		this.agency = agency;
		this.account = account;
		this.type = type;
		this.balance = balance;
		this.status = true;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
	

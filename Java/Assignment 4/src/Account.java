
public class Account {
	private String name, id;
	private int balance;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int Balance() {
		return balance;
	}

	public int Credit(int amount) {
		return amount;
	}
	
	public int Debit(int amount){
		return amount;
	}
	
	public String TranferTo(Account account, int amount){
		return account.name + " tranfer amount " +  amount + "  VND to " + account.getName();
	}

}

package BankManagement;

public class Bank {
	private int id=101;
	private String name="Kalaivani";
	private double Balance=65575;
	private int pin=6379;
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", Balance=" + Balance + ", pin=" + pin + "]";
	}
	public Bank() {
		super();
	}
	public Bank(int id, String name, double balance, int pin) {
		super();
		this.id = id;
		this.name = name;
		Balance = balance;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}

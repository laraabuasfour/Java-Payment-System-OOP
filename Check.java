//name: lara saleh abu asfour
//student id number: 1221484
//lecture section: 5
//lab section: 9L

package project;

public class Check extends CustomerPayment implements Payable  {
	private int accountNumber;
	private double accountBalance;
	private int type;
	final static int CASHIER = 1,CERTIFIED = 2,PERSONAL = 3;
	
	public Check() {
		super();
	}
	
	public Check(String customerName, int customerId, double amount ,int accountNumber,double accountBalance,int type) {
		super(customerName, customerId, amount);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Check [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type
				+ ", customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}
	
	@Override
	protected double calculatePayment() {
		return  amount;
	}
	
	@Override
	public boolean isAuthorized() {
		if (type==CASHIER || amount<= accountBalance) {
			this.deductAmountFromBalance();
			return true; 
		}
		else {
		return false;
		}
	 }
	 
	public void deductAmountFromBalance() {
		if(type != CASHIER) {
			accountBalance -= getAmount();
		}
	}

}

//name: lara saleh abu asfour
//student id number: 1221484
//lecture section: 5
//lab section: 9L

package project;

public class Cash extends CustomerPayment {
	private double discountRate;

	public Cash() {
		super();
	}

	public Cash(String customerName, int customerId, double amount, double discountRate) {
		super(customerName, customerId, amount);
		this.discountRate=discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ", customerName=" + customerName + ", customerId=" + customerId
				+ ", amount=" + amount + "]";
	}

	@Override
	protected double calculatePayment() {
		return amount - discountRate * amount /100 ; 
	}

}

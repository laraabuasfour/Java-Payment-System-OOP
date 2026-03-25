//name: lara saleh abu asfour
//student id number: 1221484
//lecture section: 5
//lab section: 9L

package project;

public abstract class CustomerPayment implements Comparable<CustomerPayment> {
    protected String customerName;
    protected int customerId;
    protected double amount;
    	
	public CustomerPayment() {
		super();
	}

	public CustomerPayment(String customerName, int customerId, double amount) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "CustomerPayment [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount
				+ "]";
	}
	
	 protected abstract double calculatePayment();
	 
	    void printPaymentInfo() {
	    	System.out.println(toString() + " Payment " + calculatePayment());
	    	
	    }
	    
	    public int compareTo(CustomerPayment c) {
	    	if (this.calculatePayment() > c.calculatePayment())
	    		return -1;
	    	if (this.calculatePayment() < c.calculatePayment())
	    		return 1;
	    	else 
	    		return 0;
	    }

}

//name: lara abu asfour

package project;
import java.util.*;

public class CreditCard extends CustomerPayment implements Payable {
    private double chargingFee;
    private  Date expiryDate;
    
	public CreditCard() {
		super();
	}
	
	public CreditCard(String customerName, int customerId, double amount,double chargingFee,Date expiryDate) {
		super(customerName, customerId, amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}

	public double getChargingFee() {
		return chargingFee;
	}
	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate=" + expiryDate + ", customerName="
				+ customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}
	
	protected double calculatePayment() {
		return amount + chargingFee;
	}
	
	@Override
	public boolean isAuthorized() {
		if (this.expiryDate.compareTo(new Date()) >= 0 )
			return true;
		else
		return false;
	}
    
}

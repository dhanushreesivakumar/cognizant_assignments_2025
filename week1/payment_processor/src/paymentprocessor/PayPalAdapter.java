package paymentprocessor;

public class PayPalAdapter {
	 private PayPalGateway payPal;

	    public PayPalAdapter() {
	        this.payPal = new PayPalGateway();
	    }

	    public void processPayment(double amount) {
	        payPal.makePayment(amount);
	    }
}
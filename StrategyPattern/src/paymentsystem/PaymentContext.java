package paymentsystem;

public class PaymentContext {
	private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            System.out.println("Payment strategy not set.");
            return;
        }
        strategy.pay(amount);
    }
}

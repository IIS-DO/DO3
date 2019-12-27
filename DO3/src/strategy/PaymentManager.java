package strategy;

public class PaymentManager implements Payment{
	private Payment payment;
	
	public PaymentManager(Payment payment) {
		this.payment = payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public void pay(int amount) {
		payment.pay(amount);
		
	}

}

package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.Payment;

public interface IServicePayment {

	
	public int addPayment(Payment payment);
	public List<Payment> getAllPayment();
	public Payment updatePayment(Payment p);
	public void deleteById(int Payment_id);
	public void affecterBillPayment(int payment_id, int bill_id);

}
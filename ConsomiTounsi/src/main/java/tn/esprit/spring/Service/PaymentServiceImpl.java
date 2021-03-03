package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import tn.esprit.spring.Repository.BillRepository;
import tn.esprit.spring.Repository.CommandRepository;
import tn.esprit.spring.Repository.PaymentRepository;
import tn.esprit.spring.Repository.ProductRepository;
import tn.esprit.spring.entities.Bill;
import tn.esprit.spring.entities.Command;
import tn.esprit.spring.entities.Payment;


@Service
public class PaymentServiceImpl implements IServicePayment{

	
	@Autowired
	CommandRepository commandRepository;
	@Autowired
	BillRepository billRepository;
	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	ProductRepository productRepository;

	@Override
	public int addPayment(Payment payment) {
		return paymentRepository.save(payment).getPayment_id();
	}
	
	@Override
	public List<Payment> getAllPayment() {
		return(List<Payment>) (paymentRepository.findAll());
			}
	@Override
	public Payment updatePayment(Payment p) {
		
		return paymentRepository.save(p);

	}

	public void affecterBillPayment(int payment_id, int bill_id) {
		Bill bill = billRepository.findById(bill_id).get();
		Payment payment =paymentRepository.findById(payment_id).get();
		if (ObjectUtils.isEmpty(bill) && !ObjectUtils.isEmpty(payment))
		payment.setBill(bill);
		paymentRepository.save(payment);
	}
	
	@Override
	public void deleteById(int Payment_id) {
		
		paymentRepository.deleteById(Payment_id );
	}
}
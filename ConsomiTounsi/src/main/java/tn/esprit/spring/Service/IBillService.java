package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.Bill;

public interface IBillService {



	public void affecterCommandeABill(int reference, int bill_id) ;
	public Bill updateBill(Bill c) ;
	public void deleteByBillId(int bill_id);
	public List<Bill> getAllBillM() ;
	public String addBillM(Bill bill);
	public List<Bill> listAll();
	int update_prix();
	public List<?> getBillByEtat(String payment_type);
	List<?> getafficher();
	List<?> getBillByclient(int client_id);
	List<?> getBillByclientname(String first_name);

}

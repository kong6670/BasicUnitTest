import static org.junit.Assert.*;  

import org.junit.Test;

public class BankAccountTest {

	public void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(),35);
	}
	
	public void testWhithDraw() {
		BankAccount acc = new BankAccount(45);
		acc.Whithdraw(50);
		assertEquals(acc.getBalance(),65);

}
}

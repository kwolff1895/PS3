package base;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;



public class AccountTests {
	
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
		Date dateCreated;
		@BeforeClass
		public static void setUpBeforeClass() throws Exception{
		}
		
		@AfterClass
		public static void tearDownAfterClass() throws Exception{
		}
		
		@Before
		public void setUp() throws Exception{
		}
		
		@After 
		public void tearDown() throws Exception{
		}
	// test methods
	@Test(expected=InsufficientFundsException.class)
		public void testWithdraw()throws InsufficientFundsException{
			double amount = 2500;
				if (amount <= balance){
					balance = balance - amount;
				}
				else{
					double needs = amount - balance;
					throw new InsufficientFundsException(needs);
				}
				assertTrue(balance == 17500);
				}
	@Test(expected=InsufficientFundsException.class)
	public void testWithdraw2()throws InsufficientFundsException{
		double amount = 50000;
			if (amount <= balance){
				balance -= amount;
			}
			else{
				double needs = amount - balance;
				throw new InsufficientFundsException(needs);
			}
			assertTrue(balance == 20000);
			}
			
	@Test
	public final void testDeposit(){
			double amount = 3000;
			balance+= amount;
			boolean test = (balance == 23000); 
			assertTrue(test);
			}
	
	@Test
	public void testEverything(){
		System.out.println("Account Balance =$ " + balance + "Monthly Interest= " + (balance*(annualInterestRate/12)) + "Date Account Created: "+ dateCreated);
	}
}



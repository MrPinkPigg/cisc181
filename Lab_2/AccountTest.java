package cisc181.Lab_2;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

import org.junit.Test;

import static org.junit.Assert.*;


public class AccountTest  {
	
	@Test
	public void test_series() {
		System.out.println("Testing Account Class Problem #4");
		Account testAccount = new Account("John Doe", 0, 0.005);
		testAccount.deposit(50);
		testAccount.withdraw(10);
		testAccount.addMonthlyInterest();
		assertEquals(40.2, testAccount.getBalance(), 0.01);
	}

	@Test
	public void deposit() throws Exception {
		System.out.println("Testing deposit mutator");
		Account depositAccount = new Account("Joe", 50, .007);
		depositAccount.deposit(50);
		assertEquals(100, depositAccount.getBalance(), .01);
	}

	@Test
	public void withdraw() throws Exception {
		System.out.println("Testing withdraw mutator");
		Account withdrawAccount = new Account("Joe", 50, .007);
		withdrawAccount.withdraw(50);
		assertEquals(0, withdrawAccount.getBalance(), .01);
	}

	@Test
	public void addMonthlyInterest() throws Exception {
		System.out.println("Testing addMonthlyInterest mutator");
		Account interestAccount = new Account("Joe", 50, .007);
		interestAccount.addMonthlyInterest();
		assertEquals(50.35, interestAccount.getBalance(), .01);
	}

	@Test
	public void test_payoffDebt() {
		System.out.println("Testing Account Class Problem #5");

		Account positive = new Account("John Doe", 500.0, 0);
		Account negative = new Account("John Doe", -250.0, 0.01, -5000);

		// this tests the case where the object shouldn't pay off anything since we can't use a negative balance
		//  to payoff a positive balance account
		negative.payOffBalance(positive);
		assertEquals(-250.0, negative.getBalance(), 0.0001);
		assertEquals(500.0, positive.getBalance(), 0.0001);

		// this tests the case where the object should pay off the entire negative balance
		positive.payOffBalance(negative);
		assertEquals(0.0, negative.getBalance(), 0.0001);
		assertEquals(250.0, positive.getBalance(), 0.0001);

		Account otherNegative = new Account("John Doe", -1000.0, 0.01, -5000);

		// this tests the case where the object should pay off as much as it can, but will still leaves
		//  some negative balance because there is not enough money
		//  in the positive account
		positive.payOffBalance(otherNegative);

		assertEquals(-750.0, otherNegative.getBalance(), 0.0001);
		assertEquals(0.0, positive.getBalance(), 0.0001);
	}
}

package ca.uwo.csd.cs2212.travisvyas;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestBankAccount {

  @Test
  public void testDebitWithSufficientFunds(){
    BankAccount account = new BankAccount(20);
    double amount = account.debit(6);
    Assert.assertEquals(6.0, amount);
  }

	@Test
	public void testDebitWithInsufficientFunds(){
		BankAccount account = new BankAccount(10);
		double amount = account.debit(11);
		Assert.assertEquals(10.0, amount);
	}


}

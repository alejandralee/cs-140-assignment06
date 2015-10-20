package assignment06;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BankAccountGroupTest {

	@Test
	public void test() {

		ArrayList<BankAccount> testArray = new ArrayList<BankAccount>();
		testArray.add(new BankAccount(7000));
		testArray.add(new BankAccount(8000));
		testArray.add(new BankAccount(400));
		testArray.add(new BankAccount(6000));
		testArray.add(new BankAccount(10));

		BankAccountGroup testGroup = new BankAccountGroup(testArray);
		
		ArrayList<BankAccount> expectedBankArrayList = new ArrayList<BankAccount>();
		expectedBankArrayList.add(new BankAccount(4282));
		expectedBankArrayList.add(new BankAccount(4282));
		expectedBankArrayList.add(new BankAccount(4282));
		expectedBankArrayList.add(new BankAccount(4282));
		expectedBankArrayList.add(new BankAccount(4282));

		BankAccountGroup expectedTestArrayList = new BankAccountGroup(expectedBankArrayList);
		
		testGroup.evenUpAccounts();
		
		System.out.println(testGroup);
		
		for (int i = 0; i < 5; i++)
		{
			assertEquals(expectedTestArrayList.getBalance(i), testGroup.getBalance(i), .001);
		}
	}

}

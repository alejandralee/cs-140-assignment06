package assignment06;

import java.util.ArrayList;

public class BankAccountGroup{
	
	private ArrayList<BankAccount> bankAccountArray = new ArrayList<BankAccount>();
	
	
	//Constructor
	public BankAccountGroup(ArrayList<BankAccount> arr){
		this.bankAccountArray = arr;
	}
	
	
	//Methods
	public double getBalance(int i){
		double accountBalance = bankAccountArray.get(i).getBalance();
		if (bankAccountArray.get(i)!=null){
			return accountBalance;
		}
		else{
			return 0;
			//throw new NullPointerException("Account Balance is null");
		}
	}
	
	public double removeAccount(int i){
		double accountBalance = bankAccountArray.get(i).getBalance();
		if (bankAccountArray.get(i)!=null){
			bankAccountArray.remove(i);
			return accountBalance;
		}
		else{
			return 0;
		}
	}
	

	/**Finds the average of all BankAccounts in the ArrayList. It withdraws or deposits
	 * money so all accounts will have the same amount(the average).
	 *  
	 * no param
	 */
	public void evenUpAccounts(){
		
			double sum = 0.0;
			double averageAmount = 0;

			double difference;
			for(int i = 0; i < bankAccountArray.size(); i++){
				if (bankAccountArray.get(i)!=null){
					sum = sum + bankAccountArray.get(i).getBalance();
				}
			}
			averageAmount = sum/bankAccountArray.size();
			
			for (int i=0; i<bankAccountArray.size(); i++){
				if (bankAccountArray.get(i)!= null){
					if (bankAccountArray.get(i).getBalance() > averageAmount){
						difference = bankAccountArray.get(i).getBalance() - averageAmount;
						bankAccountArray.get(i).withdraw(difference);
					}
					else if (bankAccountArray.get(i).getBalance() < averageAmount){
						difference = averageAmount - bankAccountArray.get(i).getBalance();
						bankAccountArray.get(i).deposit(difference);
					}
				}
			}

	}
	public double depositLowest(double amount){
		double lowestAmount = 99999999;
		for(int i = 0; i < bankAccountArray.size(); i++){
			if (bankAccountArray.get(i)!=null){
				if (bankAccountArray.get(i).getBalance()<lowestAmount){
					lowestAmount = bankAccountArray.get(i).getBalance();
				}
			}
		}
		return 0;
	}
	public double withdrawHighest(double amount){
		double highestBalance = 0;
		int highestAccount = 0;
		for (int i=0; i<bankAccountArray.size(); i++){
			if(bankAccountArray.get(i) != null){
				if (bankAccountArray.get(i).getBalance()>highestBalance){
					highestBalance = bankAccountArray.get(i).getBalance();
					highestAccount = i;
				}
			}

		}
		if (amount<=bankAccountArray.get(highestAccount).getBalance()){
			bankAccountArray.get(highestAccount).withdraw(amount);
			return 0;
		}
		else{
			throw new IllegalArgumentException("No account with sufficient funds");
		}
		
	}
	
	/**
	public void depositInParts(double amount){
		int numNonNullAccounts = this.countNonNull();
		double newAmount = amount/numNonNullAccounts;
		if (this.countNonNull() != 0){
			for (int i=0; i<bankAccountArray.size();i++){
				if (bankAccountArray.get(i)!= null && numNonNullAccounts != 0){
					this.depositLowest(newAmount);
				}
			}
		}
	}
	**/
	public String toString() {
        StringBuilder bldr = new StringBuilder();
        if(bankAccountArray == null) bldr.append("null\n");
        else if(bankAccountArray.size() == 0) bldr.append("empty\n");
        else for(int i = 0; i < bankAccountArray.size(); i++)
            bldr.append("account " + i + ((bankAccountArray.get(i)==null?" is null\n":
                " has balance " + bankAccountArray.get(i).getBalance() + "\n")));
        return bldr.toString();
    }
	public void addAccount(BankAccount acc){
		if(acc!=null){
			bankAccountArray.add(acc);
		}
	}
}
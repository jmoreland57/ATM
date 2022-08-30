
import java.util.*;

public class ATM {

	private HashMap<Integer,Account> accounts; //creates hashmap of accounts
	
	public ATM() { //creates atm
		accounts = new HashMap<Integer,Account>(); //initiales hashmap of accounts
	}
	
	public boolean openAccount(int ID) {//creates new account w/ ID and no money; returns false if id already used
		return (openAccount(ID,0));
	}
		
	public boolean openAccount(int ID, double money) {//creates new acc w/ ID and a init money; returns false if id already used
		if (accounts.containsKey(ID)||money*1000%10!=0) {//checks if account id exists
			return false;//returns false
		}
		accounts.put(ID,new Account(money));//creates new account and puts it in accounts hashmap
		return true;//returns true
	}
	
	public boolean closeAccount (int ID) {//closes account based on ID; returns false if no such ID or acc has money in it
		if (!accounts.containsKey(ID)||accounts.get(ID).getMoney()!=0) {//checks to see if no account has such ID or if money in account
			return false;//returns false
		}
		accounts.remove(ID);//removes account
		return true;//returns true
	}
	
	public double checkBalance (int ID) { //returns balance of account based on ID
		if (accounts.containsKey(ID)) {
			return (accounts.get(ID).getMoney()); //returns balance
		}
		return 0.0;
	}
	
	public boolean depositMoney (int ID, double money) { //changes the amount of money in an account; if there is no such account, or if the amount is not in dollars and cents, or the acc doesn't have enough money to take out the requested amount, returns false
		if (!accounts.containsKey(ID)||money*1000%10!=0) {
			return false;
		}
		return (accounts.get(ID).deposit(money));
	}
	
	public boolean withdrawMoney (int ID, double money) {//returns deposit with a negative amount of money
		if (money < 0||money*1000%10!=0) {
			return false;
		}
		return(depositMoney(ID,-money));
	}
	
}

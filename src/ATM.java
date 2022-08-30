
import java.util.*;

public class ATM {

	private HashMap<Integer,Account> accounts; //creates hashmap of accounts
	
	public ATM() { //creates atm
		accounts = new HashMap<Integer,Account>(); //initiales hashmap of accounts
	}
	
	public boolean openAccount(int ID) {//creates new account w/ ID and no money; returns false if id already used
		if (accounts.containsKey(ID)) {//checks if account id exists
			return false;//returns false
		}
		accounts.put(ID,new Account());//creates new account and puts it in accounts hashmap
		return true;//returns true
	}
		
	public boolean openAccount(int ID, double money) {//creates new acc w/ ID and a init money; returns false if id already used
		if (accounts.containsKey(ID)) {//checks if account id exists
			return false;//returns false
		}
		accounts.put(ID,new Account(money));//creates new account and puts it in accounts hashmap
		return true;//returns true
	}
	
	public boolean closeAccount (int ID) {//closes account based on ID; returns false if no such ID or acc has money in it
		if (!accounts.containsKey(ID)||accounts.get(ID).getMoney()==0) {//checks to see if no account has such ID or if 
			return false;
		}
		accounts.remove(ID);
		return true;
	}
	
	public double checkBalance (int ID) {
		return (accounts.get(ID).getMoney());
	}
	
	public boolean deposit (int ID, double money) {
		if (!accounts.containsKey(ID)) {
			return false;
		}
		accounts.get(ID).deposit(money);
		return true;
	}
	
	public boolean withdraw (int ID, double money) {
		if (!accounts.containsKey(ID)) {
			return false;
		}
		accounts.get(ID).deposit(-money);
		return true;
	}
	
}

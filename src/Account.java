
import java.util.*;
public class Account {

	private double money;//creates private double money
	
	public Account () {//creates account with no money
		money = 0;
	}
	
	public Account(double nmoney) {//creates account with specific amount of money
		money = nmoney;
	}
	
	public double getMoney() {//gets the money in the account
		return money;
	}
	
	public boolean deposit(double change) {//changes the money in the account; returns false if the change is to make money less and such change would make the money have negative money
		if (change < 0 && change * -1 > money) {//checks if withdraw request is bigger than amt in acc
			return false;//returns false
		}
		money += change;//changes money by specified amount
		money = fixMoney(money);
		return true;//returns true
	}
	
	private double fixMoney(double money) {//fixes dumb binary moments
		if (money * 1000 % 10 != 0) {
			money = money * 100;
			money = Math.round(money);
			money = money / 100;
		}
		return money;
	}
	
}


import java.util.*;
public class Account {

	private double money;
	
	public Account () {
		money = 0;
	}
	
	public Account(double nmoney) {
		money = nmoney;
	}
	
	public double getMoney() {
		return money;
	}
	
	public boolean deposit(double change) {
		if (change < 0 && change * -1 > money) {
			return false;
		}
		money += change;
		return true;
	}
	
}

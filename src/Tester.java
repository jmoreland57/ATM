
import java.util.*;

public class Tester {
	public static void main (String[]args) {
		ATM atm = new ATM();
		System.out.println(atm.openAccount(1,10));
		System.out.println(atm.checkBalance(1));
		System.out.println(atm.deposit(1,5));
		System.out.println(atm.checkBalance(1));
		System.out.println(atm.withdraw(1, 2));
		System.out.println(atm.checkBalance(1));
		System.out.println(atm.withdraw(1, 100));
		System.out.println(atm.checkBalance(1));
	}
}

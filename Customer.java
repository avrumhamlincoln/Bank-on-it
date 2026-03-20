import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable{
	CheckingAccount checking;
	SavingsAccount savings;

	public static void main(String[] args) {
		
	}

	public Customer(){
		this.checking = new CheckingAccount();
		this.savings = new SavingsAccount();
	}

	public Customer(String userName, String pin){
		this.checking = new CheckingAccount();
                this.savings = new SavingsAccount();

		super.setUserName(userName);
		super.setPin(pin);
	}

	public void start(){
		
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("\nMENU");
		System.out.println("1: Manage Checking Account");
		System.out.println("2: Manage Savings Account");
		System.out.println("3: Change PIN");
		System.out.println("0: quit");
		System.out.println();
		System.out.println("Make a selection 0-3: ");
		String response = input.nextLine();
	}
}

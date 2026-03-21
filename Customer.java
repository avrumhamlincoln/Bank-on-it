import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable{
	CheckingAccount checking = new CheckingAccount();
	SavingsAccount savings = new SavingsAccount();

	public static void main(String[] args) {
		Customer customer = new Customer();

		if (customer.login()){
			customer.start();
		}

		else {
			System.out.print("\nError: Login unsuccessful :(");
		}
	}

	public Customer(){
		this.setUserName("Alice");
		this.setPin("0000");
	}

	public Customer(String userName, String pin){
		super.setUserName(userName);
		super.setPin(pin);
	}

	public void start(){
		boolean keepGoing = true;
		String choice;

		System.out.println("\nWelcome, " + getUserName() + "!");
		this.getReport();

		while (keepGoing){
			choice = menu();

			if (choice.equals("0")) {
            			keepGoing = false;
            			System.out.println("\nLoging out ...");
        		}

			else if (choice.equals("1")){
            			System.out.println("\n---Checking Account--- ");
				checking.start();
        		}

			else if (choice.equals("2")) {
           			System.out.println("\n---Savings Account---");
				savings.start();
			}

			else if (choice.equals("3")) {
                                System.out.println("\n---Change PIN--- ");
				changePin();
			}

			else {
				System.out.println("\nPlease enter a valid selection ");
			}
		}
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("\n---MENU---");
		System.out.println("1: Manage Checking Account");
		System.out.println("2: Manage Savings Account");
		System.out.println("3: Change PIN");
		System.out.println("0: Log out");
		System.out.println();
		System.out.println("Make a selection 0-3: ");
		String response = input.nextLine();
		return response;
	}

	public void changePin(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your new PIN: ");
		String newPin = input.nextLine();
		super.setPin(newPin);
		System.out.println("\nYour PIN has been updated.");
	}

	public String getReport() {
		return "\nHere is your report ..."+ "\nChecking Account Balance: " + checking.getBalanceString() + "\nSavings Account Balance: " + savings.getBalanceString();
	}
}

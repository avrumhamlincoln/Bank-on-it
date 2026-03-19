import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable{
	double balance;

	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	}

	public CheckingAccount(){
		this.balance = 0d;
	}
	
	public CheckingAccount(double balance){
		this.balance = balance;
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("\nMENU");
		System.out.println("1: check balance");
		System.out.println("2: make a deposit");
		System.out.println("3: make a withdrawl");
		System.out.println("0: quit");
		System.out.println();
		System.out.println("Make a selection 0-3: ");
		String response = input.nextLine();
		return response;
	}

	public void start(){
		boolean keepGoing = true;
		String choice;

		while (keepGoing){
			choice = menu();

			if (choice.equals("0")) {
            			keepGoing = false;
            			System.out.println("Exiting program ...");
        		}

			else if (choice.equals("1")){
            			System.out.println("Checking balance ... ");
				this.checkBalance();
        		}

			else if (choice.equals("2")) {
           			System.out.println("Making a deposit ... ");
				this.makeDeposit();

			}

			else if (choice.equals("3")) {
                                System.out.println("Making a withdrawl ... ");
				this.makeWithdrawl();
			}

			else {
				System.out.println("Please enter a valid selection ");
			}
		}
	}

	public double getBalance(){
		return this.balance;
	}

	public String getBalanceString(){
		String result = String.format("$%.02f", this.balance);
		return result;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	private double getDouble(){
		Scanner input =  new Scanner(System.in);
		String restultString = input.nextLine();
		double result = 0d;

		try{
			result = Double.parseDouble(restultString);
		}

		catch (Exception e){
			System.out.println("Not a good value. Changing to 0");
			result = 0d;
		}

		return result;
	}

	public void checkBalance(){
		System.out.print("Current balance: ");
		System.out.println(this.getBalanceString());
	}

	public void makeDeposit(){
		System.out.print("How much do you want to deposit? ");
		double deposit = this.getDouble();
		this.balance += deposit;
		System.out.println("New balance; " + this.getBalanceString());
	}

	public void makeWithdrawl(){
		System.out.print("How much do you want to withdrawl? ");
		double withdrawl = this.getDouble();
		if (withdrawl > this.balance){
			System.out.println("Insufficent funds");
		}

		else{
			if (withdrawl > 0){
				this.balance -= withdrawl;
			}
			
			else{
				System.out.print("Please enter a positive value");
			}
		}
	}
}

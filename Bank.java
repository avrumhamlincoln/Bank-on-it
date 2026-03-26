import java.util.*;
import java.io.*;

public class Bank implements HasMenu{
	Admin admin = new Admin();
	CustomerList customers = new CustomerList();

	public static void main (String[] args){
		new Bank();
	}

	public Bank(){
		this.loadSampleCustomers();
		this.start();
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("\n---BANK MENU---");
		System.out.println("1: Customer Login");
		System.out.println("2: Admin Login");
		System.out.println("0: Quit");
		System.out.println();
		System.out.println("Make a selection 0-2: ");
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
            			System.out.println("\nExiting program ...");
        		}

			else if (choice.equals("1")){
            			System.out.println("\n---Customer--- ");
        			this.loginAsCustomer();
			}

			else if (choice.equals("2")) {
           			System.out.println("\n---Admin---");
				if (this.admin.login()){
                                        startAdmin();
				}
			}

			else {
				System.out.println("Please enter a valid selection ");
			}
		}
	}

	public void startAdmin(){
		boolean keepGoing = true;
                String choice;

                while (keepGoing){
			choice = admin.menu();

			if (choice.equals("0")) {
            			keepGoing = false;
            			System.out.println("Going home ...");
        		}

			else if (choice.equals("1")){
            			System.out.println("\nFull customer report ... ");
				this.reportAllUsers();
        		}

			else if (choice.equals("2")) {
           			System.out.println("\nAdd user ... ");
				this.addUser();
			}

			else if (choice.equals("3")) {
                                System.out.println("\nApply intrest rate ... ");
				this.applyIntrest();
			}

			else {
				System.out.println("Please enter a valid selection ");
			}
		}
	}

	public void loadSampleCustomers(){
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Avrum", "0322"));
		customers.add(new Customer("Malissa", "8023"));
	}

	public void saveCustomers(){
	
	}

	public void loadCustomers(){
	
	}

	public void reportAllUsers(){
		for (Customer customer: customers){
			System.out.println(customer.getReport());
		}
	}

	public void addUser(){
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String userName = input.nextLine();
		System.out.print("PIN: ");
		String pin = input.nextLine();
		customers.add(new Customer(userName, pin));
	}

	public void applyIntrest(){
		for (Customer customer: customers){
			customer.savings.calcIntrest();
		}	
	}

	public void loginAsCustomer(){
		Scanner input = new Scanner(System.in);
                System.out.print("Username: ");
                String userName = input.nextLine();
                System.out.print("PIN: ");
                String pin = input.nextLine();

		Customer currentCustomer = null;

		for (Customer customer: customers){
			if (customer.login(userName, pin)){
				currentCustomer = customer;
			}
		}

		if (currentCustomer == null){
			System.out.println("Customer not found");
		}

		else {
			currentCustomer.start();
		}
	}
}

class CustomerList extends ArrayList<Customer> {};

import java.util.*;
import java.io.*;

public class Bank implements HasMenu{
	Admin admin = new Admin();
	CustomerList customers = new CustomerList();

	public static void main (String[] args){
		new Bank();
	}

	public Bank(){
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
        		}

			else if (choice.equals("2")) {
           			System.out.println("\n---Admin---");
			}

			else {
				System.out.println("Please make a selection 0-2");
			}
		}
	}
}

class CustomerList extends ArrayList<Customer> {};

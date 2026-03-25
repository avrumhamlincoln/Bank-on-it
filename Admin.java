import java.util.*;
import java.io.*;

public class Admin extends User implements HasMenu, Serializable{
        public static void main(String[] args){
                Admin a = new Admin();
                a.login();
        }

        public Admin(){
                this.userName = "admin";
                this.pin = "0000";
        }

        public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("\n---ADMIN MENU---");
		System.out.println("1: Full customer report");
		System.out.println("2: Add user");
		System.out.println("3: Apply intrest to savings accounts");
		System.out.println("0: Exit admin");
		System.out.println();
		System.out.println("Make a selection 0-3: ");
		String response = input.nextLine();
		return response;
        }

	public void start(){
	
	}

	public String getReport(){
		return "\nHere is your report ..."+ "\nAdmin userName: " + this.getUserName() + "\nAdmin PIN: " + this.getPin();
	}

}

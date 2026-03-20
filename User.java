import java.io.*;
import java.util.*;

public abstract class User implements HasMenu, Serializable {
	private String userName;
    	private String pin;

	public boolean login(){
		Scanner input = new Scanner(System.in);
		boolean result = false;

		System.out.print("Username: ");
		String userNameIn = input.nextLine();

		if (userNameIn.equals(this.userName)){
			System.out.print("PIN: ");
			String pinIn = input.nextLine();

			if (pinIn.equals(this.pin)){
				System.out.println("Login Sucessful!");
				result = true;
			}

			else {
				System.out.println("Incorrect PIN");
			}
		}

		else {
			System.out.println("Incorrect Username");
		}

		return result;
	}

	public boolean login(String userNameIn, String pinIn){
		boolean result = false;
		
		if (userNameIn.equals(this.userName) && pinIn.equals(this.pin)){
			result = true;
		}

		return result;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPin(String pin){
		if (pin.matches("^\\d{4}$")){
			this.pin = pin;
		}
			
		else {
			System.out.print("Make sure your PIN is only four numbers. Setting PIN to 0000");
			this.pin = "0000";
		}
        }

	public String getPin(){
                return this.pin;
        }

	public abstract String getReport();
}

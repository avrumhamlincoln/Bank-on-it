import java.util.*;

public class SavingsAccount extends CheckingAccount{
	double intrestRate = .01d;

	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}

	public void setIntrestRate(double intrestRate){
		this.intrestRate = intrestRate;
	}

	public double getInterstRate(){
		return this.intrestRate;
	}

	public void calcIntrest(){
		double intrestAmmount = this.balance * this.intrestRate;
		this.balance += intrestAmmount;
		System.out.println("New balance: " + this.getBalanceString());
	}
}

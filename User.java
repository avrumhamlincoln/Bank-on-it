import java.io.*;

public abstract class User implements HasMenu, Serializable {
	private String userName;
    	private String pin;

	public boolean login(){
		return false;
	}

	public boolean login(String userName, String pin){
		if (this.userName != "" && this.pin != ""){
			return this.userName.equals(userName) && this.pin.equals(pin);
		}

		else{
			return false;
		}
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPin(String pin){
                this.pin = pin;
        }

	public String getPin(){
                return this.pin;
        }

	public abstract String getReport();
}

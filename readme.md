#HasMenu() interface
```
string menu()
void start()
```

#CheckingAccount() class, HasMenu
```
double balance
------------------
    CheckingAccount()
        creates a
    CheckingAccount(double balance)
    main()
        creates a new checking account
        calls start
    string menu()
        provides menu options
    void start()
           starts the logic for selecting menu options
    double getBalance()
        returns balance
    string getBalanceString()
        returns balance formatted like money $xx.xx
    void setBalance(double balance)
        changes balance
    void checkBalance()
        returns balance and prints with formating
    private double getDouble()
        makes sure we take the value in a a double
    void makeDeposit()
        adds to balance
    void makeWithdrawal
        removes form balance
```

#SavingsAccount() class extends checking
```
double interestRate
-----------------------
    main()
        creates a new checking account but in the savings account class
    calcInterest()
        adds intrest earned to account balance
    void setInterestRate()
        pulls in intrest rate from double
    double getInterestRate()
        returs the intrest rate
```

#User() class, HasMenu
```
string userName
string PIN
------------------------
    boolean login()
        login for when we don't know username and PIN
    boolean login(userName, PIN)
        login for when we do know username and PIN
    void setUserName(userName)
        sets username to the parameter
    string getUserName()
        returns username
    void setPIN(PIN)
        sets PIN to the parameter
    string getPIN()
        returns PIN
    abstract string getReport()
```

#Customer() class extends User
```
CheckingAccount checking 
SavingsAccount savings 
------------------------------
    void main()
        creates a customer and starts login
    Customer()
        sets initial username and pin
    Customer(usernName, PIN)
        does the same but with the parameter
    void start()
        logic for menu
    string menu()
        provides menu options
    void changePin()
        reasigns PIN value
    string getReport()
        returns balances for all accounts with formating
```

#Admin() class extends User implements HasMenu, Serializable
```
    Admin()
    string menu()
    void start()
    string getReport()
```

#Bank() class implements HasMenu
```
   Bank()
    void main()
    void loadSampleCustomers()
    void saveCustomers()
    void loadCustomers()
    void reportAllUsers()
    void addUser()
    void applyInterest()
    void loginAsCustomer()
    string menu()
    void start()
    void startAdmin()
```

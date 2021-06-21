package constructor;

public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Bank(){
        this(0000,0000,"Default","default@mail.com","no Phone");
        System.out.println("Default data settled.");
    }

    public Bank(String customerName, String customerEmail, String customerPhoneNumber){
        this(0000,0000,customerName,customerEmail,customerPhoneNumber);
        System.out.println("Default data settled for balance and account number.");
    }

    public Bank(int number, double balance, String customerName, String customerEmail,
                   String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public double deposit(double deposit){
        balance += deposit;
        return balance;
    }
    public double withdraw(double withdraw){
        if(withdraw>balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= withdraw;
        }
        return balance;
    }

}

public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Bank(){
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

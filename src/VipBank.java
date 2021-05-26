public class VipBank {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipBank(){
        this("Default name VIP","default@mail.com",10000);
        System.out.println("Default VIP account settled");
    }

    public VipBank(String name, double creditLimit){
        this(name,"default@mail.com",creditLimit);
        System.out.println("Default VIP account settled");
    }


    public VipBank(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

}

package day2;

public class BankAccount {
    //States

    //Get but not set
   private String accountNumber = "123456789";

   //Get and set both allowed
   private String accountHolderName;

   //Get and set both allowed
   private String accountType;

    //Get and set both allowed
     private String connectedMobileNumber;

    //Get and set both allowed
    private String address;

    //Get and set both allowed
    private String bankName;

    //Get and set both allowed
    private String bsbNumber;

    //Set but not get allowed
    private double accountBalance;
    private String socialSecurityNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;

    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBsbNumber() {
        return bsbNumber;
    }

    public void setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Behavior
    // Open Account
    // Close Account
    // Deposit
    //Withdraw
    //Transfer

}

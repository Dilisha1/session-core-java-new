package day10;

/**
 * This Application is for Online Banking
 *
 * @author Dilisha
 * @version 2.0.0
 * @since 1.0
 */
 public class BankOfAmericaApp {
    public BankOfAmericaApp() {
    }

    public static void main(String[] args) {
        BankAccount dilishaAccount = new BankAccount();




      //  dilishaAccount.setAccountHolderName("Dilisha Upadhyaya");
        //  dilishaAccount.setAccountType("Saving");
        // dilishaAccount.setConnectedMobileNumber("4055102254");
//        dilishaAccount.setAddress("LibertyTwp, Ohio");
//        dilishaAccount.setBankName("BOA");
//        dilishaAccount.setBsbNumber("001");
//        dilishaAccount.setAccountBalance(1450000.0);
//        dilishaAccount.setSocialSecurityNumber("12345678");


        BankAccount bankAccount3 = new BankAccount("1234567", "Dilisha", "Saving", "4055102254", "Liberty Township", "BOA", "001",  "12345678");
        BankAccount bankAccount4 = new BankAccount("123950959", "Ram", "Saving", "4055102254", "Liberty Township", "BOA", "001" ,  "12345678");


        System.out.println(bankAccount3.getAccountBalance());
        System.out.println(bankAccount3.getAccountHolderName());
        System.out.println(bankAccount3.getAccountType());
        System.out.println(bankAccount3.getAccountNumber());
        System.out.println(bankAccount3.getAddress());
        System.out.println(bankAccount3.getBsbNumber());


        //  System.out.println(dilishaAccount.socialSecurityNumber());
       // System.out.println(dilishaAccount.getAccountNumber());
//        System.out.println(dilishaAccount.getAccountBalance());
//        System.out.println(dilishaAccount.getAccountType());
//        System.out.println(dilishaAccount.getAccountHolderName());
//        System.out.println(dilishaAccount.getBankName());
//        System.out.println(dilishaAccount.getAddress());
//        System.out.println(dilishaAccount.getBsbNumber());
//        System.out.println(dilishaAccount.getConnectedMobileNumber());
//
        //  BankAccount BankAccount3 = new BankAccount("123456789", "Dilisha", accountType(), "4055102254", "45000" , "12345678");



    }




}

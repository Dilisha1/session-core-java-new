package day2;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount dilishaAccount = new BankAccount();

        dilishaAccount.setAccountHolderName("Dilisha Upadhyaya");
        dilishaAccount.setAccountType("Saving");
        dilishaAccount.setConnectedMobileNumber("4055102254");
        dilishaAccount.setAddress("LibertyTwp, Ohio");
        dilishaAccount.setBankName("BOA");
        dilishaAccount.setBsbNumber("001");
        dilishaAccount.setAccountBalance(1450000.0);
        dilishaAccount.setSocialSecurityNumber("12345678");



        System.out.println(dilishaAccount.socialSecurityNumber);
        System.out.println(dilishaAccount.getAccountNumber());



    }
}

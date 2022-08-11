package day2;


class BankOfAmerica {
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



       //  System.out.println(dilishaAccount.socialSecurityNumber());
        System.out.println(dilishaAccount.getAccountNumber());
        System.out.println(dilishaAccount.getAccountBalance());
        System.out.println(dilishaAccount.getAccountType());
        System.out.println(dilishaAccount.getAccountHolderName());
        System.out.println(dilishaAccount.getBankName());
        System.out.println(dilishaAccount.getAddress());
        System.out.println(dilishaAccount.getBsbNumber());
        System.out.println(dilishaAccount.getConnectedMobileNumber());





    }
}

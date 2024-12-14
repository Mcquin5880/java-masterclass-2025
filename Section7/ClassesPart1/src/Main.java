public class Main {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(12345, 10000, "Michael",
                "mq@gmail.com", "123-456-7899");
//        ba.setAccountNumber(12345);
//        ba.setAccountBalance(10000);
//        ba.setCustomerName("Michael");
//        ba.setEmail("mq@gmail.com");
//        ba.setPhoneNumber("123-456-7899");

        ba.deposit(-25);
        ba.deposit(5000);
        ba.withdraw(20000);
        ba.withdraw(500);
        System.out.println();

        BankAccount defaultAcct = new BankAccount();
        System.out.println(defaultAcct);
        System.out.println();

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount);
    }
}

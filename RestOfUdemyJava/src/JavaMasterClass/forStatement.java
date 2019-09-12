package JavaMasterClass;

public class forStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + "hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}

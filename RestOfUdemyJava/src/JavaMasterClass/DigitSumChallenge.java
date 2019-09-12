package JavaMasterClass;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){
        int sum = 0;
        if (number >= 10){
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}

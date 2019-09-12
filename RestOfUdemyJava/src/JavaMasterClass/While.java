package JavaMasterClass;

public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println(count);
            count ++;
        }
        count = 1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println(count);
            count++;
        }
        count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count != 6);

        count = 0;
        while (count < 15) {
            count ++;
            if (count <=5){
                System.out.println("skip " + count);
                continue;
            }
            System.out.println(count);
            if(count >= 10) {
                System.out.println("break at " + count);
                break;
            }
        }
    }
}

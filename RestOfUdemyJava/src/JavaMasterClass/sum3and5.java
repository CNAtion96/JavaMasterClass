package JavaMasterClass;

public class sum3and5 {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;
        for (int i = 1; i < 1001; i++){
            if(i % 3 == 0 & i % 5 == 0 && k < 5) {
                j = j + i;
                k += 1;
            }
        }
        System.out.println(j);
    }
}

package JavaMasterClass;

public class SumOddRange {
    private boolean isOdd(int number){
        return number % 2 != 0;
    }
    public int sumOdd(int start, int end){
        if(start < 0 || end < 0 || end < start) {
            int err = -1;
            return err;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}

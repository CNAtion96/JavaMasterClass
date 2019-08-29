public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if(barking){
            if(hourOfDay <= 8 || hourOfDay == 23){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        float newNum1 = (float) num1;
        float newNum2 = (float) num2;
        if(newNum1 == newNum2){
            return true;
        } else {
            return false;
        }
    }


}

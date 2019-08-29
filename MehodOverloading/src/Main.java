public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(25);
        System.out.println(centimeters);
        centimeters = calcFeetAndInchesToCentimeters(8, 4);
        System.out.println(centimeters);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player Scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && (inches >= 0 && inches <= 12)) {
            double totalInches = (feet * 12) + inches;
            double centimeters = totalInches * 2.54;
            return  centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches > 0){
            double feet = inches / 12;
            double newInches = inches % feet;
            double centimeters = calcFeetAndInchesToCentimeters(feet, newInches);
            return centimeters;
        } else {
            return -1;
        }
    }
}

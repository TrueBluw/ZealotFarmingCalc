
import java.util.Scanner;

public class OnlyGamersBeyondThisPoint {

    public static void main(String[] args) {
        String cont = " ";
        int denominator = 0;
        Scanner scanint = new Scanner(System.in);
        while (!cont.equals("n")) {
            System.out.println("Hi! this is Bluw, lets get started!");
            while (!cont.equals("n")) {
                denominator = 0;
                while (denominator < 1) {
                    System.out.println("What is the denominator of the thing you want to calculate? (ex: ender armour is 1/100 so you would input 100)");

                    try {
                        denominator = scanint.nextInt();
                    } catch (Exception e) {
                        System.out.println("Stupid fuck I asked for a number");
                    }
                }
                int MagicFind = -1;
                while (MagicFind < 0) {
                    System.out.println("What is your magic find rounded to the nearest whole number? (ex: 124, 474, 52 etc)");
                    try {
                        MagicFind = scanint.nextInt();
                    } catch (Exception e) {
                        System.out.println("You did something wrong so like, dont?");
                    }
                }
                int Attempts = 0;
                while (Attempts < 1) {
                    System.out.println("How many times did you roll the dice? (number of attempts)");
                    try {
                        Attempts = scanint.nextInt();
                    } catch (Exception e) {
                        System.out.println("Dumb fuck stop putting words in or I will smite you");
                    }
                }
                double finalodds;
                double insidebracket;
                double numerator;
                numerator = 1 * (1 + (MagicFind / 100));
                insidebracket = 1 - (numerator / denominator);
                finalodds = 100 * (1 - (Math.pow(insidebracket, Attempts)));
                System.out.println("The odds of you getting whatever you're trying to get is " + finalodds + "%");
                System.out.println("would you like to do another one? (y/n)");
                Scanner scanstr = new Scanner(System.in);
                cont = scanstr.nextLine();
            }
        }
    }
}

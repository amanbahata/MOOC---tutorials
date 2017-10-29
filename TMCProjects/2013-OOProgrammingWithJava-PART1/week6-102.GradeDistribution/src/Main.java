import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int score = Integer.parseInt(lukija.nextLine());
        while (score != -1){
            list.add(score);
            score = Integer.parseInt(lukija.nextLine());
        }

        printDistribution(list);
    }

    public static void printDistribution(ArrayList<Integer> list){
        Collections.sort(list);

        int[] numberOfStars = new int[6];

        for (Integer item : list){
            if (item >=0 && item <= 29){
                numberOfStars[0]++;
            }else if (item > 29 && item <= 34){
                numberOfStars[1]++;
            }else if (item > 34 && item <= 39){
                numberOfStars[2]++;
            }else if (item > 39 && item <=44){
                numberOfStars[3]++;
            }else if (item > 44 && item <= 49){
                numberOfStars[4]++;
            }else if (item > 49 && item <= 60){
                numberOfStars[5]++;
            }
        }
        System.out.println("Grade distribution: ");
        for (int i = numberOfStars.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            print(numberOfStars[i]);
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + calculateAcceptance(numberOfStars));

    }

    public static void print(int numberOfStars){
        for (int i = 0; i < numberOfStars; i++){
            System.out.print("*");
        }
    }

    public static double calculateAcceptance(int[] numberOfStars){
        double totalAccepted = 0.0;
        double allScores = 0.0;
        for (int i = 0 ; i < numberOfStars.length; i++) {
            if (i == 0) {
                allScores = numberOfStars[i];
            }else {
                totalAccepted += numberOfStars[i];
                allScores += numberOfStars[i];
            }
        }
        return (100 * totalAccepted / allScores);
    }
}

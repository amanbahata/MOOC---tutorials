import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = 0;

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        do {
            System.out.print("Type numbers: ");
            input = Integer.parseInt(reader.nextLine());
            if (input != -1){
                stats.addNumber(input);
                if (input % 2 == 0){
                    even.addNumber(input);
                }else{
                    odd.addNumber(input);
                }
            }
        }while (input != -1);


        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}

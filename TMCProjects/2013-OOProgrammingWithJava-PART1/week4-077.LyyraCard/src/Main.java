
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code

        LyyraCard cardPekka = new LyyraCard(20.0);
        LyyraCard cardBrian = new LyyraCard(30.0);


        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        loadMoney(cardPekka, 20.0);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();

        loadMoney(cardBrian, 50.0);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }

    public static void loadMoney(LyyraCard card, double amount){
        card.loadMoney(amount);
    }
}

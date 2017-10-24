
public class Main {

    public static void main(String[] args) {
        // write test code here

//        LyyraCard cardPakka = new LyyraCard(10);
//
//        System.out.println("money on the card: " + cardPakka.balance());
//        boolean succeeded = cardPakka.pay(8);
//
//        System.out.println("money taken: " + succeeded);
//        System.out.println("money on the card: " + cardPakka.balance());
//
//        succeeded = cardPakka.pay(4);
//        System.out.println("money taken: " + succeeded);
//        System.out.println("money on the card: " + cardPakka.balance());

//        CashRegister unicafeExactum = new CashRegister();
//
//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        theChange = unicafeExactum.payEconomical(5);
//        System.out.println("the change was "  + theChange );
//
//        theChange = unicafeExactum.payGourmet(4);
//        System.out.println("the change was "  + theChange );
//
//        System.out.println( unicafeExactum );

//        CashRegister unicafeExactum = new CashRegister();
//
//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        LyyraCard cardOfJim = new LyyraCard(7);
//
//        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = unicafeExactum.payEconomical(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        System.out.println( unicafeExactum );

        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}


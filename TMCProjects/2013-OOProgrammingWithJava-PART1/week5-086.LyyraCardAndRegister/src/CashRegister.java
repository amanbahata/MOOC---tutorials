
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    private static final double PRICE_OF_ECONOMICAL_LUNCH = 2.50;
    private static final double PRICE_OF_GOURMET_LUNCH = 4.00;

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven >= PRICE_OF_ECONOMICAL_LUNCH){
            this.cashInRegister += PRICE_OF_ECONOMICAL_LUNCH;
            this.economicalSold++;
            return cashGiven - PRICE_OF_ECONOMICAL_LUNCH;
        }

        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven >= PRICE_OF_GOURMET_LUNCH){
            this.cashInRegister += PRICE_OF_GOURMET_LUNCH;
            gourmetSold++;
            return cashGiven - PRICE_OF_GOURMET_LUNCH;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard lyycaCard) {
        if (lyycaCard.balance() >= PRICE_OF_ECONOMICAL_LUNCH){
            lyycaCard.pay(PRICE_OF_ECONOMICAL_LUNCH);
            economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard lyycaCard) {
        if (lyycaCard.balance() >=  PRICE_OF_GOURMET_LUNCH){
            lyycaCard.pay(PRICE_OF_GOURMET_LUNCH);
            gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0){
            card.loadMoney(sum);
            this.cashInRegister += sum;
            System.out.println("Card has been loaded. New balance on card is: " + card.balance());

        }else {
            System.out.println("The amount to be loaded must be positive.");
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
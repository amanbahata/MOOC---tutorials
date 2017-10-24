
public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    /**
     * Method checks if the balance of the card is at least amount given as parameter
     * if not, methods returns false meaning that the card could not be used for the payment
     * if the balance is enough, the given amount is taken from the balance and true is returned
     *
     * @param amount the amount that has to be subtracted
     * @return true if amount has been taken from the balance, false otherwise.
     */

    public boolean pay(double amount) {
       if (this.balance >= amount){
           this.balance -= amount;
           return true;
       }
        return false;
    }
}
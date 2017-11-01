import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> information;

    public PromissoryNote(){
        this.information = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        toWhom = sanitizeString(toWhom);
        this.information.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        whose = sanitizeString(whose);
        double debtAmount;

        if (this.information.containsKey(whose)){
            return this.information.get(whose);
        }
        return 0.0;
    }

    private String sanitizeString(String input){
        input = input.trim();
        input = input.toLowerCase();
        return input;
    }
}

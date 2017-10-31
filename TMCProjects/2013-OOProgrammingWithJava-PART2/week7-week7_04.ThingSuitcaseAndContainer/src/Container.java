import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;

    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (calculateWeight() + suitcase.totalWeight() <= maxWeight ) {
            suitcaseList.add(suitcase);
        }
    }

    public String toString(){
        return suitcaseList.size() + " suitcases (" + calculateWeight() + " kg)";
    }

    private int calculateWeight(){
        int sum = 0;
        for (Suitcase suitcase : suitcaseList) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    public void printThings(){
        for (Suitcase suitcase : suitcaseList) {
            suitcase.printThings();
        }
    }
}

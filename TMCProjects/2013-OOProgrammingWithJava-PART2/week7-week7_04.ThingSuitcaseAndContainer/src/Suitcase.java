import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> thingsList;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.thingsList = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing){
        if ((getRunningWeight() + thing.getWeight()) <= maxWeight) {
            thingsList.add(thing);
        }
    }

    public String toString(){
        if (thingsList.size() == 0){
            return "empty (" + getRunningWeight() + " kg)";
        }
        if (thingsList.size() == 1){
            return thingsList.size() + " thing (" + getRunningWeight() + " kg)";
        }
        return thingsList.size() + " things (" + getRunningWeight() + " kg)";
    }

    private int getRunningWeight(){
        int sum = 0;
        for (Thing thing : thingsList) {
            sum += thing.getWeight();
        }
        return sum;
    }


    public void printThings(){
        for (Thing thing : thingsList ) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        return getRunningWeight();
    }

    public Thing heaviestThing(){
        Thing heaviest = null;
        if (thingsList.size() > 0) {
            heaviest = thingsList.get(0);
            for (Thing thing : thingsList) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
        }
            return heaviest;
    }
}

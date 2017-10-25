public class Player {

    private String name;
    private int amountOfGoals;

    public Player(String name, int amountOfGoals){
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }
    public Player(String name){
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountOfGoals;
    }

    public String toString(){
        return "Player: " + name + ", goals " + amountOfGoals;
    }
}

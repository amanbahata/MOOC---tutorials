import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int teamSize;

    public Team(String name){
        this.name = name;
        this.teamSize = 16;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if (list.size() <= teamSize) {
            list.add(player);
        }
    }

    public void printPlayers(){
        for (Player player : list) {
            System.out.println(player.toString());
        }
    }

    public void setMaxSize(int maxSize){
        this.teamSize = maxSize;
    }

    public int size(){
        return this.list.size();
    }

    public int goals(){
        int sum = 0;
        for (Player player : list) {
            sum += player.goals();
        }
        return sum;
    }
}

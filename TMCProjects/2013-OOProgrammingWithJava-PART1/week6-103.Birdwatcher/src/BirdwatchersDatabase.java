import java.util.ArrayList;

public class BirdwatchersDatabase {

    private ArrayList<Bird> list;

    public BirdwatchersDatabase(){
        this.list = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        if (list.contains(bird)){
            System.out.println("Bird already exists in the database.");
        }else{
            list.add(bird);
        }

    }

    public void addObservation(String bird){
        for (Bird singleBird : list){
            if (singleBird.getName().equals(bird)){
                singleBird.addObservation();
                return;
            }
        }
    }

    public ArrayList<Bird> getList() {
        return list;
    }

    public void statistics(){
        for (Bird bird : list ) {
            System.out.println(bird);
        }
    }

    public void show(String birdName){
        for (Bird bird : list){
            if (bird.getName().equals(birdName)){
                System.out.println(bird);
                break;
            }
        }
    }
}

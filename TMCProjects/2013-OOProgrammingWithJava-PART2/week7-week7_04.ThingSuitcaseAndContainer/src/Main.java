
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container){
        int brickWeight = 1;
        for (int i = 1; i <= 100; i++){
            Thing brick = new Thing("brick", brickWeight);
            Suitcase suitcase = new Suitcase(50);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            brickWeight++;
        }
    }

}

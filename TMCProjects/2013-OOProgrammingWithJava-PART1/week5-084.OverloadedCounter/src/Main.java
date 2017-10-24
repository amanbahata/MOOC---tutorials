public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        counter1.decrease();
        System.out.println(counter1);


        Counter counter2 = new Counter(true);
        counter2.decrease();
        System.out.println(counter2);

        Counter counter3 = new Counter(5, true);
        counter3.increase();
        System.out.println(counter3);
        counter3.decrease(3);
        System.out.println(counter3);

    }
}

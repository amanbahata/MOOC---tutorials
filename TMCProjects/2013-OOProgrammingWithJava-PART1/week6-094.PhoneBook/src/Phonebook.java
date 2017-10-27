import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number){
        Person person = new Person(name, number);
        this.list.add(person);
    }

    public void printAll(){
        for (Person person : list ) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name){
        for (Person person : list) {
            if (person.getName().contains(name))
                return person.getNumber();
        }
        return "number not known";
    }
}

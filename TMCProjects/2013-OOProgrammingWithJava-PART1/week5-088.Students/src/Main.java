
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        Scanner reader = new Scanner(System.in);
        String name;
        String studentNumber;
        ArrayList<Student> list = new ArrayList<Student>();

        do {
            System.out.print("name: ");
            name = reader.nextLine();

            if (!name.isEmpty()){
                System.out.print("studentnumber: ");
                studentNumber = reader.nextLine();
                Student student = new Student(name, studentNumber);
                list.add(student);
            }
        }while (!name.isEmpty());

        System.out.println();

        for (Student student : list) {
            System.out.println(student.toString());
        }

        // Search
        System.out.println();
        System.out.print("Give search term: ");

        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (Student student : list) {
            if (student.getName().contains(searchTerm)){
                System.out.println(student.toString());
            }
        }
    }
}
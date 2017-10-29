import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        int[] values1 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values1, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values1, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values1, 4));


        int[] values2 = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values2) );

        swap(values2, 1, 0);
        System.out.println( Arrays.toString(values2) );

        swap(values2, 0, 3);
        System.out.println( Arrays.toString(values2) );

        int[] values3 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("----------------");

        System.out.println(Arrays.toString(values3));
        System.out.println("----------------");
        sort(values3);

    }

    public static int smallest(int[] array){
        int smallest = 0;
        if (array.length > 0) {
            smallest = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array){
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                return i;
            }
        }
        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = 0;

        temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }
    }

}

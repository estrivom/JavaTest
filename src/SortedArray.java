import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers (int number) {

        int[] array = new int[number];
        System.out.println("Enter " + number + " integer values:\r");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        Boolean flag = true;
        int temp;
        int[] sortedArray = Arrays.copyOf(array, array.length);

        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}

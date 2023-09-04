import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.println(myArray.length);
        System.out.println();

        String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println();


        int[] array = {1, 5, 4, 3, 7};
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, 0, 4);
        System.out.println(Arrays.toString(array));

        int key = Arrays.binarySearch(array, 5);
        System.out.println(key);
        System.out.println(Arrays.binarySearch(array, 0));
    }
}
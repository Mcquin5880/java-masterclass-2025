import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] arr = getRandomArray(10);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println();
//        int[] secondArr = new int[10];
//        System.out.println(Arrays.toString(secondArr));
//        Arrays.fill(secondArr, 5);
//        System.out.println(Arrays.toString(secondArr));
//
//        System.out.println();
//        int[] thirdArr = getRandomArray(10);
//        System.out.println(Arrays.toString(thirdArr));
//
//        int[] fourthArr = Arrays.copyOf(thirdArr, thirdArr.length);
//        System.out.println(Arrays.toString(fourthArr));
//
//        System.out.println();
//        Arrays.sort(fourthArr);
//        System.out.println(Arrays.toString(thirdArr));
//        System.out.println(Arrays.toString(fourthArr));
//
//        int[] smallerArr = Arrays.copyOf(thirdArr, 5);
//        System.out.println(Arrays.toString(smallerArr));
//
//        int[] largerArr = Arrays.copyOf(thirdArr, 15);
//        System.out.println(Arrays.toString(largerArr));


        String[] sArr = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));

        if (Arrays.binarySearch(sArr, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++) {
            intArr[i] = rand.nextInt(1, 101);
        }
        return intArr;
    }
}

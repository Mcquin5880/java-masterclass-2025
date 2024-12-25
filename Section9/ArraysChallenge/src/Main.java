import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] randArr = getRandomArray(5);
        System.out.println(Arrays.toString(randArr));
        reverseArr(randArr);
        System.out.println(Arrays.toString(randArr));
    }

    public static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] randArr = new int[len];
        for (int i = 0; i < len; i++) {
            randArr[i] = rand.nextInt(1000);
        }
        return randArr;
    }

    public static void reverseArr(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}

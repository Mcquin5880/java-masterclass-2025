import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[1] = 1;
//        myIntArray[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[2] = 3.5;
//
//        System.out.println(myDoubleArray[2]);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + arr[0]);
        int arrayLength = arr.length;
        System.out.println("len = " + arrayLength);
        System.out.println(arr[arrayLength - 1]);

        int[] newArr;
//        newArr = new int[]{5, 4, 3, 2, 1};
        newArr = new int[5];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr.length - i;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("Element at %d = %d%n", i, newArr[i]);
        }

        System.out.println();
        for (int element : newArr) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArr));

        Object objVariable = newArr;
        if (objVariable instanceof int[]) {
            System.out.println("objVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArr;
        System.out.println(Arrays.toString(objectArray));
    }
}

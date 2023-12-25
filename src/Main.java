import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        char[] myArr = new char[]{'a', 'b', 'c', 'd'};

        System.out.println("Задача 2");
        for (int i = 0; i < intArr.length; i++) {
            if (i == (intArr.length - 1)) {
                System.out.print(intArr[i]);
            } else {
                System.out.print(intArr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < floatArr.length; i++) {
            if (i == (floatArr.length - 1)) {
                System.out.print(floatArr[i]);
            } else {
                System.out.print(floatArr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArr.length; i++) {
            if (i == (myArr.length - 1)) {
                System.out.print(myArr[i]);
            } else {
                System.out.print(myArr[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = intArr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(intArr[i]);
            } else {
                System.out.print(intArr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = floatArr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(floatArr[i]);
            } else {
                System.out.print(floatArr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = myArr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArr[i]);
            } else {
                System.out.print(myArr[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]%2!=0) {
                intArr[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
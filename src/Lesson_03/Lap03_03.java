package Lesson_03;

/*
* Sort an integer array from min to max
* Input: {12, 34, 1, 16, 28}
* Expected output: {1, 12, 16, 28, 34}
 */

public class Lap03_03 {

    static void swap(int[] intArr, int i, int j)
    {
        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }

    public static int[] sortArr(int[] intArr) {
        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    swap( intArr, i, j);
                }
            }
        }
        return intArr;
    }

    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        for(int e: sortArr(intArr)){
            System.out.print(e + " ");
        }

    }
}

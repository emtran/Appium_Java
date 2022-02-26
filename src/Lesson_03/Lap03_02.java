package Lesson_03;

/*
* Finding maximum value/minimum value from an integer array
* Input:
*   int[] intArr = {1, 2, 3, 4, 5};
* Output:
*   Minimum: 1
*   Maximum: 5
 */

public class Lap03_02 {
    public static int maxNumber(int[] intArr){
        int maxNumber = intArr[0];
        for(int i=1;i < intArr.length;i++){
            if(intArr[i] > maxNumber){
                maxNumber = intArr[i];
            }
        }
        return maxNumber;
    }

    public static int minNumber(int[] intArr){
        int minNumber = intArr[0];
        for(int i=1;i<intArr.length;i++){
            if(intArr[i] < minNumber){
                minNumber = intArr[i];
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("Min number: " + minNumber(intArr));
        System.out.println("Max number: " + maxNumber(intArr));
    }
}

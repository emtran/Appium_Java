package Lesson_03;

/*
* Count how many odd, even number(s) in an integer array
* Input:
*   int[] intArr = {1, 2, 3, 4, 5};
* Output:
*   Even numbers: 2
*   Odd numbers: 3
 */

public class Lap03_01 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;
        for(int e: intArr){
            int result = e%2 ;
            if(result == 0){
                evenCount  ++;
            }else oddCount ++;

        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

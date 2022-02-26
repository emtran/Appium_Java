package Lesson_03;

/*
* Merge 2 SORTED integer array into one SORTED array
* Input
*   Array 01: {1, 12, 16, 28, 34}
*   Array 02: {1, 13, 16, 27, 99}
* Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */

public class Lap03_04 {

    static void swap(int[] mergedArr, int i, int j)
    {
        int temp = mergedArr[i];
        mergedArr[i] = mergedArr[j];
        mergedArr[j] = temp;
    }

    public static int[] sortArr(int[] mergedArr) {
        for (int i = 0; i < mergedArr.length-1; i++) {
            for (int j = i+1; j < mergedArr.length; j++) {
                if (mergedArr[i] > mergedArr[j]) {
                    swap( mergedArr, i, j);
                }
            }
        }
        return mergedArr;
    }

    public static int[] mergedArr(int[] intFirstArr,  int[] intSecondArr){

        int[] mergedArr = new int[intFirstArr.length + intSecondArr.length];
        int i;
        for(i=0; i<intFirstArr.length; i++)
            mergedArr[i] = intFirstArr[i];

        for(int j=0; j<intSecondArr.length; j++)
            mergedArr[i++]=intSecondArr[j];

        return mergedArr;

    }

    public static void main(String[] args) {
        int[] intFirstArr = {12, 34, 1, 16, 28};
        int[] intSecondArr = {1, 13, 16, 27, 99};

        for(int e: sortArr(mergedArr(intFirstArr,intSecondArr))){
            System.out.print(e + " ");
        }

    }
}

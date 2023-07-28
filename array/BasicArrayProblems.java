package array;

import java.util.Arrays;

public class BasicArrayProblems {

    static void printArray(int[] arr){
        for (int val: arr) {
            System.out.print(arr[val]+ " ");
        }
    }

    static int calculateSumOfValuesOfArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static int showTheMaxValuePresentInArray(int[] arr){
        int max = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    static boolean searchElementIfPresent(int[] arr,int value){
        boolean isPresent = false;
        for (int j : arr) {
            if (value == j) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    static int countValueOccurrenceInArray(int[] arr, int find){
        int count = 0;
        for (int i : arr) {
            if (find == i) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrenceOfValueInArray(int[] arr, int value){
        int lastPos = -1;
        for (int i= 0; i<arr.length;i++){
            if (value == arr[i]){
               lastPos = i;
            }
        }
        return lastPos;
    }

    static int countTheNoOfElementStrictlyGreaterThanX(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (j > x) {
                count++;
            }
        }
        return count;
    }

    static boolean isArrayShorted(int[] arr){
       boolean isArrayShorted = false;
       for (int i =1 ; i<arr.length;i++){
           if (arr[i-1] > arr[i]){
               isArrayShorted = false;
               break;
           } else {
               isArrayShorted = true;
           }
       }
       return isArrayShorted;
    }

    static int targetSumPair(int [] arr, int target){
        int count = 0;
        for (int i =0;i<arr.length;i++){
            for (int j = i + 1; j<arr.length;j++){
                if (arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }


    static int targetSumOf3Pair(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        int ar [] = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                        ar[0] = arr[i];
                        ar[1] = arr[j];
                        ar[2] = arr[k];
                        System.out.println(i+" array "+ Arrays.toString(ar));
                    }
                }
            }
        }
        return count;
    }

    static int findSecondMaxValue(int arr[]){
        int max = showTheMaxValuePresentInArray(arr);
        int res = -1;
        Arrays.sort(arr);
        for (int j : arr) {
            if (j < max) {
                res = j;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,3,2,2,1};
        System.out.println("calculateSumOfValuesOfArray " + calculateSumOfValuesOfArray(arr));
        System.out.println("showTheMaxValuePresentInArray " + showTheMaxValuePresentInArray(arr));
        System.out.println("searchElementIfPresent " + searchElementIfPresent(arr,0));
        System.out.println("countValueOccurrenceInArray " + countValueOccurrenceInArray(arr,2));
        System.out.println("lastOccurrenceOfValueInArray " + lastOccurrenceOfValueInArray(arr,2));
        System.out.println("countTheNoOfElementStrictlyGreaterThanX " + countTheNoOfElementStrictlyGreaterThanX(arr,2));
        System.out.println("isArrayShorted " + isArrayShorted(arr));
        System.out.println("targetSumPair " + targetSumPair(arr,10));
        System.out.println("targetSumOf3Pair " + targetSumOf3Pair(arr,5));
        System.out.println("findSecondMaxValue " + findSecondMaxValue(arr));
    }
}

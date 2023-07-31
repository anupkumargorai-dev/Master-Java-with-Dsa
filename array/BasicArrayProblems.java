package array;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayProblems {

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static int calculateSumOfValuesOfArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static int showTheMaxValuePresentInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static boolean searchElementIfPresent(int[] arr, int value) {
        boolean isPresent = false;
        for (int j : arr) {
            if (value == j) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    static int countValueOccurrenceInArray(int[] arr, int find) {
        int count = 0;
        for (int i : arr) {
            if (find == i) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrenceOfValueInArray(int[] arr, int value) {
        int lastPos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
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

    static boolean isArrayShorted(int[] arr) {
        boolean isArrayShorted = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isArrayShorted = false;
                break;
            } else {
                isArrayShorted = true;
            }
        }
        return isArrayShorted;
    }

    static int targetSumPair(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }


    static int targetSumOf3Pair(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        int ar[] = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                        ar[0] = arr[i];
                        ar[1] = arr[j];
                        ar[2] = arr[k];
                        System.out.println(i + " array " + Arrays.toString(ar));
                    }
                }
            }
        }
        return count;
    }

    static int findSecondMaxValue(int arr[]) {
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


    public static ArrayList<Integer> removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }

        }
        return list;
    }

    static void swapNumber(int a, int b) {
        System.out.println("Original number : " + "a :" + a + " b " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap number : " + "a :" + a + " b " + b);
    }

    // swapping using sum and difference method

    static void swapBySumDifference(int a, int b) {
        System.out.println("Original number : " + "a :" + a + " b " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap number : " + "a :" + a + " b " + b);
    }

    static int[] reversArray(int[] arr) {
        //1 ,2 ,3 ,4, 5
        int[] ans = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[count++] = arr[i];
        }
        return ans;
    }

    // reverse an array without allocating new memory

    static int[] reverseArrayWithoutAllocatingExtraMemory(int[] arr){
        int n = arr.length;
        // swap using pointer 1, 3 , 5 , 6 , 5
        int count = 0;
        for (int i = n -1 ; i>=0;i--){
            if (count >= i){
                return arr;
            }
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count++] = temp;
        }
        return arr;
    }


    static int[] rotateArrayBYKthStep(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 2, 2, 7,8};
        int[] arr2 = {1, 1, 3, 2, 2, 2, 7,8,9};
        System.out.println("calculateSumOfValuesOfArray " + calculateSumOfValuesOfArray(arr));
        System.out.println("showTheMaxValuePresentInArray " + showTheMaxValuePresentInArray(arr));
        System.out.println("searchElementIfPresent " + searchElementIfPresent(arr, 0));
        System.out.println("countValueOccurrenceInArray " + countValueOccurrenceInArray(arr, 2));
        System.out.println("lastOccurrenceOfValueInArray " + lastOccurrenceOfValueInArray(arr, 2));
        System.out.println("countTheNoOfElementStrictlyGreaterThanX " + countTheNoOfElementStrictlyGreaterThanX(arr, 2));
        System.out.println("isArrayShorted " + isArrayShorted(arr));
        System.out.println("targetSumPair " + targetSumPair(arr, 10));
        System.out.println("targetSumOf3Pair " + targetSumOf3Pair(arr, 5));
        System.out.println("findSecondMaxValue " + findSecondMaxValue(arr));
        System.out.println("removeDuplicates " + removeDuplicates(arr));
        swapNumber(2, 3);
        swapBySumDifference(4, 3);
        printArray(reversArray(arr2));
        printArray(reverseArrayWithoutAllocatingExtraMemory(arr2));
    }
}

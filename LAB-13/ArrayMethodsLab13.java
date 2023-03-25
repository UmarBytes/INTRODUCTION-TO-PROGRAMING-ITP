import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodsLab13 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void printStringArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void reversePrint(int[] arr) {
        for (int i = (arr.length) - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int[] populateArray(int[] arr) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t\tEnter the Value for Index at : " + i + " :        ");
            arr[i] = read.nextInt();
        }
        System.out.println("Printing the Entered Array    ");
        printArray(arr);
        read.close();
        return arr;
    }

    public static String[] populateStringArray(String[] arr) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t\tEnter the Value for Index at : " + i + " :        ");
            arr[i] = read.nextLine();
        }
        read.close();
        return arr;
    }

    public static double[] populateDoubleArray(double[] arr) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t\tEnter the Value for Index at : " + i + " :        ");
            arr[i] = read.nextDouble();
        }
        read.close();
        return arr;
    }

    public static void largerThanTheNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                System.out.print(arr[i] + "   ");
            }
        }
    }

    public static int getSecondIndex(int[] arr, int num) {
        int count = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
            if (count == 2) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int getNthIndex(int[] arr, int index, int num) {
        int returnIndex = -1, count = 0;
        if (index >= 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    count++;
                }
                if (count == index) {
                    returnIndex = i;
                    break;
                }
            }
        } else {
            System.out.print("\nOccurence is Invalid!!");
        }

        return returnIndex;
    }

    public static int getSLIndex(int[] arr, char typeOfValue) {
        int index = -1;
        if (typeOfValue == 'S') {
            int smallest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= smallest) {
                    smallest = arr[i];
                    index = i;
                }
            }
        } else if (typeOfValue == 'L') {
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= largest) {
                    largest = arr[i];
                    index = i;
                }
            }
        } else {
            System.out.println("Type of the Value is Invalid!! ");
            return index;
        }
        return index;
    }

    public static void countEvenOddIntegers(int[] arr) {
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\nNumber of Evens in the Enterd Array is " + countEven + " and Number of odds in the Enterd Array is " + countOdd);
    }

    public static void copyReverseArray(int[] arr, int target) {
        int[] reverseArray = new int[target];
        int revIndex = 0;
        for (int i = (target - 1); i >= 0; i--) {
            reverseArray[revIndex] = arr[i];
            revIndex++;
        }
        System.out.println();
        printArray(reverseArray);
    }

    public static void printElementsAtEvenIndex(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + "  ");
            }
        }
    }

    public static void printEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "  ");
            }
        }
    }

    public static void sortIArray(int[] arr) {
        System.out.print("\nBefore Sorting the Integer Array : ");
        printArray(arr);
        System.out.print("\nAfter Sorting the Integer Array : ");
        Arrays.sort(arr);
        printArray(arr);
    }

    public static void sortSArray(String[] arr) {
        System.out.print("\nBefore Sorting the String Array : ");
        printStringArray(arr);
        System.out.print("\nAfter Sorting the String Array : ");
        Arrays.sort(arr);
        printStringArray(arr);
    }

    public static void sortDArray(double[] arr) {
        System.out.print("\nBefore Sorting the Double String Array : ");
        printDoubleArray(arr);
        System.out.print("\nAfter Sorting the Double Array : ");
        Arrays.sort(arr);
        printDoubleArray(arr);
    }

    public static void findStringByCharacter(String[] word, char character) {
        int i, j;
        for (i = 0; i < word.length; i++) {
            for (j = 0; j < word[i].length(); j++) {
                if (word[i].charAt(j) == character) {
                    System.out.print(word[i] + "  ");
                }
            }
        }
    }

    public static void printValidNames(String[] arr) {
        int i, j;
        boolean valid1 = false, valid2 = false, valid3 = false;
        char alphaCheck;
        for (i = 0; i < arr.length; i++) {
            valid1 = Character.isUpperCase(arr[i].charAt(0));
            for (j = 0; j < arr[i].length(); j++) {
                alphaCheck = arr[i].charAt(j);
                if ((alphaCheck >= 'A' && alphaCheck <= 'Z') || (alphaCheck >= 'a' && alphaCheck <= 'z')) {
                    valid2 = true;
                }
                if (arr[i].length() >= 3 && arr[i].length() <= 32) {
                    valid3 = true;
                }
            }
            if (valid1 && valid2 && valid3) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}

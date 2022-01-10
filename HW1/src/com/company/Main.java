package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, Exception, IOException {
        Scanner scanner = new Scanner(System.in);
	    // Task 1
        System.out.println("Task 1");
        System.out.println("“Your time is limited,\n" +
                "\tso don’t waste it\n" +
                "\t\tliving someone else’s life”\n" +
                "\t\t\tSteve Jobs");
        System.out.println("------------------------------------");
        // End of task 1

        // Task 2
        try {
            System.out.println("Task 2");
            System.out.print("Enter your number: ");
            Double myNum = scanner.nextDouble();
            System.out.print("Enter your percent: ");
            Integer myPercent = scanner.nextInt();
            System.out.println(myPercent + "% in " + myNum + " is " + getPercentage(myNum, myPercent));
            System.out.println("------------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 2

        // Task 3
        try {
            System.out.println("Task 3");
            System.out.print("Enter your first number: ");
            Integer firstNum = scanner.nextInt();
            System.out.print("Enter your second number: ");
            Integer secondNum = scanner.nextInt();
            System.out.print("Enter your third number: ");
            Integer thirdNum = scanner.nextInt();
            System.out.println("Your number is " + getNumber(firstNum, secondNum, thirdNum));
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 3

        // Task 4
        try {
            System.out.println("Task 4");
            System.out.print("Enter 6x number: ");
            Integer mySNum = scanner.nextInt();
            if (mySNum >= 100000) {
                swapDigits(mySNum);
                System.out.println("-----------------------------------");
            } else {
                System.out.println("Error! This number is not exists 6 digits.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 4

        // Task 5
        try {
            System.out.print("Enter your month: ");
            Integer myMonth = scanner.nextInt();
            getMonth(myMonth);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 5

        // Task 6
        try {
            System.out.print("Enter value (m): ");
            Double m = scanner.nextDouble();
            System.out.println("Switch operation: ");
            System.out.println("1. Convert meters to miles.");
            System.out.println("2. Convert meters to inches.");
            System.out.println("3. Convert meters to yards.");
            System.out.print("Your switch: ");
            Integer sw = scanner.nextInt();
            getDistance(m, sw);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 6

        // Task 7
        try {
            System.out.print("Enter min value: ");
            Integer min = scanner.nextInt();
            System.out.print("Enter max value: ");
            Integer max = scanner.nextInt();
            getValues(min, max);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 7

        // Task 8
        try {
            System.out.print("Enter min value: ");
            Integer minV = scanner.nextInt();
            System.out.print("Enter max value: ");
            Integer maxV = scanner.nextInt();
            System.out.println("\n");
            getTable(minV, maxV);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 8

        // Task 9
        try {
            System.out.print("Enter size of array: ");
            int size = scanner.nextInt();
            int[] myArray = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                myArray[i] = random.nextInt(-100, 100);
            }
            getValuesFromArr(myArray, size);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 9

        // Task 10
        try {
            System.out.print("Enter array size: ");
            int newsize = scanner.nextInt();
            int[] myNewArray = new int[newsize];
            Random newRandom = new Random();
            for (int i = 0; i < newsize; i++) {
                myNewArray[i] = newRandom.nextInt(-100, 100);
            }
            getMyArray(myNewArray, newsize);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 10

        // Task 11
        try {
            System.out.print("Enter size of line: ");
            int aftersize = scanner.nextInt();
            System.out.print("Enter your symbol: ");
            char symbol = scanner.next().charAt(0);
            System.out.println("Switch direction:");
            System.out.println("1. Line Vertical.");
            System.out.println("2. Line Horizontal.");
            System.out.print("Enter your direction: ");
            int direction = scanner.nextInt();
            getLine(aftersize, direction, symbol);
            System.out.println("-----------------------------------");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // End of task 11

        // Task 12
        try {
            System.out.print("Enter size of array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(-100, 100);
            }
            System.out.print("Your array: ");
            System.out.println(Arrays.toString(array));
            System.out.println("Switch operation:");
            System.out.println("1. Sort the array in descending order.");
            System.out.println("2. Sort the array in ascending order.");
            System.out.print("Enter your switch: ");
            int sw = scanner.nextInt();
            sortArray(array, size, sw);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        scanner.close();
    }

    // Task 2
    public static Double getPercentage(Double number, Integer percent){
        Double res = (number / 100) * percent;
        return res;
    }
    // End of task 2

    // Task 3
    public static Integer getNumber(Integer fNum, Integer sNum, Integer tNum){
        Integer userNum = (fNum * 100) + (sNum * 10) + tNum;
        return userNum;
    }
    // End of task 3

    // Task 4
    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static long swapDigits(int a) {
        char[] array = Integer.toString(a).toCharArray();
        swap(array, 0, 5);
        swap(array, 1, 4);
        return Long.parseLong(String.valueOf(array));
    }
    // End of task 4

    // Task 5
    public static void getMonth(Integer myNum){
        if(myNum == 12 || myNum == 1 || myNum == 2) {
            System.out.println("Winter");
        } else if (myNum == 3 || myNum <= 5) {
            System.out.println("Spring");
        } else if (myNum == 6 || myNum <= 8) {
            System.out.println("Summer");
        } else if (myNum == 9 || myNum <= 11) {
            System.out.println("Autumn");
        } else if (myNum < 1 || myNum > 12) {
            System.out.println("Error");
        }
    }
    // End of task 5

    // Task 6
    public static void getDistance(Double myValue, Integer sw) {
        Scanner s = new Scanner(System.in);
        Double oneMile = 0.000621371192;
        Double oneInch = 39.3700787;
        Double oneYard = 1.0936133;

        if (sw == 1) {
            System.out.println(myValue + " matters to miles is " + myValue * oneMile);
        } else if (sw == 2) {
            System.out.println(myValue + " matters to inches is " + myValue * oneInch);
        } else if (sw == 3) {
            System.out.println(myValue + " matters to yards is " + myValue * oneYard);
        } else if (sw < 1 || sw > 3) {
            System.out.println("Error");
        }
        s.close();
    }
    // End of task 6

    // Task 7
    public static void getValues(Integer min, Integer max) {
        System.out.print("Your values is ");
        for (Integer i = min; i < max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    // End of task 7

    // Task 8
    public static void getTable(Integer min, Integer max) {
        if (min < 1 || min > 10 || max < 1 || max > 10) {
            System.out.println("Error!");
        } else {
            for (Integer j = 1; j <= 10; j++) {
                System.out.print(min + " * " + j + " = " + min * j + "\t\t");
            }
            System.out.println("\n");
            System.out.println("------------------------------------\n");
            for (Integer j = 1; j <= 10; j++) {
                System.out.print(max + " * " + j + " = " + max * j + "\t\t");
            }
            System.out.println("\n");
            System.out.println("------------------------------------");
        }
    }
    // End of task 8

    // Task 9
    public static void getValuesFromArr(int[] myArr, int size) {
        int minElement = myArr[0];
        int maxElement = myArr[0];
        int minCnt = 0;
        int maxCnt = 0;
        int zeroCnt = 0;

        System.out.println("Your array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myArr[i] + "\t");
        }
        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            if (myArr[i] > maxElement) {
                maxElement = myArr[i];
            }
            if (myArr[i] < minElement) {
                minElement = myArr[i];
            }
            if (myArr[i] < 0) {
                minCnt++;
            }
            if (myArr[i] > 0) {
                maxCnt++;
            }
            if (myArr[i] == 0) {
                zeroCnt++;
            }
        }

        System.out.println("Min element is: " + minElement);
        System.out.println("Max element is: " + maxElement);
        System.out.println("Number of negative elements in the array: " + minCnt);
        System.out.println("Number of positive elements in the array: " + maxCnt);
        System.out.println("Number of zero elements in the array: " + zeroCnt);
    }
    // End of task 9

    // Task 10
    public static void getMyArray(int[] myArr, int size) {
        int firstNums = 0;
        int secondNums = 0;
        int thirdNums = 0;
        int fourthNums = 0;

        for (int i = 0; i < size; i++) {
            if (myArr[i] % 2 == 0){
                firstNums++;
            }
            if (myArr[i] % 2 != 0){
                secondNums++;
            }
            if (myArr[i] < 0){
                thirdNums++;
            }
            if (myArr[i] > 0){
                fourthNums++;
            }
        }

        System.out.println("Your array: " + Arrays.toString(myArr));

        int [] firstArr = new int[firstNums];
        int [] secondArr = new int[secondNums];
        int [] thirdArr = new int[thirdNums];
        int [] fourthArr = new int[fourthNums];

        int Findex = 0;
        int Sindex = 0;
        int Tindex = 0;
        int Thindex = 0;

        for (int i = 0; i < size; i++) {
            if (myArr[i] % 2 == 0){
                firstArr[Findex] = myArr[i];
                Findex++;
            }
            if (myArr[i] % 2 != 0){
                secondArr[Sindex] = myArr[i];
                Sindex++;
            }
            if (myArr[i] < 0){
                thirdArr[Tindex] = myArr[i];
                Tindex++;
            }
            if (myArr[i] > 0){
                fourthArr[Thindex] = myArr[i];
                Thindex++;
            }
        }

        System.out.println("Array of even numbers: " + Arrays.toString(firstArr));
        System.out.println("Array of odd numbers: " + Arrays.toString(secondArr));
        System.out.println("Array of negative numbers: " + Arrays.toString(thirdArr));
        System.out.println("Array of positive numbers: " + Arrays.toString(fourthArr));
    }
    // End of task 10

    // Task 11
    public static void getLine(int lineSize, int direction, char symbol) {
        if (direction == 1) {
            for (int i = 0; i < lineSize; i++) {
                System.out.println(symbol);
            }
        } else if (direction == 2) {
            for (int i = 0; i < lineSize; i++) {
                System.out.print(symbol);
            }
        }
    }
    // End of task 11

    // Task 12
    public static void sortArray(int[] myArray, int size, int userSw) {
        int temp;

        if (userSw == 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (myArray[i] < myArray[j]) {
                        temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
            }
            System.out.println("Your changed array: " + Arrays.toString(myArray));
        } else if (userSw == 2) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (myArray[i] > myArray[j]) {
                        temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
            }
            System.out.println("Your changed array: " + Arrays.toString(myArray));
        }
    }
    // End of task 12
}

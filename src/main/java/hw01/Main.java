package hw01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        int[] arr1 = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        int numMin = arr1[0];
        int numMax = arr1[0];
        for (int num : arr1) {
            numMin = Math.min(num, numMin);
            numMax = Math.max(num, numMax);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                System.out.printf("[%d, ", arr1[i]);
            }
            if (i == arr1.length-1) {
                System.out.printf("%d]\n", arr1[i]);
            } else {
                System.out.printf("%d, ", arr1[i]);
            }
        }
            System.out.printf("Минимальный элемент: %d\n", numMin);
            System.out.printf("Максимальный элемент: %d\n", numMax);

        }

    private static void ex2() {
        Scanner userNum = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = userNum.nextInt();
        boolean leapFlag = false;
        if (year % 4 == 0){
            leapFlag = true;
        }
        if (year % 100 == 0){
            leapFlag = false;
        }
        if (year % 400 == 0){
            leapFlag = true;
        }
        System.out.printf("Високосный год: %b\n", leapFlag);

    }

    private static void ex3() {
        int[] arr2 = new int[50];
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
        }
        Scanner userNum2 = new Scanner(System.in);
        System.out.println("Введите число для сортировки от 1 до 9: ");
        int numSort = userNum2.nextInt();
        int temp;
        int left = 0;
        int right = arr2.length-1;
        while (left<right) {
            if (arr2[left] == numSort && arr2[right] != numSort) {
                temp = arr2[right];
                arr2[right] = arr2[left];
                arr2[left] = temp;
                left++;
                right--;
            }
            else if (arr2[left] != numSort) {
                left++;
            }
            else if (arr2[right] == numSort) {
                right--;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                System.out.printf("[%d, ", arr2[i]);
            }
            if (i == arr2.length-1) {
                System.out.printf("%d]\n", arr2[i]);
            } else {
                System.out.printf("%d, ", arr2[i]);
            }
        }
    }
}

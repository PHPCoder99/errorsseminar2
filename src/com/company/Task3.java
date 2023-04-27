package com.company;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by 0.");
        } catch (NullPointerException ex) {
            System.out.println("A pointer cannot point to null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds.");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

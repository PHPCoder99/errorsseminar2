package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    task2(new int[] {1, 2, 3, 4});
        task2(null);
        task2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1});

        try{
            task4();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static float getUserFloat(){
        Scanner scanner = new Scanner(System.in);
        float result;
        while (true) {
            System.out.println("Enter a float: ");
            if (scanner.hasNextFloat()){
                result = scanner.nextFloat();
                break;
            } else {
                System.out.println("Error: the number you entered isn't a float");
                scanner.next();
            }
        }
        return result;
    }

    public static void task2(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("chatchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }

    public static void task4() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            throw new Exception("String is empty.");
        }
    }
}

package arrays;

import java.util.Scanner;

public class IdenticalArrays29 {

    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if both arrays are of the same size
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        // Check each element for equality
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first array
        System.out.print("Enter list 1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = scanner.nextInt();
            }
        }

        // Prompt user for second array
        System.out.print("Enter list 2: ");
        int[][] list2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = scanner.nextInt();
            }
        }

        // Check if the two arrays are identical
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }

        scanner.close();
    }
}

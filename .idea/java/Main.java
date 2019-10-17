package java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        if (first == 0) {
            System.out.println(10);
        } else if (first < 0) {
            System.out.println(first * 2);
        } else {
            System.out.println(first * 3);
        }
    }
}

package _1_WorkingWithAbstraction;

import java.util.Scanner;

public class _1_RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printTopPart(size);

        printBottomPart(size);
    }

    private static void printBottomPart(int n) {
        for (int r = 1; r < n ; r++) {
            printRepeatingString(" ", r);
            printRepeatingString("* ", n - r);
            System.out.println();
        }
    }

    private static void printTopPart(int n ) {
        for (int r = 1; r < n ; r++) {
            printRepeatingString(" ", n - r);
            printRepeatingString("* ", r);
            System.out.println();
        }
        printRepeatingString("* ", n);
        System.out.println();
    }

    private static void printRepeatingString(String str, int repetitions){
        for (int i = 0; i < repetitions; i++) {
            System.out.print(str);
        }
    }
}

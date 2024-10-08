package _1_WorkingWithAbstraction._2_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect = parseRectangle(scanner.nextLine());

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){

            Point p = parsePoint(scanner.nextLine());
            boolean contains = rect.contains(p);
            System.out.println(contains);

        }
    }

    public static Point parsePoint (String str){
        int[] coordinate = parseArray(str);

        return new Point(coordinate[0], coordinate[1]);
    }

    public static Rectangle parseRectangle(String str){
        int[] coordinate = parseArray(str);

        Point a = new Point(coordinate[0], coordinate[1]);
        Point b = new Point(coordinate[2], coordinate[3]);

       return new Rectangle(a, b);
    }

    public static int[] parseArray(String str){
        return Arrays.stream(str.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

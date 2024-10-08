package _1_WorkingWithAbstraction._4_HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        String seasons = tokens[2];
        String discount = tokens[3];

        Season seasonEnum = Season.valueOf(seasons.toUpperCase());

        DiscountType discountType = DiscountType.fromString(discount);

        double cost = pricePerDay * days * seasonEnum.getMultiplaier()
                *discountType.getValue();

        System.out.printf("%.2f",cost);
    }
}

package _2_WorkingWIthAbstractionExercise._3_CardsPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        CardRank rank = CardRank.valueOf(scanner.nextLine());
        CardSuit suit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(suit,rank);

        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,card.getPower());
    }
}

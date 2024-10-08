package _2_WorkingWIthAbstractionExercise._3_CardsPower;

public class Card {

    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank){
        this.power = cardSuit.getPower() + cardRank.getPower();
    }

    public int getPower() {
        return power;
    }
}

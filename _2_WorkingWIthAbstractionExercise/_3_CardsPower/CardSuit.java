package _2_WorkingWIthAbstractionExercise._3_CardsPower;

public enum CardSuit {

    //Енъм стойности
    //Ordinal value -> поредна стойност/
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuit(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}

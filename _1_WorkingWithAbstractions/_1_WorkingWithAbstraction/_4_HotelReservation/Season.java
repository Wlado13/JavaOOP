package _1_WorkingWithAbstraction._4_HotelReservation;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int multiplaier;

    Season(int multiplaier){
        this.multiplaier = multiplaier;
    }

    public int getMultiplaier() {
        return multiplaier;
    }
}

package task04;

public class Cruise extends Tour {

    public Cruise(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Cruise");
    }

}
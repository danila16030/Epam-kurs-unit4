package task04;

public class Medicine extends Tour {


    public Medicine(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Shopping");
    }

}

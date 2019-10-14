package task04;

public class Shopping extends Tour {


    public Shopping(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Shopping");
    }

}

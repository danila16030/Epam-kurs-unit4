package task04.entity;

public class Medicine extends Tour {


    public Medicine(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Shopping");
    }

    @Override
    public String toString() {
        return "Tour type:" +this.getTourType()+super.toString();
    }
}

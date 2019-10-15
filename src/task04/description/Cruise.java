package task04.description;

import task04.description.Tour;

public class Cruise extends Tour {

    public Cruise(int numberOfDays, int cost, boolean food, String transport) {
        super(numberOfDays, cost, food, transport);
        this.setTourType("Cruise");
    }

    @Override
    public String toString() {
        return "Tour type:" +this.getTourType()+super.toString();
    }
}
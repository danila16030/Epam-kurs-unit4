package task04;

import java.util.List;

public class TourAgency {
    List<Tour> tours;


    public TourAgency(List<Tour> tours) {
        this.tours = tours;
    }


    public List<Tour> getTours() {
        return tours;
    }
}

package task04.description;

import java.util.List;
import java.util.Objects;

public class TourAgency {
    List<Tour> tours;


    public TourAgency(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> getTours() {
        return tours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourAgency that = (TourAgency) o;
        return Objects.equals(tours, that.tours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tours);
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "tours=" + tours +
                '}';
    }
}

package task04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TourAgencyFunction {

    public Tour chooseTour(List<Tour> tourList, String tourType) {
        for (Tour tour : tourList) {
            if (tour.getTourType() == tourType) {
                return tour;
            }
        }
        return null;
    }

    public TourAgency sortOnCost(TourAgency tourList) {
        Collections.sort(tourList.getTours(), Comparator.comparing(Tour::getCost));
        return tourList;
    }
}

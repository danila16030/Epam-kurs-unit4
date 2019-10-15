package task04.logic;

import task04.description.*;
import task04.logic.TourAgencyFunction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cruise cruise = new Cruise(13, 1000, true, "liner");
        Shopping shopping = new Shopping(5, 500, true, "bus");
        Medicine medicine = new Medicine(30, 5000, true, "airplane");
        List<Tour> tourList = new ArrayList<>();
        tourList.add(cruise);
        tourList.add(shopping);
        tourList.add(medicine);
        TourAgency tourAgency=new TourAgency(tourList);
        TourAgencyFunction tourAgencyFunction=new TourAgencyFunction();
        Tour tour= tourAgencyFunction.chooseTour(tourList,"Cruise");
        tourAgencyFunction.sortOnCost(tourAgency);
    }
}

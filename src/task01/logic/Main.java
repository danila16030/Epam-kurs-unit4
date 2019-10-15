package task01.logic;

import task01.entity.Area;
import task01.entity.City;
import task01.entity.Region;
import task01.entity.State;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City city = new City("Nil");
        Area area1 = new Area("Kiv", city, 124);
        Area area2 = new Area("Min", city, 421);
        Area area3 = new Area("Biv", city, 524);
        List<Area> areaList = new ArrayList<>();
        areaList.add(area1);
        areaList.add(area2);
        areaList.add(area3);
        Region region1 = new Region("Region", areaList, city);
        Region region2 = new Region("Region2", areaList, city);
        Region region3 = new Region("Region3", areaList, city);
        List<Region> regionList = new ArrayList<>();
        regionList.add(region1);
        regionList.add(region2);
        regionList.add(region3);
        State state = new State("State", "Capital", regionList);
        getCapitalName(state);
        getSquareOfState(state);
        getRegionCount(state);
        getRegionCapital(state);
    }



    public static void getCapitalName(State state) {
        System.out.println("Capital: " + state.getNameCapital());
    }

    public static void getRegionCount(State state) {
        System.out.println("Region count: " + state.getRegionList().size());
    }

    public static void getSquareOfState(State state) {
        StateAction regionAction = new StateAction();
        System.out.println("State Square: "+regionAction.getSquareOfState(state));
    }

    public static void getRegionCapital(State state){
        for (Region region:state.getRegionList()){
            System.out.println(region.getRegionCenterCity().getNameCity());
        }
    }
}

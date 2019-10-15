package task01.logic;

import task01.description.Area;
import task01.description.Region;
import task01.description.State;

public class StateAction {
    public double getSquareOfState(State state){
        double square = 0;
        for (Region region : state.getRegionList()){
            for (Area area : region.getAreaList()) {
                square += area.getAreaSquare();
            }
        }
        return square;
    }
}

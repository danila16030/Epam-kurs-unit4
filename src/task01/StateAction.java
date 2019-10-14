package task01;

import java.util.List;

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

package task01;

import java.util.List;

public class State {
    private String nameState;
    private String nameCapital;
    private List<Region> regionList;


    public State(String nameState, String nameCapital, List<Region> regionList) {
        this.nameState = nameState;
        this.nameCapital = nameCapital;
        this.regionList = regionList;
    }

    public String getNameState() {
        return nameState;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public List<Region> getRegionList() {
        return regionList;
    }


}

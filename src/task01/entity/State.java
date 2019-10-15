package task01.entity;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(nameState, state.nameState) &&
                Objects.equals(nameCapital, state.nameCapital) &&
                Objects.equals(regionList, state.regionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameState, nameCapital, regionList);
    }

    @Override
    public String toString() {
        return "State{" +
                "nameState='" + nameState + '\'' +
                ", nameCapital='" + nameCapital + '\'' +
                ", regionList=" + regionList +
                '}';
    }
}

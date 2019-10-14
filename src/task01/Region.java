package task01;

import java.util.List;

public class Region {
    private String nameRegion;
    private List<Area> areaList;
    private City regionCenterCity;

    public Region(String nameRegion, List<Area> areaList, City regionCenterCity) {
        this.nameRegion = nameRegion;
        this.areaList = areaList;
        this.regionCenterCity = regionCenterCity;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public City getRegionCenterCity() {
        return regionCenterCity;
    }


}

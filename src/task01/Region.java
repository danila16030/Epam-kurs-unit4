package task01;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(nameRegion, region.nameRegion) &&
                Objects.equals(areaList, region.areaList) &&
                Objects.equals(regionCenterCity, region.regionCenterCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRegion, areaList, regionCenterCity);
    }

    @Override
    public String toString() {
        return "Region{" +
                "nameRegion='" + nameRegion + '\'' +
                ", areaList=" + areaList +
                ", regionCenterCity=" + regionCenterCity +
                '}';
    }
}

package task01;

import java.util.Objects;

public class Area {
    private String nameArea;
    private City areaCenterCity;
    private double areaSquare;

    public Area(String nameArea, City areaCenterCity, double areaSquare) {
        this.nameArea = nameArea;
        this.areaCenterCity = areaCenterCity;
        this.areaSquare = areaSquare;
    }

    public String getNameArea() {
        return nameArea;
    }

    public City getAreaCenterCity() {
        return areaCenterCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.areaSquare, areaSquare) == 0 &&
                Objects.equals(nameArea, area.nameArea) &&
                Objects.equals(areaCenterCity, area.areaCenterCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameArea, areaCenterCity, areaSquare);
    }

    @Override
    public String toString() {
        return "Area{" +
                "nameArea='" + nameArea + '\'' +
                ", areaCenterCity=" + areaCenterCity +
                ", areaSquare=" + areaSquare +
                '}';
    }

    public double getAreaSquare() {
        return areaSquare;
    }

}

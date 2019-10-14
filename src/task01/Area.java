package task01;

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

    public double getAreaSquare() {
        return areaSquare;
    }

}

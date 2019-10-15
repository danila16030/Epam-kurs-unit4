package task01.entity;

import java.util.Objects;

public class City {
    private String nameCity;

    public City(String name) {
        this.nameCity = name;
    }

    public String getNameCity() {
        return nameCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(nameCity, city.nameCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCity);
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                '}';
    }
}

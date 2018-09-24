package models;

import java.io.Serializable;

public class City implements Serializable {

    private int code;
    private String name;
    private boolean isCapital;
    private int count;
    private int countryId;

    public City(int code, int countryId, String name, int count, boolean isCapital) {
        super();
        this.code = code;
        this.countryId = countryId;
        this.name = name;
        this.count = count;
        this.isCapital = isCapital;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean isCapital) {
        this.isCapital = isCapital;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountry() {
        return countryId;
    }

    public void setCountry(int countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "City [code=" + code + ", name=" + name + ", isCapital=" + isCapital + ", count=" + count
                + ", country=" + countryId + "]";
    }

}

package models;

public class Product {
    protected String foodName;
    protected int id;
    protected int proteins;
    protected int fats;
    protected int carbohidrates;
    protected int calorie;

    public Product() {
    }

    public Product(int id, String foodName, int proteins, int fats, int carbohidrates, int calorie) {
        this.id = id;
        this.foodName = foodName;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohidrates = carbohidrates;
        this.calorie = calorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getCarbohidrates() {
        return carbohidrates;
    }

    public void setCarbohidrates(int carbohidrates) {
        this.carbohidrates = carbohidrates;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}

package kioskproject;

public class MenuItem {

    // 속성
    private String name;
    private int price;
    private String feature;

    // 생성자
    public MenuItem(String name, int price, String feature) {
        this.name = name;
        this.price = price;
        this.feature = feature;
    }

    // 기능
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getFeature() {
        return this.feature;
    }
}

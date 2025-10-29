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

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("0보다 큰 값을 입력하세요.");
        }
    }
}

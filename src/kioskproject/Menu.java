package kioskproject;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private List<MenuItem> chicken = new ArrayList<>();
    private List<MenuItem> pizza = new ArrayList<>();
    private List<MenuItem> beverage = new ArrayList<>();
    private List<String> mainMenu = new ArrayList<>();


    // 생성자
    public Menu() {
        this.chicken.add(new MenuItem("Fried Chicken", 15000, "겉바속촉의 정석인 오리지널 치킨"));
        this.chicken.add(new MenuItem("Seasoned Spicy Chicken", 16000, "매콤한 양념이 일품인 치킨"));
        this.chicken.add(new MenuItem("Soy Sauce Glazed Fried Chicken", 16000, "단짠단짠 맛있는 간장 치킨"));
        this.chicken.add(new MenuItem("Sliced Leek Chicken", 17000, "대파가 있어 느끼함을 잡아주는 치킨"));
        this.pizza.add(new MenuItem("Special Pizza", 19000, "통새우, 페퍼로니, 베이컨, 매쉬포테이토 등 푸짐한 토핑이 들어간 피자"));
        this.pizza.add(new MenuItem("Potato Pizza", 18000, "감자 토핑을 좋아하면 딱 좋아할 피자"));
        this.pizza.add(new MenuItem("Bulgogi Pizza", 19000, "인기 만점 불고기 토핑 피자"));
        this.beverage.add(new MenuItem("Coca-Cola",2000, "코카콜라 맛있다!"));
        this.beverage.add(new MenuItem("Soda", 2000, "사이다도 빠질 수 없죠!"));
        this.beverage.add(new MenuItem("Americano", 4000, "얼죽아 계신가요?"));
        this.beverage.add(new MenuItem("Fruit Juice", 6000, "키위, 딸기, 바나나 주스가 있습니다."));
        this.beverage.add(new MenuItem("Beer", 4000, "주류(19세 이상만!)"));
        this.mainMenu.add("Chickens");
        this.mainMenu.add("Pizzas");
        this.mainMenu.add("Beverages");
    }


    // 기능
    public List<String> getMainMenu() {
        return this.mainMenu;
    }

    public List<MenuItem> getChickenMenu() {
        return this.chicken;
    }

    public List<MenuItem> getPizzaMenu() {
        return this.pizza;
    }

    public List<MenuItem> getBeverageMenu() {
        return this.beverage;
    }

}

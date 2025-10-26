package kioskproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // List 선언
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수로 MenuItem 추가
        menuItems.add(new MenuItem("Fried Chicken", 15000, "겉바속촉의 정석인 오리지널 치킨"));
        menuItems.add(new MenuItem("Seasoned Spicy Chicken", 16000, "매콤한 양념이 일품인 치킨"));
        menuItems.add(new MenuItem("Soy Sauce Glazed Fried Chicken", 16000, "단짠단짠 맛있는 간장 치킨"));
        menuItems.add(new MenuItem("Sliced Leek Chicken", 17000, "대파가 있어 느끼함을 잡아주는 치킨"));

        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 반복문을 이용해 MenuItem을 하나씩 출력하기
        System.out.println("[TOOMUCH CHICKEN MENU]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getFeature());
        }
        System.out.println("0. 종료");

        while (true) {

            // 숫자 입력 받기
            int num = sc.nextInt();

            // 입력된 숫자에 따른 처리
            switch (num) {

                case 1: System.out.println("선택한 메뉴: " + "1. Fried Chicken | 15000 | 겉바속촉의 정석인 오리지널 치킨");
                    break;
                case 2: System.out.println("선택한 메뉴: " + "2. Seasoned Spicy Chicken | 16000 | 매콤한 양념이 일품인 치킨");
                    break;
                case 3: System.out.println("선택한 메뉴: " + "3. Soy Sauce Glazed Fried Chicken | 16000 | 단짠단짠 맛있는 간장 치킨");
                    break;
                case 4: System.out.println("선택한 메뉴: " + "4. Sliced Leek Chicken | 17000 | 대파가 있어 느끼함을 잡아주는 치킨");
                    break;
                default: System.out.println("키오스크를 종료합니다.");
                    break;
            }
        }

        






    }
}

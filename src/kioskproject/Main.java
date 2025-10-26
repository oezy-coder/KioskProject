package kioskproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("[TOOMUCH CHICKEN MENU]");
        System.out.println("1. Fried Chicken | 15000 | 겉바속촉의 정석인 오리지널 치킨");
        System.out.println("2. Seasoned Spicy Chicken | 16000 | 매콤한 양념이 일품인 치킨");
        System.out.println("3. Soy Sauce Glazed Fried Chicken | 16000 | 단짠단짠 맛있는 간장 치킨");
        System.out.println("4. Sliced Leek Chicken | 17000 | 대파가 있어 느끼함을 잡아주는 치킨");
        System.out.println("0. 종료");


        // 반복문 이용하여 원하는 음식 번호 입력 받기
        while (true) {

            int num = sc.nextInt();

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

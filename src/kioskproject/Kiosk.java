package kioskproject;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private Menu menu;

    // 생성자
    public Kiosk(Menu menu) {

        this.menu = menu;
    }

    // 스캐너 객체 생성
    Scanner sc = new Scanner(System.in);

    // 기능
    // 반복문을 이용해 상위 카테고리 메뉴 출력
       public void start() {

           while (true) {
               List<String> mainMenu = menu.getMainMenu();
               System.out.println("[TOOMUCH CHICKEN MENU]");
               for (int i = 0; i < mainMenu.size(); i++) {
                   System.out.println((i + 1) + ". " + mainMenu.get(i));
               }

               System.out.println("0. 종료");

               // 숫자 입력 받기
               System.out.print("메뉴 번호를 입력해주세요: ");
               int num = sc.nextInt();

               // 입력된 숫자에 따른 처리
               switch (num) {

                   case 0:
                       System.out.println("키오스크를 종료합니다.");
                       return;
                   case 1:
                       printMenu(menu.getChickenMenu());
                       break;
                   case 2:
                       printMenu(menu.getPizzaMenu());
                       break;
                   case 3:
                       printMenu(menu.getBeverageMenu());
                       break;
                   default:
                       System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                       break;
               }
           }
       }
        // 하위 카테고리 메뉴 출력
       public void printMenu(List<MenuItem> items) {
           for (int i = 0; i < items.size(); i++) {
               MenuItem item = items.get(i);
               System.out.println((i + 1) + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getFeature());
           }
           System.out.println("0. 뒤로 가기");
           System.out.print("메뉴 번호를 입력해주세요: ");
           int num1 = sc.nextInt();
           if (num1 == 0 || num1 > items.size()) return;
           System.out.println("선택한 메뉴: " + items.get(num1 - 1).getName() + " | " + items.get(num1 - 1).getPrice() + " | " + items.get(num1 - 1).getFeature());

       }

}

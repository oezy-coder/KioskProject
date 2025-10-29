package kioskproject;

public class Main {

    public static void main(String[] args) {

        // Menu 객체 생성
        Menu menu = new Menu();

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu);

        // Kiosk 내 시작 함수 호출
        kiosk.start();

        






    }
}

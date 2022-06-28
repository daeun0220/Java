import java.util.*;
public class statement {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner (System.in);
        while (true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("choose menu");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);     // 입력받는 tmp 를 숫자로 변환

            if (menu==0){
                System.out.println("program end");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("wrong menu");
                continue;   // 다음꺼 수행안함
            }
            System.out.println("your menu is " + menu  );
        }
    }
}

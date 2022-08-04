// switch 의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다.
// byte, short, int, enum, String, Character, Byte, Short, Integer

public class SwitchDemo {
    public static void main(String[] args){

        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");

        }
    }
}

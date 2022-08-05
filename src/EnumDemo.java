/*
class Fruit{      enum 과 같은 코드 / enum 이 코드가 훨씬 더 간결하다.
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
 */
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){     // 생성자 만들 수 있다
        System.out.println("Call constructor " + this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}

public class EnumDemo {
    public static void main(String[] args){
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57 + "kcal, " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + "kcal, " + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + "kcal, " + Fruit.BANANA.getColor());
                break;
        }

        for(Fruit f : Fruit.values()){     // 멤버 전체를 열거할 수 있다.
            System.out.println(f + ", " + f.getColor());
        }
    }
}

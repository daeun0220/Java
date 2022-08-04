class FinalCardTest {
    public static void main(String args[]){
        Card2 c = new Card2("HEART", 10);
        //c.NUMBER = 5;      // final 멤버 변수는 값 수정이 불가하다

    }
}


class Card2{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num){
        KIND = kind;     // 생성자에서 초기화할 수 있다.
        NUMBER = num;
    }
    Card2(){
        this("HEART", 1);
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }
}

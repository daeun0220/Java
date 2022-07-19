// 조상 클래스의 메서드를 자손 클래스에서 오버라이딩한 경우에 super 사용
// 변수와 메서드 모두 super 사용해서 호출 가능 !

class SuperTest2 {
    public static void main(String args[]){
        Child2 c =new Child2();
        c.method();
    }
}
class Child2 extends Parent{
    int x =20;
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);   // 조상 클래스로부터 상속받은 멤버변수 x
    }
}
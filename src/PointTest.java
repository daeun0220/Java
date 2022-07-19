
class PointTest {
    public static void main(String args[]){
        Point3D p3 = new Point3D(1,2,3);
    }
}


class Point3D extends Point{
    int z = 30;
    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    Point3D(){
        this(100, 200, 300);
    }
    String getXY(){   // 오버라이딩 : 부모 클래스의 메서드와 이름이 같다  (오버로딩: 클래스 내 이름이 같은 메서드가 있을 수 있다. 파라미터가 다르면 구분 가능하기 때문. ex) println)
        return "x:" + x + "y:" + y + "z:" + z;
    }
}


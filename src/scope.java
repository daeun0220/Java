public class scope {

    static void a() {
        int i = 0;    //유효범위 (scope)
    }

    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }
    }
}

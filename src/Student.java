public class Student {
    public static void main(String[] args){
        Students[] s1 = new Students[5];
        for(int i=0; i<s1.length; i++){
            s1[i] = new Students();
    }

    }
}

class Students{
    String name;
    int age;

    Students(String n, int a){  // 생성자
        name = n;
        age = a;
    }
}
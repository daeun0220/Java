
// Student 클래스는 이름과 나이를 저장할 수 있는 속성을 가지고 있습니다.
// 해당 객체가 생성된 이후에 이름과 나이를 수정할 수 없는 불변클래스로 만들고 싶습니다.
// 위 조건을 만족하는 Student 클래스를 작성해주세요.

class Student {
    final String NAME;
    final int AGE;


    Student(String name, int age) {  //생성자에서 초기화
        NAME = name;
        AGE = age;
    }
    Student(){
        this("daeun", 24);   // 이후에는 수정 불가하다
    }
}



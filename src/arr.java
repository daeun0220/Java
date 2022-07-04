import java.util.Arrays;
class arr implements Comparable<arr> {
        public String name;
        public int age;

        public arr(){}
        public arr(String name, int age){
            this.name = name;
            this.age = age;
        }
        public int compareTo(arr other){
            return this.age - other.age;
        }

        public void printstudent(){
            System.out.println("name: "+ name);
            System.out.println("age: "+ age);
        }

}


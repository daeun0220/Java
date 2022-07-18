import java.util.Arrays;
class arr implements Comparable<arr> {
        public String name;
        public int age;


        public arr(String name, int age){
            this.name = name;
            this.age = age;
        }
        public int compareTo(arr other){
            return this.age - other.age;
        }


}


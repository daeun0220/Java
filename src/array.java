import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int[] array = new int[5]; // new int[] 생략 가능 / int[] array = {10,20,30,40,50};
        int tmp = array.length;      // array.length 배열의 길이 잰다. array 바뀌어도 사용하기 편함
        System.out.println(tmp);

        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));  // 배열 나열해주는 메서드

        int[] result = new int[arr.length*2];

        }
    }


public class lottoarr {
    public static void main(String[] args){
        int[] ball = new int[45];

        for(int i =0; i<ball.length; i++)
            ball[i] = i+1;
        int temp = 0;
        int j = 0;

        for (int i=0; i<6;i++){
            j = (int)(Math.random() * 45); // 0~44범위의 임의의 값
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        for (int i=0;i<6;i++){
            System.out.printf("ball[%d]=%d%n", i, ball[i]);    // System.out.println(i + ball[i]); 안됨
        } // System.out.print(i, ball[i]); 도 안됨




    }
}

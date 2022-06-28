public class googooLine {
    public static void main(String[] args){
        Loop1 : for(int i=2; i <= 9; i++){
                for(int j=1; j <= 9; j++){
                    if(j==5)
                        continue;  // continue 는 5만 제외 continue Loop1 은 5부터 다 제외


                    System.out.println(i + "*"+ j + "="+ i*j);
            }
                System.out.println();
        }
    }
}

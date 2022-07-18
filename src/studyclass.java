class Tv1{
    String color;
    boolean power;
    int channel;
    void power(){power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){--channel;}
}

public class studyclass {
    public static void main(String[] args){
        Tv1 t = new Tv1();
        Tv1[] tvArr = {new Tv1(), new Tv1(), new Tv1()};
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}

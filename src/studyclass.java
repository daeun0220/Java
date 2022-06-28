class Tv{
    String color;
    boolean power;
    int channel;
    void power(){power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){--channel;}
}

public class studyclass {
    public static void main(String[] args){
        Tv t = new Tv();
        Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}

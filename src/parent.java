public class parent {
    boolean power;
    int channel;

    void power(){
        power =! power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

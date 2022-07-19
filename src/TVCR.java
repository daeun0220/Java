class TV{
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
class VCR {
    boolean power;
    int counter = 0;
    void power(){power =! power;}
    void play(){ }
}
class TVCR extends TV {   // 상속 관계
    VCR vcr = new VCR();   // 포함 관계
    void play(){
        vcr.play();        // VCR 메소드 사용 가능
    }

}

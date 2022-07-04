public class inheritance {
    public static void main(String[] args){
        child tv = new child();
        tv.channel = 10;
        tv.channelUp();
        System.out.println(tv.channel);
        tv.displayCaption("hi");
        tv.caption = true;
        tv.displayCaption("hi");
    }
}

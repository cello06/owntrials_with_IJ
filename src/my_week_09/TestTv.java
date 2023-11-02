package my_week_09;

public class TestTv {
    public static void main(String[] args) {
        Tv television1 = new Tv("Television1");
        television1.setOn(true);
        television1.setChannel(8);
        television1.setVolumeLevel(50);
        television1.channelUp();

        Tv television2 = new Tv("Television2");
        television2.setOn(false);
        television2.setChannel(5);
        television2.setVolumeLevel(70);
        television2.channelDown();
        television2.volumeDown();

        System.out.println(television1.getName()+" is "+((television1.getOnOrOff())?"on and \n"
                +"channel "+television1.getChannel()+" is open with "+television1.getVolumeLevel()+" volume":"off"));
        System.out.println(television2.getName()+" is "+((television2.getOnOrOff())?"on and \n"
                +"channel "+television2.getChannel()+" is open with "+television2.getVolumeLevel()+" volume":"off"));
    }
}

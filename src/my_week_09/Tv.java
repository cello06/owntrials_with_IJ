package my_week_09;

public class Tv {
    public Tv(String name){
        setName(name);
    }
    private String name;
    private int channel;
    private int volumeLevel;
    private boolean on;
    public void setName(String name){
        this.name = name;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }
    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel =volumeLevel;
    }
    public void setOn(boolean onOrOff){
        on = onOrOff;
    }
    public String getName(){
        return name;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
    public boolean getOnOrOff(){
        return on;
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }
}

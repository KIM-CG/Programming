public class TVData {
    int channel, volume;

    TVData(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public boolean tvon() {
        System.out.println("TV를 켭니다.\n현재 채널 : " + channel + " 현재 볼륨 : " + volume);
        return true;
    }

    public boolean tvoff() {
        System.out.println("TV를 끕니다.");
        return false;
    }
}

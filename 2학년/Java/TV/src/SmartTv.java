import TVPKG.TVch;
import TVPKG.TVvol;

public class SmartTv extends TVData implements TVch, TVvol {
    public SmartTv(int channel, int volume) {
        super(channel, volume);
    }

    public void chup() {
        super.channel++;
        System.out.println("채널을 올렸습니다.\n현재 채널 : " + super.channel);
    }

    public void chdown() {
        super.channel--;
        System.out.println("채널을 내렸습니다.\n현재 채널 : " + super.channel);
    }

    public void volup() {
        super.volume++;
        System.out.println("볼륨을 올렸습니다.\n현재 음량 : " + super.volume);
    }

    public void voldown() {
        super.volume--;
        System.out.println("볼륨을 내렸습니다.\n현재 음량 : " + super.volume);
    }
}

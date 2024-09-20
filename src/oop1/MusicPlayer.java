package oop1;

public class MusicPlayer {
    int volumn = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악플레이어를 시작합니다 ");
    }
    void off() {
        isOn = false;
        System.out.println("플레이어 종료합니다");
    }

    void volumeUp() {
        volumn++;
        System.out.println("플레이어 볼륨 : "+ volumn);
    }
    void volumeDown() {
        volumn--;
        System.out.println("플레이어 볼륨 : "+ volumn);
    }
    void showStatus() {
        System.out.println("플레이어 상태 확인 ");

        if (isOn) {
            System.out.println("플레이어 on, 볼륨 : " + volumn);
        } else System.out.println("플레이어 off");
    }

}

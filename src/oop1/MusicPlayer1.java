package oop1;

public class MusicPlayer1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악을 실행합니다");

        volume++;
        System.out.println("플레이어 볼륨 : "+volume);
        volume++;
        System.out.println("플레이어 볼륨 : " + volume);

        volume--;
        System.out.println("플레이어 볼륨 : " + volume);

        System.out.println("플레이어 상태 확인 ");

        if (isOn) {
            System.out.println("플레이어 on, 볼륨 : " + volume);
        } else System.out.println("플레이어 off");

        isOn = false;
        System.out.println("플레이어 종료합니다");

    }
}

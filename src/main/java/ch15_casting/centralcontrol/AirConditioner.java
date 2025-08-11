package ch15_casting.centralcontrol;

public class AirConditioner implements Power {
    @Override
    public void on() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨의 전원을 끕니다.");
    }

    // downcasting에 앞서서 고유 메서드들 하나씩 정의하겠습니다.
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿨습니다.");
    }
}

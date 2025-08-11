package ch15_casting.centralcontrol;

public class Printer implements Power{
    public void print() {
        System.out.println("프린터가 인쇄를 합니다.");
    }

    @Override
    public void on() {
        System.out.println("프린터기의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("프린터기의 전원을 끕니다.");
    }
}

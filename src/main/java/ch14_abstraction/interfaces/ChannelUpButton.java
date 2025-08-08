package ch14_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "채널을 계속 " + super.onUp();
    }
}

// 현재까지의 작성 방안에서는 채널 올려주는 버튼 / 내려주는 버튼 / 전원 버튼이 각각 있는겁니다.
// 각각 따로있는 버튼들을 하나로 모아주는 클래스를 작성할 예정입니다.
// 현재 여기서 문제가 되는 것이 있죠.

// TvRemoteController라는 일반 클래스를 생성









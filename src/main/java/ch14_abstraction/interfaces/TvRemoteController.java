package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;        // 접근지정자 클래스명 객체명   -> 여태까지의 작성방법과 다릅니다.
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }
    // 볼륨 버튼 추가하고 나서 AllArgsConstructor 생성하면 Main에서 오류 발생합니다.
    // 왜?
    // Main에는 채널버튼까지의 AllArgsConstructor로 객체가 생성되어 있기 때문에. -> Main 수정하러 가야함.

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드를 구현하시고,
    // Main에서 실행하여
    // 실행 예
    // 채널을 한 칸 올립니다.
    // 채널을 계속 올립니다.
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    // 여기서 풀이법이 두 가지로 갈리게 됩니다.
    // # 1
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();      // onUp();의 결과값이 return "채널을 계속 " + super.onUp();
    }

    // # 2
    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }

    // 볼륨 관련 메서드 정의
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    // # 1
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }

    // # 2
    public void onUpVolumeUpButton2() {
        System.out.println(volumeUpButton.onUp());
    }
}

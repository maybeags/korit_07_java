package ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다. # 1으로 푸시오
    음량을 계속 올립니다. # 2으로 푸시오
 */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();


        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        // # 1에 대한 Main에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        // # 2에 대한 실행
        tvRemoteController.onUpChannelUpButton2();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        // # 1에 대한 실행
        System.out.println(tvRemoteController.onUpVolumeUpButton1());
        // # 2에 대한 실행
        tvRemoteController.onUpVolumeUpButton2();

        System.out.println("-------------------------------------");
        // 에어컨 리모컨 객체 생성
        AirConditionerController airConditionerController = new AirConditionerController(
          new PowerButton(), new ModeChangeButton(), new TemperatureDownButton(), new TemperatureUpButton()
        );
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton1());
        airConditionerController.onUpTemperatureUpButton2();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
    }
}

// ch15_casting 패키지 생성

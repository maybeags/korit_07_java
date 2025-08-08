package ch14_abstraction.abstract_classes;
/*
    지시 사항
    1. Factory 클래스를 상속 받을 것
    2. 그러면 시뻘건거 오류 뜨는데 알아서 처리할 것
    3. TabletFactory의 고유 method인 upgrade(String model) 메서드를 call2()
        유형으로 정의하고, 객체명.upgrade("아이패드 프로 13인치 8세대");로 호출하면
        '아이패드 프로 13인치 8세대로 업그레이드합니다.'라고 콘솔에 출력될 수 있도록
        작성할 것
    4. Main.java로 이동해서
        tabletFactory1 객체를 생성하고, 애플 태블릿 공장이라고 이름 붙일 것
    5. 이름을 구글 태블릿 공장으로 수정할 것 -> getter를 활용하여
        현재 공장은 구글 태블릿 공장으로 변경되었습니다.
        라고 출력할 수 있도록 작성할 것
    6. 객체명.produce("구글 태블릿")을 호출할 것
    7. 객체명.manage()를 호출할 것
    8. 객체명.upgrade("구글 태블릿 10인치 2세대")를 호출할 것
    9. Factory 클래스의 인스턴스인 factory2 객체를 생성할 것
        - produce() 메서드는 model + 컴퓨터를 생산합니다. 라고 출력될 수 있도록 재정의
        - manage() 메서드는 컴퓨터 공장을 관리합니다. 라고 출력될 수 있도록 재정의
        factory2 메서드의 name은 삼성 컴퓨터 공장으로 set하시오.
        factory2.showInfo()를 호출할 것

 */
public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}

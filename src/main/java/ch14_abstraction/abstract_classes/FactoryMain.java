package ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 '원래는' 못한다.
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        };  // ;를 꼭 명시해야하는데 이 전체 코드라인이 메서드를 정의하는 것이 아니라 객체를 생성한 것이기 때문
        factory1.setName("가전 제품 공장");
        factory1.showInfo();
        /*
            이상의 개념은 익명 클래스로, Java1.1 -> 근데 현재는 추후 학습할 람다식(Lambda Expression)으로
            대체되는 경우가 많습니다.(근데 이게 JavaScript에도 동일하게 적용됩니다)

            재사용하지 않고 한 번만, 즉 이 경우에는 FactoryMain에서만 쓰고 치울 예정이면 사용하기 좋습니다.

            사실 우리는 교육 상황이기 때문에 모든 클래스를 한 번만 정의하고 그걸로 객체 한 두개 만들고 치우는
            경우가 많아서 모든 수업을 익명 클래스로 처리할 수도 있겠죠.

         */
        System.out.println();
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");

        // 부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성한대로 작동되는지 확인
        phoneFactory1.produce("아이폰17에어");
        phoneFactory1.manage();
        // 이번엔 부모 클래스의 일반 메서드를 호출
        phoneFactory1.showInfo();

        /*
            어제 배운 부분과 오늘 배운 부분을 합쳐서 생각해봤을 때 오버라이딩 개념은 '재정의'를 전제로
            부모 클래스와 자식 클래스의 메서드가 '다르게' 굴러갈 경우에만 이루어지면 되고,
            부모 클래스의 메서드를 동일하게 사용할거라면 애초에 받아올 필요도 없이 그냥 쓰면 됩니다.

            다만 여러분이 자식 클래스를 정의했을 때 부모 클래스에 특정 메서드가 있음을 명확하게
            알고 있어야할 필요가 있죠.

            부모 클래스에 showInfo()라는 메서드가 있는걸 몰랐다면 여러분들은
            PhoneFactory 클래스에 showInfo() 클래스를 따로 정의했을 테니까요.
         */

        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("애플 태블릿 공장");
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println(tabletFactory1.getName() + "으로 변경되었습니다.");
        tabletFactory1.produce("구글 태블릿");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");

        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + " 컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println(this.getName() +  "을(를) 관리합니다.");
            }
        };

        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();
    }
}

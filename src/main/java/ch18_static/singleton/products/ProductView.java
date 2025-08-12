package ch18_static.singleton.products;

import lombok.Getter;

public class ProductView {
    // 정적 변수 선언
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance입니다 -> 이게 시험 시 힌트 중 하나였습니다.
    private static ProductView instance;    // ProductView 클래스의 정적 field인 instance
    private static int count = 1;

    // private으로 생성자를 선언    -> 객체가 하나만 생성되는걸 보장하기 위한 접근지정자이므로 매우 중요함.
    private ProductView() {
        int counter = 1;        // 이건 객체 생성될 때 만들어지는 지역 변수입니다.
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
        System.out.println("정적 변수를 참조하는 " + count + " 번 째 객체가 생성되었습니다.");
        count++;                // 얘는 위에 정적 변수입니다. 코드 상에서의 차이를 확인하셔야 합니다.
    }

    // static 메서드의 정의 -> 대부분의 경우 getInstance() -> 시험시 힌트였습니다. 클래스명.메서드명() 호출
    public static ProductView getInstance() {
        if(instance == null) {              // 현재 인스턴스가 없는 시점이라면 22번 코드라인이 true이므로
            instance = new ProductView();   // ProductView() 생성자를 호출하여 intance에 대입함.
        }
        return instance;                    // 이미 생성되있으면 바로 25번 라인이 실행됨.
    }
}

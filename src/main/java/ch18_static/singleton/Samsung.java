package ch18_static.singleton;

import lombok.Getter;

/*
    방금 작성한 ProductView와 인터넷에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱글톤 패턴을 작성하시오.
 */
public class Samsung {
    // 정적 필드
    private static Samsung instance;
    // 일반 필드(멤버 변수라는 표현을 쓰기도 함)
    @Getter             // getCompany()만 만들겠다는 의미
    private String company;
    private int serialNumber;

    // private으로 NoArgsConstructor 정의
    private Samsung() {
        company = getClass().getSimpleName();       // 어차피 이거 결과값 Samsung입니다. 기교 부렸다
        serialNumber = 20250000;                    // 즉 객체 생성시에 필드값을 초기화시켰습니다.
    }

    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;        // 싱글톤으로 작성했으니까 어차피 객체 하나만 생성될거고
        // Main 단계에서 다수의 객체에서 createSerialNumber()를 호출하더라도 전혀 serialNumber가 중복되지
        // 않을거라고 볼 수 있습니다.
        // 그러면 정적 변수로 선언하고 다수의 삼성 객체를 만들어도 serialNumber가 안겹치지 않을까요?
        // 라고 질문한다면 맞는 말입니다.
        // 근데 그러면 Samsung이라는 회사 갯수가 백만개라는 전제하에 가능하겠네요.
    }

}

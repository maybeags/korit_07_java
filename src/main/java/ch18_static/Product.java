package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    // 필드 선언
    private String name;
    // 필드 레벨에서 추가적으로 설정한 애너테이션
    @Getter
    private static int count = 0;

    // 롬복을 사용하지 않은 static 메서드도 정의해보겠습니다.
    private static String title = "제품입니다.";

    public static String getTitle() {
        return title;
    }

    // 인스턴스 변수 수준의 field 정의
    private int instanceCount = 0;  // 이거 필드인데 초기화도 했습니다.

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        instanceCount++;
        count++;
    }

    public void increaseInstanceCount() {
        instanceCount++;
    }
}

// singleton

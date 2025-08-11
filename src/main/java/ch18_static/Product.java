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
}

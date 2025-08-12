package ch18_static.singleton;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone {
    // 필드 정의
    private String company;
    private String model;
    private String serial;
}

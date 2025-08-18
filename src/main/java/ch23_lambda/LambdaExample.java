package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java!");
            }
        };  // 객체 정의이기 때문에 ; 필수

        runnable.run(); // 이상의 방법은 메서드명이 명시되니까 편한데,

        Runnable lambdaRunnable = () -> System.out.println("Hello, Lambda!");
        lambdaRunnable.run();   // 얘는 윗줄을 봐도 메서드명이 없죠. 아까 add / sub에서
        // calculate를 추론할 수 없었던 이유 중에 하나입니다.

        // 다른 유형의 함수형 인터페이스 실행 예제
        // 2. Supplier -> call3();
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get());   // 기존 method 관련 + 람다식 지식 필요
        String message = stringSupplier.get();
        System.out.println(message);

        // 3. Consumer -> call2();
        Consumer<String> stringConsumer = (memo) -> System.out.println("메시지 : " + memo);
        stringConsumer.accept("오늘 전반적인 수업 내용은 여기서 끝납니다.");

    }
}

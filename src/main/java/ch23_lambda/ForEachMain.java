package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성 -> 빈 거 생성하고 넣는거 말고 바로 만들겁니다
        // 즉, 선언 및 초기화 방식
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        // 여기서 저희는 각 element를 추출하기 위해서 for문 / 향상된 for문을 사용해왔습니다.
        // 과일명 : 사과
        // 과일명 : 딸기
        // 과일명 : 블루베리
        // 이상과 같은 방식으로 element를 추출하고 가공하기 위해서는 필수적이었다고 할 수 있습니다.

        // 1. 일반 for
        for ( int i = 0 ; i < fruits.size() ; i++ ) {
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();
        // 2. 향상된 for
        for (String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();
        // 3. 람다식 적용한 method forEach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.print((number*2) + " "));

        // 이상의 forEach문에서 알 수 있는 점은
        // 여태까지 저희가 List 등의 Collection에서 각 element들을 추출하여 데이터를 가공한다고
        // 가정했을 때 필수적으로 List 내부를 돌아다니는 반복문을 작성해야만 했습니다.

        // 하지만 forEach() 메서드 '내'에 람다식을 작성함으로써
        // 읽을 수만 있다면 가독성 있는 형태로 데이터를 가공할 수 있음을 확인했습니다.

        // 이상의 '메서드 내 람다식 적용' 방식은 Js에서도, 그리고 Java를 이용하는 springboot 내부에서도
        // 자주 사용될 예정이니 익숙해지면 유용하게 쓸 수 있습니다.

    }
}

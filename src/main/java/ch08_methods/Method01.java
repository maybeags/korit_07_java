package ch08_methods;

import java.util.Scanner;

public class Method01 {
//    // 메서드 호출 영역
//    call1();
//    call2("hello");
//    call3();
//
//    // return값을 출력하기 위해서는
//        System.out.println(call3()+ "!");
//    String name = "김일";
//        System.out.println(name + " 학생의 학점은 " + call4(4.5) + "점입니다.");
    /*
        여기에 메서드를 정의할 예정입니다.
        이번 수업 이후부터는 꼭 main을 치지 않는 경우도 있다는 점을 아시면 되겠습니다.
     */
    // 메서드 정의 영역
    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("영어 인사 : " + example);
    }

    // 3. [ x | o ]
    public static String call3() {
        String example = "안녕하세요";
        System.out.println("[ x | o ]");
        return example;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리입니다.");
        return score * 3;
    }

    /*
        return이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드의 결과값이
        다른 메서드의 argument로 사용될 수도 있습니다.

        함수형 프로그래밍(Functional Programming) :"
            메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의 return 값이
            메서드3의 argument가 되는 방식으로,

            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩 방식

            간단 예시
     */
    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살입니다.\n내년에는 " + (age + 1) + "살이 됩니다.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.print("이름을 입력하세요 >>> ");
        myName = scanner.nextLine();                // 사실 이 nextLine();이 메서드입니다. -> 메서드의 결과값을 myName이라는
                                                    // 변수에 저장했습니다.
        System.out.print("나이를 입력하세요 >>> ");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge));   // 그리고 그 myName / myAge라는 결과값을
                                                        // 우리가 정의한 introduce()메서드의 argument로 사용하여
                                                        // 최종 결과물을 콘솔에 출력합니다.



    }
}

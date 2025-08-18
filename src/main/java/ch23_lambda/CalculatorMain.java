package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        //저희가 정의한 interface Calculator를 사용할겁니다.
        //근데 인터페이스 내부에는 두 개의 매개변수만 정의되어있었습니다.
        // 저희는 여기서 추가 조작을 통해서 사칙 연산을 시도할겁니다.

        Calculator add = (x, y) -> x + y;   // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 calculate()
        Calculator sub = (x, y) -> x - y;   // Calculator 인터페이스의 객체명이 sub고, 내부 메서드는 calculate()
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;


        System.out.println(add.calculate(2, 3));        // 15번 라인의 주석을 참고했을 때의 올바른 메서드 호출 방식
        System.out.println(sub.calculate(2, 3));        // 근데 너무 길어서 저희는 static method를 정의했습니다.
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2, 3, add));    // static method 의 로직을 보시면,
        // 세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받습니다.
        // 그리고 return 문을 보시면 해당 객체의 .calculate() 메서드를 호출하는 것을 확인할 수 있습니다.
        // 근데 add.calculate()는 return이 x + y니까, 결과값이 5가 나왔겠네요.
        // 그러면 우리는 24번 코드 라인의 해석을 위해서
        // Calculator 인터페이스와, CalculatorMain의 static method와, 그리고 main에서의 lambda식을 전부
        // 왔다갔다하면서 볼 필요가 있다는 의미가 됩니다.
        System.out.println("2 * 3 = " + operate(2, 3, mul));
    }
}

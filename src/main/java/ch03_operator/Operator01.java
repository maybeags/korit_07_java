package ch03_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JS에서도 씁니다)
    Snake case -> 얘는 뭐 Java에서 쓸 일이 없습니다. 근데 전체 상수 사용시에 비슷한 표기법이 적용됩니다.
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두 번째 단어의 첫 번째 문자는 또 대문자
        ex) 한 단어 짜리 : Operator01
        ex) 복수 단어 : OperatorTestResult      -> Pascal Case는 클래스 명명 규칙에 해당합니다.
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 이전 단계에서 자료형, 변수명, 데이터에 대해서 학습했습니다.
        // 이번에는 '='를 배울겁니다.
        i = i + 1;
        /*
            대입 연산자 = : = 왼쪽과 오른쪽이 같다는 의미가 아니라
                = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 '대입'한다는 의미입니다.

            그렇다면 왼쪽과 오른쪽이 같은 값이다, 라고 표시할 때는 어떻게 할까요? ==
         */

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지
         */
        int a = 5;          // int는 정수였죠
        int b = 2;          // 변수 선언 및 초기화
        double result = (double) a / b; //(double)은 강제 '형변환' 개념입니다.
        System.out.println(a/b);    // 근데 2가 나오죠
        System.out.println(result); // 얘는 2.5가 나오죠
        // 그래서 생각보다 코딩할 때도 얘네가 멍청해서 하나하나 잘 지정해야합니다.
        // 즉 개발자는 뭐다?
        // 컴퓨터가 잘 작동할 수 있도록 잘 명령을 내리는 사람이다, 라고 생각해주시고
        // 좀 어르고 달래고 해야합니다.

        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;                  // num1 = num1 + 2; 라는 의미입니다.
        System.out.println(num1);
        num1 -= 1;                  // num1 = num1 - 1;
        System.out.println(num1);
        num1 *= 10;                 // num1 = num1 * 10;
        System.out.println(num1);
        num1 /= 5;                  // num1 = num1 / 5;
        System.out.println(num1);
        System.out.println("--------------------------");
        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 변수명++ : 코드를 실행시킨 후에 j에 1을 더함 / 그래서 10 출력
        System.out.println(j);      // 위의 코드가 실행되고 +1 됐기 때문에 11 출력
        System.out.println(++j);    // ++변수명 : 코드를 실행시키기 전에 j에 1을 더함 / 그래서 12출력
        System.out.println(j);      // 위에 더한 상태로 출력된거라 위와 동일하게 12 출력됨
        System.out.println(j--);    // 그럼 얘의 출력값은 뭔가요?  - 12
        System.out.println(j);      // 11
        System.out.println(--j);    // 10
        System.out.println(j);      // 10
        // 변수명-- : 코드를 실행시킨 후에 j에 1을 감함.
        // --변수명 : 코드를 실행시키기 전에 j에 1을 감함.

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        // Operator02 생성
    }
}

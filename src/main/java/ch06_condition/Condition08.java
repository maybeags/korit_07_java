package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님.
    3. 그런데 100으로 나누어떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

    예를 들어
    2020년은 4로 나누어 떨어지기 때문에 윤년(100으로는 안나누어지니까요)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로도 안나누어집니다)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당함.

    이상의 조건을 만족하는 윤년 계산기를 작성하고,
    Scanner를 import,
    year 변수에 값을 대입했을 때
    윤년인지 아닌지를 판별할 수 있도록 하시오.
 */
public class Condition08 {
    public static void main(String[] args) {
        // Scanner import / 필요 변수 자료형 및 변수명 선언 / 안내문 / 대입
        // 이후에 해당 year가 윤년이 맞는지 아닌지를 체크하시면 되겠네요
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String leapYear = "윤년입니다";
        // == 좌우가 같다 / a != b : a와 b가 다르다
        // 실수 사례 -> 지시 사항대로 중첩 if문을 사용하지 않고 작성했을 때 자주하는 방식
//        if(year % 4 == 0) {
//
//        } else if (year % 100 == 0) {
//            leapYear = "윤년이 아닙니다";
//        } else if (year % 400  == 0) {
//
//        }
//
//        System.out.println(year + "년은 " + leapYear);

        // 이상의 경우는 가장 널널한 조건(400으로 나누어 떨어지는 숫자는 당연히 100으로도 나누어 떨어지고
        // 당연히 4로도 나누어 떨어집니다. 약수니까요)

        if (year % 400 == 0) {}
        else if (year % 100 == 0) {
            leapYear = "윤년이 아닙니다";
        } else if (year % 4 == 0) {}
        else {
            leapYear = "윤년이 아닙니다";
        }
        System.out.println(year + "년은 " + leapYear);

        // Condition09 -> main // 논리 연산자 이용 풀이
    }
}

package ch22_exception;

import java.util.Scanner;

/*
    예외(Exception)란?
        :   개발자가 예측할 수 있고, 그에 대한 대비를 할 수 있는 것들을 예외라고 정의
    오류(Error)란?
        :   개발자가 예측할 수 있지만 해결할 수 없거나 / 예측 불가능한 것을 오류라고
            정의하는 편


    그럼 Exception01에서 알 수 있듯이, 다수의 예외의 경우에는 이미 개발자들이 정의를 해놓았습니다.
    예를 들어 List를 하나 정의했고, 거기에 element들을 집어넣었다고 가정하겠습니다.
    그 경우에 List의 element들을 추출하기 위해서 반복문을 쓰게 될텐데,
    i < strList.size()를 쓰지 않고 i < 3001 과 같은 방식으로 하드코딩을 했을 때에만 예외가
    발생하겠죠.

    그리고 여러분들은 향상된 for문을 배웠기 때문에, 이를 사용한다면 예외를 볼 일이 전혀 없습니다.


 */

class Person {
    int age;
    String name;

    void showInfo() {
        System.out.println("나이 : " + age );
        System.out.println("이름 : " + name);
    }
}
public class Exception01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = 20;
//        person1.school = "코리아아이티";            IDE 상에서 예외처리가 아니라 빨갛게 나오는 예시 # 1
        person1.showInfo();
//        person1.displayInfo();                    IDE 상에서 예외처리가 아니라 빨갛게 나오는 예시 # 2

//        int a = 10;             // 나누어지는 수
//        int b = 0;              // 나누는 수
//        int result = a / b;
//        System.out.println(result);

        /*
            고전적 형태의 예외 처리 방식 -> if문 사용
         */
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if(b == 0) {
//            System.out.println("나눌 수 없습니다.");
//        } else {
//            System.out.println("결과값은 : " + (a/b));
//        }
        /*
            예외 처리를 적용한 방식의 코딩 -> try / catch / finally
         */
//        int a = 10;
//        int b = 0;
//        try {
//            int result = a / b;     // ArithmeticException 예외 발생 지점 -> 37번 라인이 아니라 catch문으로 넘어갑니다.
//            System.out.println("결과 : " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        } finally {
//            System.out.println("프로그램 정상 종료");
//        }
        /*
            왜 예외 처리를 하는가 ?
                : 멘토 파이썬에서 봤었는데 프로그램을 실행시킬 때 시뻘겋게 되어있으면 기분이
                나쁘기 때문에 예외처리를 해야 함.

                : 프로그램이 정상 종료됨을 보증하기 위하여.

            일단 실행을 시켜서 오류가 나는 것을 확인해야 하는가?
         */

        // 배열 인덱스 예외 -> 복수 catch문 사용
        int[] numbers = { 1, 2, 3, 4 };
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {                     // 예외 중에 가장 상위 예외 클래스에 해당함.
            throw new RuntimeException(e);      // 사실 저희가 보던 시뻘건게 이 오류 메시지였습니다.
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        /*
            이상의 코드 라인에서 중요한 점은 catch문이 복수로 나올 수 있다는 점입니다.
            저희가 if문(leap year 관련)에 대해서 작성할 때
            조건의 순서를 배치하는 것이 매우 중요하다고 했습니다.

         */




    }
}

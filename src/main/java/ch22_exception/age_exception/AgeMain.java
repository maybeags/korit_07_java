package ch22_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {
    // 예외 클래스는 별개로 정의했지만
    // 메서드를 호출했을 때 예외를 처리해야 하기 때문에
    // 여기에 추가적으로 메서드 정의를합니다(아까 login()처럼)
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 200) {
            // 조건에 맞지 않는 경우 사용자 정의 예외 발생시킬 것
            // 예외를 발생시킨다의 의미 -> 예외 객체를 생성한다는 의미입니다.
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }

    public static void main(String[] args) {
        // 사용할 클래스 import
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();    // 전에는 여기에 바로 작성해서 넣었는데,
        // 생각해보면 여기 부분에 음수값이나 200 초과 정수를 집어넣을 수 있습니다.
        // 혹은 double 자료형을 넣을 수도 있겠네요.
        // 예외가 발생할 가능성이 있는 부분을 try문 안에 넣어주는 것이 중요합니다.
        try {
            int age = scanner.nextInt();
            checkAge(age);  // 예외를 던질(throw) 가능성이 있는 메서드 호출
            System.out.println("입력된 나이는 : " + age + "살입니다.");
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {    // Scanner 사용했는데 변수의 자료형과 일치하지 않을 때 적용됨 "스무살", 38.7이 동일한 예외 발생
            System.out.println("잘못된 입력입니다.정수를 입력하세요.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        /*
            이상의 코드에서 정상적인 데이터 한 번 / 비정상적인 데이터를 한 번 실행시켜봤을 때의
            콘솔 출력 순서를 고려할 필요가 있습니다.
            예외가 발생하지 않는다면 예외 관련 객체가 생성되지도 않고,
            catch{} 문은 실행되지 않습니다.
            예외가 발생한다면
            예외 발생 시점 이후의 try{}문은 실행되지 않고 곧장 catch{}문이 실행됩니다.
            그리고 예외 발생 유무와 관계 없이
            finally{}문은 맨 마지막에 실행됩니다.
         */
    }
}

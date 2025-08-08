package ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다
    1 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 점수 총합은 21.5점입니다.
 */
public class Array02 {
    public static void main(String[] args) {
        // 우리가 고민해야 할 점
        // 몇 명의 학생을 등록하시겠습니까? >>> 5 이라고 가정해보겠습니다.
        // 그럼 그 이후에 5명짜리를 등록할 수 있는 빈 배열이 생성되어야합니다.
//        Scanner scanner = new Scanner(System.in);
//        int human = 0;
//        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
//        human = scanner.nextInt();
//        // nextInt() 때문에 다음 nextLine()의 엔터가 적용되어 바로 2번으로 넘어갈 가능성 -> 배리어 필요
//        scanner.nextLine();
//        String[] humans = new String[human];
//
//        for ( int i = 0 ; i < humans.length ; i++ ) {
//            System.out.print((i+1) + "번 학생의 이름을 입력하세요 >>> ");
//            humans[i] = scanner.nextLine();
//        }
//
//        // humans라고 하는 배열의 크기와 scores라는 배열의 크기는 동일해야합니다.
//        // 빈 배열의 선언 및 크기 지정을 할 때 어떤 변수를 사용할 수 있는가.
//        double[] scores = new double[human];
//
//        // 총합을 낼거니까
//        double sum = 0;
//        // 이건 direction을 모두 반영한 코드라고 할 수 있겠습니다. 그리고 밑에는 그냥 실행 예만 반영한 형태도 볼게요
//        for ( int i = 0 ; i < humans.length ; i++ ) {   // humans.length나 scores.length나 human이나 다 같죠
//            System.out.print((i+1) + "번 학생의 점수를 입력하세요 >>> ");
//            scores[i] = scanner.nextDouble();
//            sum += scores[i];
//        }
//
//        System.out.println("학생들 점수의 총합은 " + sum + "점 입니다.");
//
//        // 실행 예만 반영
//        for ( int i = 0 ; i < human ; i++ ) {
//            sum += scanner.nextDouble();
//        }
//
//        System.out.println("학생들 점수의 총합은 " + sum + "점 입니다.");

        // [1], [3]에 해당하는 element만 출력하는 반복문을 작성하시오.
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        // 특정 index에 속해있는 element 추출
        // 증감값을 +=2를 통해서 강제 조정할 경우
        // index는 0부터 시작인데 굳이 1로 지정해줘야하기 때문에 오히려
        // 조건문이 있는 것보다 가독성이 떨어지고 잘못 해석할 확률이 높습니다.
        for ( int i = 1 ; i < names.length ; i+=2 ) {
            System.out.println(names[i]);
        }
        // 그래서 이상과 같은 코드 라인 정도로 default form에서 수정이 가해질 바에는
        for ( int i = 0 ; i < names.length ; i++ ) {
            if (i % 2 == 1) {
                System.out.println(names[i]);
            }
        }
        // 와 같이 작성하는 편입니다.
    }
}

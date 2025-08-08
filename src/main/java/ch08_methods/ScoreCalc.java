package ch08_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램 작성
 */
public class ScoreCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        // 3 과목의 점수를 입력 받아서, 총합과 평균 점수를
        // 콘솔창에 표시하시오.
        /*
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>> 3
            1 과목의 점수를 입력하세요 >>> 100
            2 과목의 점수를 입력하세요 >>> 90
            3 과목의 점수를 입력하세요 >>> 95
            총합은 285.0이며, 평균은 95.0입니다.
         */
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
        // 반복문을 작성해야하는데, 한계값이 numOfSubs와 관련있겠네요.
        for ( int i = 0 ; i < numOfSubs ; i++ ) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avg + "입니다.");
    }
}

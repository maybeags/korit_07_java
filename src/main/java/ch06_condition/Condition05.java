package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 59점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.
         */

        // 입력 받아 -> Scanner import 하라는 의미가 되겠죠
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        double score2 = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        if (score > 89) {
            grade = "A";
        } else if (score > 79 ) {
            grade = "B";
        } else if (score > 69 ) {
            grade = "C";
        } else if (score > 59 ) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");



    }
}

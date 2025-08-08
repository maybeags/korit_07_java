package ch12_arrays;

import java.util.Scanner;

/*
    메서드를 정의해도 되고 main에 바로하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.


 */
public class Array05 {
    public static void main(String[] args) {
        String[] scores = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < scores.length ; i++) {
            scores[i] = scanner.nextLine();
        }
        // 출력하는 반복문 -> A B C D만 출력하고 거기에 + 붙일 예정
        // 맨마지막 인덱스는 그냥 출력할 예정
        for ( int i = 0 ; i < scores.length - 1 ; i++ ) {
            System.out.print(scores[i] + "+ ");
        }
        System.out.println(scores[scores.length-1]);
    }
}

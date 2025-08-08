package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    ...
    91 ... 100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {
        // 1번 풀이 방식
        int i = 0;
        while(i < 100) {
            System.out.print(++i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        // 2 번 풀이 방법
        // 힌트 : 1 2 3 4 5 6 7 8 9 10 -> 을 출력하는게 한 번의 반복
        // 힌트 두 번 째 : 첫 번째 라인의 변수가 1로 시작하는데,
        // 두 번째 라인은 11로 시작하네요.
        // 그럼 첫 번 째 코드 라인과 두 번째 코드 라인 간의 int j의
        // 숫자 차이가 10입니다.
        int j = 1;
        while(j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5) + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
            j+=10;
        }



    }
}

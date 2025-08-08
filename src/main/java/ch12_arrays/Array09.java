package ch12_arrays;

import java.util.Scanner;

/*
    접근 지정자 public으로 method들을 정의했기 때문에
    직접 정의한 Array08 클래스의 메서드인
    calcSum() / calcAvg()를 Array09에서도 사용할 수 있습니다.
    이게 저희가 Scanner를 사용했던 원리와 동일하죠.
 */
public class Array09 {
    public static void main(String[] args) {
        // (메서드를 사용할 클래스의) 객체 생성
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);

        int[] nums = { 1, 2, 3, 4, 5, 6, 8, 10 };
        // 특정 클래스의 인스턴스에 딸려있는 메서드 호출
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}
// Array10EnhancedFor

package ch12_arrays;

import java.util.Scanner;

/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부 element들의 값을 하나하나 다 입력 받아서 바꾸는 method를
    정의하는 것
 */
public class Array04 {
    // 메서드 정의 영역
    public void printElements() {
        String[] names = { "김일", "김이", "김삼", "김사", "김오", "김육" };

        for ( int i = 0 ; i < names.length ; i++ ) {
            System.out.print(names[i] + " ");
        }
    }

    public void printElements(String[] strArray) {
        for ( int i = 0 ; i < strArray.length ; i++ ) {
            System.out.print(strArray[i] + " ");
        }
    }

    public void printElements(int[] strArray) {
        for ( int i = 0 ; i < strArray.length ; i++ ) {
            System.out.print(strArray[i] + " ");
        }
    }

    // 입력 관련 method 정의
    public void writesElements(String[] strArray) {
        // 여기서 스캐너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출한 후 내부에서 입력할 거기 때문에 Scanner를 여기에 import
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0 ; i < strArray.length ; i++ ) {
            System.out.print((i +1) +" 번째 element 입력하세요 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }

    public void writesElements(double[] doubleArray) {
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0 ; i < doubleArray.length ; i++ ) {
            System.out.print((i +1) +" 번째 element 입력하세요 >>> ");
            doubleArray[i] = scanner.nextDouble();
        }
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        // 임의의 String[] 배열 생성
//        String[] people = new String[5];
//        // 메서드 호출 영역
//        array04.writesElements(people); // 입력하는 메서드
//        array04.printElements(people);  // 출력하는 메서드
        double[] scores = new double[2];
        array04.writesElements(scores);

        // method화 하기 위한 과정 # 1
        // 일단 main에서 해본다

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이 ... 김육을 출력하시오.

//        array04.printElements();
//        System.out.println();
//        // 이상의 코드의 문제점은 메서드를 호출했을 때 특정 배열의 element만 출력된다는 점
//
//        String[] students = {"이일", "이이", "이삼", "이사", "이오"};
//
//        array04.printElements(students);
//        System.out.println();
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        array04.printElements(teachers);
//        System.out.println();
//        int[] dates = { 2025, 8, 5 };
//        array04.printElements(dates);
    }
}

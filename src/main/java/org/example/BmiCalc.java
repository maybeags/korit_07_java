package org.example;

import java.util.Scanner;

public class BmiCalc {
    // call1() 형태로 메서드화 시키는 게 그 다음 task
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi = weight/(height*height);
        System.out.println(bmi);
        String result = "";
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23){
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전 단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }
        System.out.println(name + "님의 BMI 지수는 " + bmi + " 으로 " + result + "입니다.");
    }
    // call3() 형태로 메서드화 시킬 겁니다
    public void calcBmi(String name, double height, double weight) {

    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calcBmi(Person person) {

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//        double bmi = weight/(height*height);
//        System.out.println(bmi);
//        String result = "";
//        if (bmi < 18.5) {
//            result = "저체중";
//        } else if (bmi < 23){
//            result = "정상";
//        } else if (bmi < 25) {
//            result = "비만 전 단계";
//        } else if (bmi < 30) {
//            result = "1단계 비만";
//        } else if (bmi < 35) {
//            result = "2단계 비만";
//        } else {
//            result = "3단계 비만";
//        }
//        System.out.println(name + "님의 BMI 지수는 " + bmi + " 으로 " + result + "입니다.");

        /*
            실행 예
            이름을 입력하세요 >>> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg)를 입력하세요 >>> 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */

        // call1() 유형으로 작성했기 때문에 객체 생성
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi();





        bmiCalc.calcBmi(person1);
    }
}

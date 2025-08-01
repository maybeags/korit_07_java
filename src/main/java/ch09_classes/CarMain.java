package ch09_classes;

public class CarMain {
    public static void main(String[] args) {

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체에 값 대입 방법
        // 객체명.속성명 = 데이터;

        // 객체의 메서드 호출 방법
        // 객체명.메서드명();

/*
    Car의 인스턴스인 myCar라는 객체를 생성하시오.
    color에 빨강 대입, speed에 160 대입
    yourCar 객체 생성하시오.
    color에 노랑 대입, speed 180 대입
    myCar는 drive() 메서드 호출
    yourCar는 brake() 메서드 호출
    myCar, yourCar에 각각 displayInfo() 메서드 호출하시오.
     */

        // 객체 생성
        Car myCar = new Car();
        // 필드에 값 대입
        myCar.color = "빨강";
        myCar.speed = 160;
        // 객체 생성 2
        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        // 메서드 호출
        myCar.drive();
        yourCar.drive();
        myCar.brake();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();

// Constructor 클래스 생성
// ConstructorMain 클래스 생성







    }
}

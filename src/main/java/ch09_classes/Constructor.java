package ch09_classes;
/*
    생성자(Constructor)
        생성자는 객체가 생성될 때 호출되는 특별한 '메서드'

    객체 생성 예시
    클래스명       객체명  = new 클래스명();
    ClassExample example = new ClassExample();
    : 사실 ClassExample() -> 생성자에 해당합니다.

    특징 :
        1. 클래스의 이름과 생성자의 이름은 동일하다.
            (다른 메서드들과 달리 대문자로 시작한다)
        2. return 값이 없다 -> 즉, call1() / call2() 유형으로 생각할 수 있습니다.
        3. 객체 초기화 : 생성자는 객체의 필드 '초기화'를 담당한다.

    생성자의 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자
            (사실 클래스를 만들 때 default로 생성되는 형태로 정의하지 않아도 될 때가 있음)
            그래서 ClassA, Car에서 기본 생성자를 정의하지 않고
            ClassAMain, CarMain에서 객체를 생성해봤었습니다. -> 복습 필요
                정확하게는 default로 생성된 기본 생성자를 Main에서 호출해봤다고 볼 수 있습니다.
                호출 결과 -> 객체 생성
        2. 매개변수 생성자 : 하나 이상의 매개 변수를 가지는 생성자

 */
public class Constructor {
    // 필드 선언
    int num;
    String name;

    // 기본 생성자 정의 -> 원래 기본적으로 만들어집니다.
    // 그리고 매개변수의 유무만 있고, return이 없어서 call1() / call2() 유형이라고 했으니까
    // 기본 생성자는 call1() 유형에 해당할 것이고, 클래스명과 동일한 메서드명을 가집니다.
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 정의 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야 함.
    // 근데 매개변수 생성자가 하나라도 만들어지면 default로 만들어진 기본 생성자가 사라지기
    // 때문에 기본 생성자와 매개변수 생성자를 둘 다 사용하고 싶다면
    // 기본 생성자도 따로 '명시적으로 정의'해야만 합니다.
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체됨.
    }

    // String title을 매개변수로 하는 생성자를 정의하고,
    // RequiredArgsContructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력할 수 있도록
    // 작성한 뒤
    // ConstructorMain으로 가서, constructor3이라는 객체명을 지니고, title에 "여러분이름"으로
    // 지어 객체를 생성한 후,
    // System.out.println(constructor3.name); 을 입력하여 콘솔에 여러분 이름을 출력하시오.
    Constructor(String title) {
        System.out.println("RequiredArgsConstrucotr(String 매개변수를 필수로 요구하는 생성자");
        this.name = title;
    }
}












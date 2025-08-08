package ch13_inheritance;
/*
    Animal 클래스를 상속 받고
    생성자 및 getter / setter를 사용하여
    Animal 클래스의 move() 메서드를 오버라이딩하여
    "사람이 두 발로 걷습니다."만 출력하도록 '재정의' 합니다.

    Main에서
    human1 객체를 생성(기본 생성자 사용),
    setter를 통해 여러분이름과 여러분나이를 입력,
    getter를 활용하여
    안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다."
    내년에는 몇+1살이 됩니다.
    를 출력하시오.

    또한 Human 클래스의 고유 메서드인 read("자바의 기초")를       -> call2() 유형입니다.
    정의하여 콘솔에 다음과 같이 출력될 수 있도록 작성하시오.

    여러분이름이 자바의 기초를 읽는 중입니다.

    실행 예
    사람 객체가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다.
    내년에는 몇+1살이됩니다.
    여러분이름이 자바의 기초를 읽는 중입니다.

 */
public class Human extends Animal {
    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    // 고유 메서드 read() - call2()
    public void read(String bookTitle) {
        System.out.println(getAnimalName() + "이 " +
                bookTitle + "을 읽고 있는 중입니다.");
    }
}

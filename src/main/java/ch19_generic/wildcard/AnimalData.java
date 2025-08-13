package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은
        Tiger / Human 객체를 필드에 대입할겁니다.

        근데 T에는 어떤 클래스도 들어갈 수 있기 때문에 현재 상황에서는
        Car 클래스의 객체도 animal 필드에 들어갈 수 있을겁니다.

        저희의 이번 목표는
        특정 클래스라면(즉 Animal 클래스의 상속을 받은 서브클래스라면)
        해당 클래스에 맞는 객체 정보를 출력하도록 할겁니다.
     */

    public void showData() {
        ((Animal) animal).move();       // 앞부분의 Animal은 형변환 부분 / animal은 필드 이름입니다.
        // AnimalData의 필드인 animal을 Animal 타입으로 형변환해서 .move() 메서드를 호출했습니다.
        // 여기서는 의문의 여지가 없이 호랑이가 네 발로 뜁니다 / 사람이 두 발로 뜁니다가 출력되겠네요.

        if(animal.getClass() == Human.class) {
            ((Human)animal).read();     // 현재 필드에 들어간 animal 객체의 클래스를 확인하여
            //(.getClass()를 통해서) 그것이 Human 클래스라면
            // Human 클래스의 고유 메서드인 .read() 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }
}

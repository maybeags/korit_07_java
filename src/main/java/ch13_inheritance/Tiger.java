package ch13_inheritance;
/*
    상속을 지시하는 키워드 extends
 */
public class Tiger extends Animal{ //자식클래스 extends 부모클래스
    // field와 getter / setter는 없지만
    // Tiger의 고유 메서드는 또 따로 정의 가능

    // 고유메서드 # 1
    public void hunt() {
        System.out.println(getAnimalName() + "이(가) 사냥을 합니다.");
    }
    // 고유메서드 # 2 오버로딩 적용
    public void hunt(String prey) {
        System.out.println(getAnimalName() + "이(가) " + prey + "를 사냥 합니다.");
    }

    // 재정의된 methods : 부모 메서드의 결과값과 다르게 작성한다면 전부 재정의에 해당함.
    @Override           // 얘가 붙어있으면 해당 메서드는 상속 받은 것
    public String getAnimalName() {
        return super.getAnimalName() + "님";
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override // 이 경우는 method명만 동일하고 전부 다 재정의했습니다.
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}

package ch14_abstraction.abstract_classes;

public abstract class Factory {
    // 필드 선언
    private String name;

    public abstract void produce(String model);
    public abstract void manage();
    /*
        팝업 뜨는 것을 확인했을 때 메서드 본문(method body)에 해당하는 부분이 저희가 타이핑 했던
        구현부를 의미한다는 것을 알 수 있습니다. 그리고 코드로는 {} 이 중괄호 영역에 해당합니다.

        abstract 접근지정자와 리턴 타입 사이에 명시되면
        클래스에도 동일하게 abstract 키워드가 적용돼야 합니다.

        왜?
        추상 메서드가 하나라도 있으면 추상 클래스로 정의되어야만 하니까.
     */
    // 객체를 만들지 못하고 추상 메서드가 있는 클래스가 추상 클래스라면

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다\n공장 이름 : " + name);
    }
}

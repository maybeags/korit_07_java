package ch18_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    // 생성자를 정의하는 방법은 많은데, Lombok을 도입할 수도 있지만 그 경우에도
    // 몇 번째 argument로 이름을 넣는지, 나이를 넣는지는 골치가 아픕니다.

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    /*
        PersonMain에서 생성자 호출을 통해서 객체를 생성하는 것을 막았습니다.
        그리고 매개변수 부분을 보면 Builder builder라고 되어있고,
        그 다음 줄에는 builder.name을 봤을 때,
        builder 객체의 필드로 name / age / address가 있는 것으로 보입니다.
        여기서 중요한 점은 Person의 필드와 Builder의 필드가 동일해야 한다는 겁니다.
     */

    public static class Builder {
        private String name;
        private int age;
        private String address;

        /*
            이하의 코드는 method를 정의하는 영역입니다.
            대부분의 경우 method는 행위를 나타내기 때문에 동사로 시작한다고
            설명했었지만, Builder 패턴의 경우
            대입될 필드의 이름과 동일한 메서드 명을 짓습니다.
            근데 필드는 명사로 지으니까 명사겠네요.
         */
        public Builder name(String name) {
            this.name = name;   // 객체가 생성되면 객체 이름으로 치환되는 키워드
            return this;    // 여태까지는 name에 값이 없다가, 37번 코드라인 시점에 name field에
            // 값이 대입된 객체가 리턴됨.
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 그래서 이 위쪽 코드까지는 field 명과 동일한 메서드들을 정의했습니다.
        // 그 효과는 메서드명과 동일한 field에 값이 대입된 Builder 객체가 리턴됩니다.

        public Person build() {
            return new Person(this);        // 이 this는 Builder 클래스의 인스턴스에 해당합니다.
        }
    }
}

package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("안근수")
                .age(38)
                .address("부산광역시 연제구")
                .build();   // chaining method에 해당

        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        System.out.println(person2);
    }

}

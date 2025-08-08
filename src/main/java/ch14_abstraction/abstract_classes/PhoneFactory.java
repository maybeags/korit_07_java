package ch14_abstraction.abstract_classes;

public class PhoneFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println();
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}

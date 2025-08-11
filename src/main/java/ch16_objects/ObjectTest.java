package ch16_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }
    // 기본 생성자 / AllArgsConstructor를 정의하시오.
    // getter / setter를 정의하시오.
    // showInfo()를 call1() 형식으로 정의하시오.
    /*
        실행 예
        이름 : 안근수
        주소 : 부산광역시 연제구

        Main으로 가서 objectTest1에
        이름 안근수 주소 부산광역시 연제구를 set하고
        showInfo()를 호출하시오.
     */

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
//    @Override
//    public String toString() {
//        return super.toString();
//    }


}

package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        // 객체 생성
        ObjectTest objectTest1 = new ObjectTest();
        objectTest1.setName("안근수");
        objectTest1.setAddress("부산광역시 연제구");
        objectTest1.showInfo();

        System.out.println(objectTest1);

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);    // true

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);    // true
        System.out.println(result3);    // true

        String example2 = new String("안녕하세요");
        boolean result4 = "안녕하세요" == example2;
        System.out.println(result4);        // false

        boolean result5 = strArray[0] == example2;
        System.out.println(result5);        // false

        boolean result6 = strArray[0].equals(example2);
        System.out.println(result6);        // true
    }
}

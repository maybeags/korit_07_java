package ch11_access_modifier;

class AccessModifierExample {   // 간판이 되는 클래스는 public class
    // 필드 선언        - 필드인데, 선언 및 초기화
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }
}

public class Main {
    // 여기에 메서드 정의하고
    public static void main(String[] args) {
        // 여기에 작성했는데, 다르게 작성합니다.
        // 객체 생성
        AccessModifierExample example = new AccessModifierExample();
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privateVar);   // private 접근 지정자이기 때문에 오류 발생
        System.out.println(example.getPrivateVar() + 1);    // 필드를 직접 호출하는 것이 아니라 getter를 통한 호출 // 가공도 가능
    }
}

// PersonMain
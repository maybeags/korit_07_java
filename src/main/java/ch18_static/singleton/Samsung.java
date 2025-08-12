package ch18_static.singleton;
/*
    방금 작성한 ProductView와 인터넷에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱글톤 패턴을 작성하시오.
 */
public class Samsung {
    // 정적 필드
    private static Samsung instance;

    // private으로 NoArgsConstructor 정의
    private Samsung() {}

    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }
}

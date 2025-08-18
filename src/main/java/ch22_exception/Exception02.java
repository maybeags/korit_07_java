package ch22_exception;

class LoginFailedException extends Exception {
    // 매개변수 생성자를 사용함.
    public LoginFailedException(String message) {
        super(message);         // 슈퍼 클래스의 생성자 호출
        System.out.println("예외가 발생했습니다.");
    }
}
public class Exception02 {

    public static void login(String id, String password) throws LoginFailedException {
        // 메서드 내에 지역변수 선언 및 초기화
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        // 매개변수와 지역변수의 일치 여부 확인하는 조건문
        // 메서드 내에 고전적인 예외 처리를 작성한 예시
        if(!id.equals(correctId) || !password.equals(correctPassword)) {
//            System.out.println("로그인 실패 !! ID 혹은 비밀번호를 확인하세요.");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다."); // "ID 또는 PW가 틀렸습니다."를
            // argument로 하는 LoginFailedException 객체가 생성되었다고 할 수 있겠네요.
        }
    }

    public static void main(String[] args)  {
        String inputId = "admin";
        String inputPassword = "1234qwer";

        //login(inputId, inputPassword);  // 코드 작성 순서 잘 기억하시면 좋겠습니다.
        // throws 키워드를 달게 되니까 여기에 오류가 발생했습니다.

        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {  // 자동완성으로 사용자 정의 Exception 클래스가 나왔는데
            // 그 근거는 login() 메서드 다음에 throws LoginFailedException을 작성했기 때문입니다.
            System.out.println("로그인 실패 : " + e.getMessage());
            // 이상을 실행했을 때 e.getMessage()의 결과값이 "ID 또는 PW가 틀렸습니다."라는 것을
            // 확인할 수 있습니다.
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
/*
    사실상 사용자 정의 예외 처리 방식 역시
    try / catch / finally 와 throws / throw가 추가되었을 뿐이지
    method의 정의 / 생성자 정의 / 객체 생성 방식이라는 저희가 여태까지
    배워온 코드 작성 방법과 차이가 없다는 것을 확인할 수 있습니다.
 */

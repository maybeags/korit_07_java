package ch22_exception.age_exception;
// extends Exception을 통해 예외 관련 클래스임을 명시
public class InvalidAgeException extends Exception{
    // 사용자 정의 생성자 정의
    public InvalidAgeException(String message) {
        super(message);
    }
}

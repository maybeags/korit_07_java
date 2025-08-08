package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        // 객체 생성 및 실패 사례 -> 그런데 저희가 생각해볼 부분이 있습니다.
        // 특정 방식을 이용하면 비밀번호 범위나 잔액 범위를 벗어난 상태로
        // 객체 생성이 가능하다는 점입니다.
        // 어떻게 ?
//        Bank bank3 = new Bank();
//        bank3.setPinNumber(-3);
//        bank3.setBalance(-123456);

        Bank bank1 = new Bank(123456, "홍길동", 100000, 1234);
        Bank bank2 = new Bank(987654, "신사임당", 500000, 1234);
        bank1.showAccountInfo();
        bank2.showAccountInfo();
        System.out.println();
        bank1.deposit(50000, 1234);
        bank1.withdraw(200000, 1234);
        bank1.withdraw(100000, 1234);
        System.out.println();
        bank2.withdraw(100000, 1234);
        bank2.deposit(200000, 1234);

        System.out.println();
        System.out.println("최종 계좌 정보");
        bank1.showAccountInfo();
        bank2.showAccountInfo();
        System.out.println();
        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank bank4 = new Bank(13579, "김사", -3000, 789456);
        bank4.showAccountInfo();
    }
}


// ch12_arrays -> Array01 클래스 생성 -> main
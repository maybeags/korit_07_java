package ch09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        // int 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(1);
        // 여기서 number : 1에 해당하는 것은 argument입니다.
        // 그리고 new Constructor(1); 부분에서 Constructor에
        // ctrl + enter 키를 누르게 되면
        // 매개변수 생성자로 넘어가게 됩니다.
        // 거기에 있는 Constructor(int number){}에 해당하는 부분에서
        // (int number) 부분을 매개변수(parameter)라고 부릅니다.

        // 8번 라인에서 객체를 생성하게 됐을 때 argument로 들어간
        // 1 이라는 int data는 매개변수 생성자를 통해서
        // int number = 1; 로 초기화되고
        // System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        //        this.num = number;
        // 에서 contructor2.num = number; 대입이 일어나게 됩니다.
        // 그러면 최종 결과는
        // contructor2.num = number = 1;이 되겠네요.

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String title = scanner.nextLine();

        Constructor constructor3 = new Constructor(title);
        System.out.println(constructor3.name);

        Constructor constructor4 = new Constructor("김사");
        System.out.println(constructor4.name);
    }
}

// ch09_classes 우클릭 -> 새로 만들기 -> 패키지 -> students
// students 우클릭 -> Student / StudentMain

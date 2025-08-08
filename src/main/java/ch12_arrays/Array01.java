package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr01 = { 1, 2, 3, 4, 5 };
//        int i = 1;
//        System.out.println(i);              // 결과값 : 1
        System.out.println(arr01);          // 결과값 : [I@36baf30c

        // 현재 상황에서 배열 내부의 값을 확인할 수가 없습니다. 주소지만 출력이 됩니다.
        // 배열 내부의 각 숫자들을 뭐라고 한다 ?
        // 현재 배열 내부에는 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능합니다.
        // 즉 element들을 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요합니다.
        // 이때 필요한 개념이 index(주소지라고하기도 합니다) 개념입니다.
        System.out.println(arr01);      // 주소값만 출력
        System.out.println(arr01[0]);   // 배열명[index]의 형태로 내부 데이터를 직접 확인 가능
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);

        // 어, index만 빼고 나머지가 반복되네? 반복문 써봐야겠네? 하면 개발자지망생
        // 반복문을 활용하여 arr01의 내부 element들을 콘솔에 출력하시오.
        // 1 2 3 4 5 로 출력될 수 있도록 수정하시오.

        // 반복문 복습
        for ( int i = 0 ; i < 5 ; i++ ) {       // 5가 하드코딩 되어있음. -> literal을 그대로 썼다
            System.out.print(arr01[i] + " ");       // i가 어디에 적용되어야하는지 감안할 필요가 있었다
        }
        System.out.println();
        for ( int i = 0 ; i < arr01.length ; i++ ) {    // arr01.length 형태로 배열 내부의 데이터 개수가 바뀌더라도 문제 없음
            System.out.print(arr01[i] + " / ");
        }

        "안녕하세요".length();

        // 근데 우리가 필드를 참조할 때 객체명.필드 형태로 참조했었습니다.
        // bank1.accountHolder와 같은 방식으로 참조 가능했습니다.
        // 그리고 field를 직접 참조했다는 말은 length 필드는 public이라고 볼 수 있겠네요

        // 그렇다면 배열은 객체인가    -> 완전히 그렇다고는 x / 하지만 field로 length를 가진다
        // 빈 배열 생성
        int[] arr02 = new int[10];  // 10개짜리 방을 가진 비어있는 배열을 생성했습니다.

        // 이상의 모든 것을 종합했을 때,
        // 배열 내부의 방의 개수 / 주소지의 한계값 - 1을 우리가 항상 알고 있는 것은 아니기 때문에
        // element 값을 출력하기 위한 반복문의 한계값을 설정할 때
        // 배열명.length를 쓰는 것을 생활화하자.

        // arr01 내부에 있는 1, 2, 3, 4, 5는 굳이 따지자면 arr01[0], arr01[1], ..., arr01[4]라는 변수명을 지니고
        // 있다고 볼 수 있습니다.

        // 변수의 개념을 우리는 다시 생각 해야 합니다.
        arr01[0] = 10;      // 그럼 얘는 재대입이겠네요
        System.out.println(arr01[0]);       // 결과값 : 10

        // 그럼 우리는 배열에 값을 대입할 수가 있습니다.
        // arr02는 현재 10개짜리 방을 지닌 배열에 해당하고, 내부에는 아무런 값이 없습니다.
        for ( int i = 0 ; i < arr02.length ; i++ ) {
            System.out.println(arr02[i]);
        }
        // arr02에 21, 22, 23, 24, 25, ..., 30을 대입하고
        // 21 / 22 / 23 / 24 / ... / 30 /이라고 출력될 수 있도록 코드를 작성하시오.
        for ( int i = 0 ; i < arr02.length ; i++ ) {
            arr02[i] = 21 + i;              // 값을 대입하는 반복문
            System.out.print(arr02[i] + " / ");
        }
        System.out.println();
        // arr02에 현재 21, 22, 23, ..., 30이 대입되어 있습니다.
        // 42, 44, 46, ..., 60이 될 수 있도록 반복문을 작성하고
        // 42, 44, 46, ..., 60, 으로 출력하시오.
        for ( int i = 0 ; i < arr02.length ; i++ ) {
            arr02[i] *= 2;              // 값을 대입하는 반복문
            System.out.print(arr02[i] + ", ");
        }
        System.out.println();
        // 다른 자료형도 동일한 방식으로 생성됩니다
        String[] strArrary01 = { "안", "녕", "하", "세", "요" };
        System.out.println(strArrary01[0]);
        // 그래서 다른 자료형의 배열이라더라도 기본적으로 element를 추출하는 절차는 동일합니다.

        // Array02 생성
    }
}

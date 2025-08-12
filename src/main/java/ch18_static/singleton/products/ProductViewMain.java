package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        
        // 이상의 코드는 ProductView.java 를 확인했을 때 객체를 생성하는 method입니다.
        // 생성자를 호출하지 않은 이유는 생성자가 private이기 때문이었습니다.
        // 하지만 이상의 코드를 실행 했을 때 1 번째 객체가 생성되었습니다. 한 줄만
        /*
            출력되었습니다.
            그런데 그 전에 static 배웠을 때는 1, 2, 3, 4, 5번째 객체가 생성되었습니다로
            튀어나왔었는데 차이가 뭐냐면
            저희는 생성자 내에 지역 변수로 int counter를 선언하고 초기화했었기 때문입니다.

            그래서 static 패키지 내부의 코드와 이번의 ProductView 코드를 비교/대조해서
            확인할 필요가 있습니다.

            그리고 기출 문제 싱글톤도 확인하시면 더 좋습니다.
         */
    }
}

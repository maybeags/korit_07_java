package ch09_classes.products;
/*
    1. 기본 생성자를 사용하여 객체를 생성하세요
   product1
   productNum 123456
   productName LG엘패드
2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
    객체를 생성하시오.
    product2
    productNum 9876564
    productName 다이소충전기

3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해
    객체를 생성하시오
    product3
    productNum 159357
    productName USB-C 케이블

4. AllArgsConstructor를 이용하여 객체 생성하시오.
    product4
    productNum 951753
    productName GFlip6

5. 정보를 출력하는 showInfo()(call1타입으로 정의할것)의 콘솔창 결과는
    다음과 같습니다.

    실행 예
    시리얼 넘버 : 951753
    제품 타이틀 : GFlip6

6. 각 객체에 대해서 showInfo()를 적용시킬 것
 */
public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법 클래스명 객체명 = new 생성자;
        // 기본 생성자를 통한 생성
        Product product1 = new Product();
        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor) 2 번
        Product product2 = new Product(987654);
        Product product3 = new Product("USB-C 케이블");
        // 매개변수 생성자를 통한 생성(AllArgsConstructor) 1번
        Product product4 = new Product(951753, "GFlip6");

        // 속성 값 대입
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        product2.productName = "다이소충전기";
        product3.productNum = 159357;

        // 현재 상황에서도 showInfo()의 호출이 가능
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();



        // ch09_classes 우클릭 -> ReviewMethod 클래스 생성

    }
}

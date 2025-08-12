package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        // static 메서드의 호출은 객체를 생성하지 않은 시점에서도 가능합니다.
        // 객체 생성 전
//        System.out.println(Product.getTitle());

//        Product product1 = new Product();
//        product1.setName("아이스아메리카노");
//        System.out.println(product1.getName());
//        System.out.println(Product.getCount());


        System.out.println(Product.getCount());

        Product product1 = new Product();
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product2 = new Product();
        System.out.println("일반 필드 조회 : " + product2.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product3 = new Product();
        System.out.println("일반 필드 조회 : " + product3.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());


        product1.increaseInstanceCount();
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount());
    }
}

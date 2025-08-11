package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("아이스아메리카노");
        System.out.println(product1.getName());
        System.out.println(Product.getCount());

    }
}

package ch13_inheritance.products;
/*
    super 키워드
        1. super();             -> 얘는 부모 생성자를 호출한다는 의미
        2. super.메서드명();     -> 얘는 부모 클래스의 메서드를 호출한다는 의미


    지금 작성하는 부분의 경우 github에 완전판이 올라가기 때문에 왜 오류가 발생하는지
    어떻게 검증하는지 어려움을 겪을 수 있습니다.

    부모-자식의 상속관계가 성립되어 있을 때,
    부모 클래스에서 기본 생성자 없이 매개변수 생성자만 있다면
    자식 클래스에서 완벽한 기본 생성자를 만드는 것이 불가능합니다.

    자식 클래스의 객체 생성 시 필수적으로 '부모 클래스의 생성자를 호출'하기 때문입니다.

    // 어떤 객체를 생성한다고 가정할 때
    A a = new B();
    같은 형태의 객체 생성 방식이 튀어나오게 되는데(추후 수업 예정)
    이상의 방식은 정보처리기사에서는 단골 문제입니다.

 */
public class Product extends Item {
    // 자식 고유의 field 정의
    private int price;
    private int stock;

    // 이거는 부모 생성자를 호출한건데, Product 클래스의 AllArgsConstructor를 만들고 싶다면
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    // 자식 고유의 field에 대한 getter / setter 정의
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 자동 완성 아닌 고유 메서드 하나 임의로 정의하겠습니다
    public void showInfo() {
        System.out.println("제품명 : " + this.getName());      // 부모거라서 getter로 조회
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price);                // 자식 거라서 field로 조회
        System.out.println("재고 : " + stock);                // 두줄씩 코드라인의 차이가 생기는 이유에 대해 명확히 아시길 추천드립니다.
    }
}

package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        String bookTitle = book1.getTitle();
        String bookAuthor = book1.getAuthor();
        System.out.println("이 책의 제목은 " + bookTitle + "입니다.");
        System.out.println("이 책의 저자는 " + bookAuthor + "입니다.");
        book1.showInfo();

        System.out.println();

        EBook eBook1 = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        eBook1.setFormat("PDF");
        System.out.println("이 전자책의 파일 형식은 " + eBook1.getFormat() + "입니다.");
        eBook1.showInfo();
    }
}

// ch14_abstraction -> abstract_classes -> Factory

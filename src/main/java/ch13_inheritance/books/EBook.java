package ch13_inheritance.books;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // 메서드 오버라이딩을 하는 것을 권장
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : " + fileSize + "MB");
        System.out.println("파일 형식 : " + format);
    }
//    오버라이딩 하지 않고 자식 클래스의 고유 메서드로 별개로 만든 경우(이름이 부모 클래스의 메서드와 겹쳐도 관계 x)
//    public void showInfo() {
//        System.out.println("제목 : " + getTitle());
//        System.out.println("저자 : " + getAuthor());
//        System.out.println("파일 크기 : " + fileSize + "MB");
//        System.out.println("파일 형식 : " + format);
//    }
}

package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        // 객체의 필드에 값을 대입하는 방법
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        // 두번째 객체 어떤 생성자 쓸지, 속성값 어떻게 대입할지
        Student student2 = new Student(2025002);
        // 생성 할 때마다 넣어도 그만이겠네요
        Student student3 = new Student("김삼");
        Student student4 = new Student(2025004, "김사");
        Student student5 = new Student(2025005, "김오", 80.7);

        // 객체 생성 끝나고 속성값을 집어넣어도 될거고
        student2.name = "김이";
        student2.score = 100;

        student3.studentCode = 2025003;
        student3.score = 95.8;

        student4.score = 4;

        // showInfo() 호출
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}

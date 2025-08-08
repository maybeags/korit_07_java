package ch10_getter_setter.univ_student;
/*
    1. 클래스 설계
        name / grade(1,2,3,4) / score(double) 로 필드를 정의하시오.
    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자
        를 정의하시오.
    3. Setter / Getter 메서드를 정의하시오. -> alt + ins를 사용할 수 있습니다.
        각각의 필드에 대한 setter / getter를 정의합니다.
        setter 3개 / getter 3개가 되겠네요.
        1) setGrade의 범위 1 ~ 4학년
        2) setScore의 범위 0.0 ~ 4.5까지
        범위를 벗어날 경우 불가능한 입력입니다. 가 출력되도록 비지니스 로직을 작성
    4. UnivStudentMain에서
        student1 -> 기본생성자 김일 / 1 / 3.3
        student2 -> 기본생성자 김이 / 3 / -30 -> 실패하고 4.0 입력
        student3 -> 기본생성자 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본생성자 김사 / 4 / 3.8
        student5 -> 기본생성자 김오 / 2 / 1.0
        으로 객체 생성하시오.
    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo() 메서드를 call1() 유형을로 작성하시오.
 */
public class UnivStudent {
    // 필드 선언
    String name;
    int grade;
    double score;

    // 생성자 만들기 alt + ins
    public UnivStudent() {}

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    // getter / setter 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {   // 로직 수정
        if (grade > 0 && grade < 5) {
            this.grade = grade;
        } else {
            System.out.println("불가능한 입력입니다.");
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) { // 로직 수정
        if (score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    void showInfo() {
        System.out.println("\n이름 : " + name + "\n학년 : " + grade + "\n점수 : " + score);
    }
}

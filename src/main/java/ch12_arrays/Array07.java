package ch12_arrays;
/*
    20250805에 점수 배열의 내부 element들의 합과 평균을 구할 수 있음

    내부 element의 값들의 점수 범위를 조사하여
    90이상은 A
    80이상은 B
    70이상은 C
    60이상은 D
    59이하는 F 인데,
    A가 몇 명이고, B가 몇 명이고 ... F가 몇 명인지 출력할 수 있도록 할 예정입니다.
 */
public class Array07 {

    public static void main(String[] args) {
        int[] scores = { 100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100 };
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        // int[] =/= int
        for ( int i = 0 ; i < scores.length ; i++ ) {
            if (scores[i] > 89) {
                a++;
            } else if (scores[i] > 79) {
                b++;
            } else if (scores[i] > 69) {
                c++;
            } else if (scores[i] > 59) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 여러분이 이제 고민할 부분은 -> 어차피 변수 abcdf가 하나하나 int니까
        // int[] 배열로 선언해가지고 선언하는 변수 개수를 줄일 수 있지 않을까
        int[] grades = { 0, 0, 0, 0, 0 };
        // A에 해당하는 점수라면 grade[0] 숫자를 +1 해주고, B에 해당하면 grade[1] +1 ...
        // 굳이 다섯줄 써가면서 변수들을 선언할 필요가 없다.
        System.out.println();
        for ( int i = 0 ; i < scores.length ; i++ ) {
            if (scores[i] > 89) {
                grades[0]++;
            } else if (scores[i] > 79) {
                grades[1]++;
            } else if (scores[i] > 69) {
                grades[2]++;
            } else if (scores[i] > 59) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }

        System.out.println("배열 A 학생 수 : " + grades[0]);
        System.out.println("배열 B 학생 수 : " + grades[1]);
        System.out.println("배열 C 학생 수 : " + grades[2]);
        System.out.println("배열 D 학생 수 : " + grades[3]);
        System.out.println("배열 F 학생 수 : " + grades[4]);

        int a2 = grades[0];
    }
}

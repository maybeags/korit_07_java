package ch07_loops;
/*
         *
        **
       ***
      ****
     *****

     *****
      ****
       ***
        **
         *
 */
public class Loop08 {
    public static void main(String[] args) {
        // 개행을 책임지는 for문
        for ( int i = 0 ; i < 6 ; i++ ) {
            // 공백을 책임지는 for문 -> 공백은 줄어들어야 함.
            for ( int j = 5 ; j > i ; j-- ) {
                System.out.print("  ");
            }
            // 별을 책임지는 for문 -> 별은 늘어나야 함.
            for ( int k = 0 ; k < i ; k++ ) {
                System.out.print("🚗");
            }
            System.out.println();
        }

        /*
            금일 자습시간에 TMS 사진 등록 하겠습니다.
            단톡방 확인할 것

            https://koritbs.cafe24.com/
         */

        System.out.println();

        for ( int i = 0 ; i < 5 ; i++ ) {
            // 공백이 늘어나야 함.
            for (int j = 0 ; j < i ; j++) {
                System.out.print("  ");
            }
            // 별이 줄어들어야 함
            for ( int k = 0 ; k < 5 - i ; k++ ) {
                System.out.print("🚗");
            }
            System.out.println();
        }


        // ch08_methods -> Method01 -> main을 만들지 않습니다


    }
}

package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        /*
            1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌릴 것.
            2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
            3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List에서 element들을 추출하여 작성할 것.
            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5 명
            1 번 학생의 수학 여행지를 입력하세요 >>> 제주
            2 번 학생의 수학 여행지를 입력하세요 >>> 제주
            3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5 번 학생의 수학 여행지를 입력하세요 >>> 제주

            1 번 학생의 후보지 : 제주
            2 번 학생의 후보지 : 제주
            3 번 학생의 후보지 : 민속촌
            4 번 학생의 후보지 : 민속촌
            5 번 학생의 후보지 : 제주

            수학 여행 후보지는
            제주
            민속촌
            입니다.
         */
        // 사용할 클래스 선언
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 선언
        List<String> fieldTrips = new ArrayList<>();
        List<String> finalFieldTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();
        int student = 0;
//        String fieldTrip = "";      // 최종 작성 결과 얘는 fieldTrips list의 맨마지막 element와 동일한 값을 가지게 됨.
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        student = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0 ; i < student ; i++) {
            System.out.print((i+1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            // list에서 element를 추가하는 메서드
            String fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }
//        System.out.println(fieldTrip);        // 이건 38번 코드 라인이 주석 처리 해제 되었을 때만 오류 발생 x
        System.out.println();
        // 최초 list에서의 element 추출
        for ( int i = 0 ; i < student ; i++ ) {
            System.out.println((i + 1) + " 번 학생의 후보지 " + fieldTrips.get(i));
        }

        // 최초 list에서 set으로 element를 옮깁니다 -> 중복 제거를 위해
        fieldTripSet.addAll(fieldTrips);
        // 이제 또 set에서 list로 옮깁니다 -> 중복 제거된 element들을 추후 추출하기 위해서
        finalFieldTrips.addAll(fieldTripSet);
        System.out.println();
        System.out.println("수학 여행 후보지는 ");
        for ( String trip : finalFieldTrips ) {
            System.out.println(trip);
        }
        System.out.println("입니다.");



    }
}

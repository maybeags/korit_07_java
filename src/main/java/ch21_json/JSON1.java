package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty() 메서드

        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        jsonObject1.addProperty("score", 4.5);

        System.out.println(jsonObject1);
        /*
            아까 배운 Map과의 차이가 있다면
            1. Map에서는 key에 ""가 없었고,
                JSON에서는 모든 key에 String 자료형처럼 보이도록 ""가 있습니다.
            2. Map에서는 key1=value1의 형태로 작성되어있었지만
                JSON에서는 "key1":value1의 형태로 작성되어있습니다.
         */
        jsonObject1.addProperty("job", "코리아아이티국비강사");
        System.out.println(jsonObject1);
        /*
            컴퓨터가 콘솔에 출력한 형태를 보니까 JSON 결과값이 길게 늘어져있습니다.
            나무위키에서는 막 엔터쳐져있는 것 같은데
            그래서, 가독성을 개선하는 방법으로 출력하기도 합니다.
            컴퓨터가 읽기 편한 방식이 아니라 사람이 읽기에 적합한 형태로 출력하는 것을
            pretty priting이라는 표현을 씁니다.
            이걸 외부에서 지원하는 방식을 수업합니다.
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // jsonObject1을 PrettyPrinting이 적용된 JSON 문자열 형태로 반환
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);

    }
}

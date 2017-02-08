package chapter10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangqi on 17/2/7.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "你好");
        map.put("how are you?", "吃了没？");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you?"));
    }
}

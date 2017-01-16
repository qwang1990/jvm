package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangqi on 16/12/27.
 */
public class HeapOOm {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}

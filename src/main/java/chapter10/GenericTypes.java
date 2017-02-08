package chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangqi on 17/2/7.
 */
public class GenericTypes {
    //这里编译会报错，因为查出List<String>和List<Int>都是List<E>。。
//    public static void method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//    }

//    public void sayHi(){}
//
//    public int sayHi(){return 1;}

//    public static void method(List<Integer> list) {
//        System.out.println("invoke method(List<Integer> list)");
//    }
//
//    public static String method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//        return "";
//    }
//
//    public static int method(List<Integer> list) {
//        System.out.println("invoke method(List<Integer> list)");
//        return 1;
//    }
//    public static void main(String[] args) {
//        method(new ArrayList<String>());
//        method(new ArrayList<Integer>());
//    }
}

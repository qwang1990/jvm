package chapter7.classloading3;

/**
 * Created by wangqi on 17/2/3.
 */
/**
 * 非主动使用类字段演示
 **/
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}

package chapter7.classloading1;

/**
 * Created by wangqi on 17/2/3.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }

    public void sayHi() {
        System.out.println("hi");
    }
}

package chapter7.forwardref;

/**
 * Created by wangqi on 17/2/4.
 */
public class Test {
    static {
        i = 10;  //  给变量复制可以正常编译通过
        //ASystem.out.print(i);  // 这句编译器会提示“非法向前引用”
    }
    static int i;


    static {
        System.out.println(i);
    }

    public static void main(String[] args){
        Test t = new Test();
    }
}

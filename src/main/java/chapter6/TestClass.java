package chapter6;

/**
 * Created by wangqi on 17/1/19.
 */
public class TestClass {
    private int m;

    public int inc() {

        int x;
        try {
            x = 1;
            throw new RuntimeException("eheheeh");
            //return x;
        } catch (Exception e){
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    public int fib(int n) {
        if(n>0){
            return n + fib(n-1);
        } else{
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TestClass().inc());
    }


}

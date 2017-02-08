/**
 * Created by wangqi on 16/12/27.
 */
public class Main {

    private static Main m = new Main();

    private Main(){}

    public static Main getInstance() {
        return m;
    }


    public static void main(String[] args){

        Main m = Main.getInstance();

        Main m2 = Main.getInstance();
        System.out.println(m);

        System.out.println(m2);
        //System.out.println("hello world");
        //float a = 1/0;
        //System.out.println(a);
    }
}

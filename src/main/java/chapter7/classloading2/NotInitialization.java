package chapter7.classloading2;

/**
 * Created by wangqi on 17/2/3.
 */

import chapter7.classloading1.SuperClass;

/**
 * 被动使用类字段演示二：
 * 通过数组定义来引用类，不会触发此类的初始化
 **/
public class NotInitialization {

    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }

}

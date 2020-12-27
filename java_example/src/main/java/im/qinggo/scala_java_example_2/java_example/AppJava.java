package im.qinggo.scala_java_example_2.java_example;

import im.qinggo.scala_java_example_2.scala_example.AppScala;

public class AppJava {
    public static Integer doSomeCalculation(Integer input){
        System.out.println("doSomeCalculation in Java");
        return 3 * input + 10;
    }
    public static void main(String[] args) {
        System.out.println("Hello Java World!");
        System.out.println(doSomeCalculation(5));
        System.out.println(AppScala.doSomeCalculation(5));
    }
}

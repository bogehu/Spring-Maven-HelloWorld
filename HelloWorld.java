package cn.Spring.Demo;

/**
 * Created by bogehu on 16/5/14.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("你好"+" "+name);
    }
}

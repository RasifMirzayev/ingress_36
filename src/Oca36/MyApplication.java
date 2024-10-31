package Oca36;

public class MyApplication {


    static int count;

    public MyApplication(String name, int  age ) {
        count++;
    }
    public static void main(String[] args) {
        MyApplication obj1 = new MyApplication("Rasif", 20);
//        MyApplication obj2 = new MyApplication();
//        MyApplication obj3 = new MyApplication();
//        MyApplication obj4 = new MyApplication();
//        MyApplication obj5 = new MyApplication();

        System.out.println(count);



    }
}

package com.Legion;


import jdk.swing.interop.SwingInterOpUtils;

/*class Phone{
    void Switch(){
        System.out.println("Switch on");
    }
    void show(){
        System.out.println("show");
    }
}
class Smartphone extends Phone{
    void add(){
        System.out.println("app");
    }
    void Switch(){
        System.out.println("Switch on");
    }

}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        Phone A=new Smartphone();
        A.show();
        A.Switch();

    }
}*/
class A2{
    int a1=20;
    void M1(){
        System.out.println("Class A");
    }
    void M2(){
        System.out.println("super  class hello");
    }
    void M3(){
        System.out.println("Super class m3");
    }
}
class B2 extends A2{
    int a1=30;

    void M1()
    {
        System.out.println("Class B");
    }
    void M3(){
        System.out.println("sub  class hii");
    }
    void M(){
        System.out.println("sub class M");
    }
}
public class Dynamic_method_Dispatch {

    private static A2 a;

    public static void main(String[] args) {
        //Upcasting
        // B2 constructor is call at run time
        A2 a = new B2();
        a.M1();//after that M1 method of B2 will call
        System.out.println(a.a1);// but it not supports in data members
        a.M2();
        a.M3();
        System.out.println();


        //Upcasting
        A2 b=new A2();// A2 constructor is call at run time
        b.M1();//after that M1 method of A2 will call
        System.out.println(b.a1);//but it not supports in data members
        b.M2();
        b.M3();
        b.M2();
        



    }
}
package com.Legion;
class A1{
    int a;
    int b;

    A1(){
        B1 a=new B1(this);
    }

    void M1(B1 obj){
        System.out.println(obj.a+ obj.b);
    }
}
class B1{
    int a=20;
    int b=30;
    B1(){
        System.out.println("Default ");
    }
    B1(A1 obj){
        System.out.println("Hello "+a+b);
    }
    void M2(){
        A1 a=new A1();
        a.M1(this);

    }
}
public class Practice1 {
    public static void main(String[] args) {
        B1 a=new B1();
        a.M2();



    }

}

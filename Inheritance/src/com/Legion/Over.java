package com.Legion;
class Aa{
    int a=10;
    Aa(){
        System.out.println("Aa Default");
    }

    Aa(Bb obj){
        System.out.println("Parametrise");
        obj.a=25;
    }
    public void method1(){
        System.out.println("A class method 1");
    }

    void M1(){
        System.out.println(a);
    }
    void M1(int a){
        System.out.println("value:->"+a);
    }
}
class Bb extends Aa{
    Bb(){
        System.out.println("Bb");
        //Aa obj=new Aa(this);
    }

    //Method 1 is overriding
    public void method1(){
        System.out.println("B class method 1");
    }
    void M1(){
        //super.M1(2);
        System.out.println(a);
    }
}
class  Cc extends Bb{
    Cc(){
        System.out.println("Cc");
    }
}
public class Over {
    public static void main(String[] args) {
        Bb obj=new Bb();
        obj.M1();
        obj.method1();
        System.out.println();
        Aa obj1=new Aa();
        obj1.M1();
        System.out.println();
        Bb A=new Cc();
    }
}

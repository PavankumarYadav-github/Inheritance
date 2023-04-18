package com.Legion;


class First {
    private String  a;

    First(){
        System.out.println("first class constructor ");
    }
    First(int a){

        System.out.println("Value from First  :"+a);


    }
    public int add(int a,int b){
        return a+b;
    }
}
class Second  extends First{

    private int age;

   Second(){
       super(3);
       System.out.println(" Second class constructor ");
   }
    Second(int a,int b){
       super(a);
       System.out.println("Value from Second   :"+b);
   }


}
class Third extends Second{
    private int a;

    Third(){

        System.out.println("Third constructor");
    }
    Third(int a,int b,int z){
        super(a,b);
        System.out.println("Value from Third :"+z);
    }
}


public class Main2 {
    public static void main(String[] args) {
       // Base a=new Base(3);
        //System.out.println();
       /* a.setA();
        System.out.println("from Base class:"+a.getA());*/
        //age b=new age(5);
        //low n=new low(10,15,20);
        //Base a=new Base();

        Second r=new Second(20,10);
        System.out.println();
        //Third b=new Third();
        Third a=new Third();


    }
}

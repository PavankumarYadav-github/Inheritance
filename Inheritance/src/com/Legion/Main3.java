package com.Legion;

//this keyword can be used to refer current class instance variable
/*class one{
    int a;//instance variable
    one(int a){
        //int a is local variable
        this.a=a;//this.a is reference to instance variable
        System.out.println("one class");
    }
    public int  getA(){
        return a;
    }

    public static void main(String[] args) {
        one a=new one(25);
        System.out.println(a.getA());
    }
}
class two extends one {
    int b;
    two(int a){
        super(a);
        System.out.println("I am constructor  ");
    }
}

public class Main3 {
    public static void main(String[] args) {
        one A=new one(5);
        System.out.println(A.getA());
        System.out.println();
        two b=new two(10);
    }
}*/

//this keyword can be used to invoke current class method (Implicity)
/*class demo{
    public void display(){  //creating display method
        System.out.println("Display method");
    }
    public void show(){
        this.display();//invoke display method by using this keyword
        System.out.println("Show method");
        display();//invoking display method by using without this keyword(Implicity) compiler will understand

    }
}

public class Main3 {
    public static void main(String[] args) {
        demo D=new demo();
        D.show();
    }
}*/


//this() keyword can be used to invoke current class constructor
/*
class demo{
    demo(){
        this(10);
        System.out.println("default constructor ");
        System.out.println(this);
    }

    demo(int a){

        System.out.println("parameter constructor with value :"+a);
    }
}

public class Main3 {
    public static void main(String[] args) {
        demo D=new demo();
        System.out.println(D);
    }
}*/
//this keyword can be used to pass as an arguments in the method call

/*class Demo {

    public void method1(Demo1 D) {
        System.out.println(D.a+D.b);
    }
}
class Demo1{
    int a=20;
    int b=10;

    public void method2(){
        Demo a=new Demo();
        a.method1(this);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Demo1 R=new Demo1();
        R.method2();
    }
}*/


//this can be used to pass as an argument in the constructor call

class one{
    String Name;
    int Id;

    one(){
        System.out.println("Default of one");
        Two1 B=new Two1(this);
    }

}
class Two1{
    Two1(one A){
        A.Name="Ramesh";
        A.Id=2;
        System.out.println(A.Name+" "+A.Id);
        System.out.println("Two Constructor");
    }
}
public class Main3 {
    public static void main(String[] args) {
        one O=new one();
    }
}

//this keyword can be used to return the current class instance from the method


/*class one{
    one M1(){
        return this;
    }
    public void M2(){
        System.out.println(this);
    }
}
public class Main3 {
    public static void main(String[] args) {
        one A=new one();
        A.M2();
        System.out.println(A.M1());
    }
}*/


package com.Legion;


import java.util.Scanner;

/*class Emp{
    int Id;
    String Name;
    int Salary;

    Emp(){
        System.out.println("Fix increment every year");
        Add A=new Add(this);

    }

    void set(){

        Scanner S=new Scanner(System.in);
        System.out.println("Enter Emp ID");
        Id=S.nextInt();
        System.out.println("Enter Emp Name ");
        S.nextLine();
        Name=S.nextLine();
        System.out.println("Enter Salary");
        Salary=S.nextInt();
    }
    void Display(){
        System.out.println("ID:-"+Id+" "+"Name:-"+Name+" "+"Salary:-"+Salary);
    }
    public void ShowIncrease(){
        Add a=new Add();
        a.setAmount1();
        a.M1(this);
    }


}

class Add{

     int Amount1;

     Add(){

     }
     Add(Emp R){
         System.out.println("SALARY:->"+(R.Salary+Amount1));
     }

    void setAmount1(){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter increment Amount");
        a.nextLine();
        this.Amount1=a.nextInt();
    }

    void M1(Emp E){
        System.out.println(Amount1);
        System.out.println("Salary + increment:-"+(E.Salary+Amount1));
    }
}

public class New {
    public static void main(String[] args) {
        Emp E=new Emp();
        E.set();
        E.ShowIncrease();
        E.Display();
    }
}*/


class A{

    int a;
    int b;
    A(){
        B A=new B(this);
        System.out.println(a+" "+b);
        System.out.println(a+b);
    }
    public void M1(){
        B C=new B(this);
        System.out.println("B"+a*b);
        C.M2(this);
        System.out.println("Multiplication "+a*b);
    }
}
class B{

    B(A obj){
        obj.a=20;
        obj.b=10;
    }
    public void M2(A obj){
        obj.a=10;
        obj.b=30;
    }
}
public class New {
    public static void main(String[] args) {
        A C=new A();
        C.M1();
    }


}

/*class A1{
    b a;
    A1(){

    }
    A1(b C){
        this.a=C;
    }
    void M1(){
        System.out.println("Value :"+(a.a+a.b));
    }
    void M3(){
        System.out.println("Heloo");
    }
    void M2(){
        b Q=new b();
        Q.method1(this);
    }

}
class b{
    int a=5;
    int b=10;
    b(){
        A1 B=new A1(this);
        B.M1();
    }
    void method1(A1 D){
        D.M3();
    }

}
public class New {
    public static void main(String[] args) {
        b A=new b();
        A1 Q=new A1();
        Q.M3();

    }
}*/

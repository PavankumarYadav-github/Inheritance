package com.Legion;

import java.util.Scanner;

class Circle{
    public int radius;

    Circle(){
        System.out.println("DEFAULT CONSTRUCTOR");
    }


    Circle(int radius){
        System.out.println("Circle class Cons");
        this.radius=radius;
    }

    public double radius(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

    Cylinder(int radius ,int height){
        super(radius);
        System.out.println("Cylinder class cons");
        this.height=height;
    }
    public double volume(){
        System.out.println("Radius:- "+radius);
        System.out.println("Height:- "+height);
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle1{

    public  int length,breath;

    Rectangle1(){
        System.out.println("Default const of rect1");
    }

    void setLength(){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Length of rectangle");
        length=a.nextInt();
    }
    int getLength(){
        return length;
    }
    void setBreath(){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter breath of rectangle");
        breath=a.nextInt();
    }
    float  Area(){

       return  length*breath;
    }
    float  Area1(){

       return  length*breath;
    }
}
class Cuboid extends Rectangle1 {
    private int height;

    Cuboid(){
        System.out.println("Default Const of Cuboid");
        this.height=25;
    }

    void setHeight(){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter Height of cuboid ");
        height=S.nextInt();
    }
    int getSide(){
        return height;
    }
//    int Area(){
//        System.out.println("Area of Square");
//        return height*height;
//    }
    float Volume(){

        return Area()*height;
    }
    @Override
    float  Area1(){
        System.out.println("From cuboid ");
        return  length*breath*height;
    }

}

public class Exercise_inheritance {
    public static void main(String[] args) {

        /*Circle C=new Circle(25);
        System.out.println(C.radius());
        System.out.println(C.radius);

        System.out.println();

        Cylinder C1=new Cylinder(20,5);
        System.out.println(C1.radius+" And "+C1.height);
        System.out.println(C1.volume());
        System.out.println(C1.radius());


        System.out.println("New");
        System.out.println();

        Rectangle1 R=new Rectangle1();
        R.setLength();
        R.setBreath();
        System.out.println("Area of rectangle:"+R.Area());

        System.out.println();

        Cuboid S= new Cuboid();
        S.setHeight();
        S.setLength();
        S.setBreath();
        System.out.println("Height of cuboid "+S.getSide());
        System.out.println("Area of rectangle:"+S.Area());
        System.out.println("volume of Cuboid:-"+S.Volume());*/

        Rectangle1 R1=new Cuboid();
        R1.setLength();





        R1.setBreath();
        System.out.println(R1.Area1());
        


        Cuboid a1=new Cuboid();
        System.out.println(a1.getSide());

    }
}

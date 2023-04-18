package com.Legion;

import java.util.Scanner;

class rectangle{
    int length;
    int breath;

    public void setLength(){
        System.out.println("enter length");
        length=new Scanner(System.in).nextInt();
    }
    public void setBreath(){
        System.out.println("enter breath");
        breath=new Scanner(System.in).nextInt();
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
    public void display(){
        System.out.println("Length "+length);
        System.out.println("Breath "+breath);
    }
}

class Square extends rectangle { //this class will contain property of rectangle class
                                //because we have use extends keyword to inheritance
    int side;

    public void setSide() {
        side = new Scanner(System.in).nextInt();
    }
    public int area(){
        return side*side;
    }
}

public class Main {

    public static void main(String[] args) {
	rectangle R=new rectangle();
    R.setLength();
    R.setBreath();
    R.display();

    Square S=new Square();

    S.setSide();
    System.out.println("Area "+S.area());
    S.setLength();
    S.setBreath();
    S.display();
    }
}

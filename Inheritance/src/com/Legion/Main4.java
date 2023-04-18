package com.Legion;

/*
    class calculate{
    void sum(Data D){
        System.out.println("Sum :"+(D.getA()+ D.getB()));
    }
}
class Data{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    void show(){
        //Data A=new Data();
        //new calculate().sum(A);
        //this keyword will refer to current class and pass to calculate claas method sum
        new calculate().sum(this);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Data A=new Data();
        A.setA(10);
        A.setB(20);
        A.show();
    }
}
*/



/*class increment1{
    int year=2000;
    int amount=3000;
   public void increment (employee obj){
        System.out.println("Salary+Increment :"+(obj.Salary+amount)+"\n"+" In year :"+ year);
    }
}

class employee{
    String name;
    int id;
    int  Salary;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
    public void Display(){
        new increment1().increment(this);
    }

}
public class Main4 {
    public static void main(String[] args) {
        employee E=new employee();
        E.setName("Ramesh");
        E.setId(25);
        E.setSalary(20000);
        E.Display();

    }
}*/
class one1{
    two a;//reference variable of two
    one1(two A){
        this.a=A;//all property will transfer to a
    }
    void display(){//display
        System.out.println("a:-"+a.a+" "+"Day:-"+a.day);
    }

}
class two{
    int a=27;
    String day="Monday";
    two(){
            one1 O=new one1(this);
            O.display();
    }
}
public class Main4 {
    public static void main(String[] args) {
        two A=new two();
    }
}
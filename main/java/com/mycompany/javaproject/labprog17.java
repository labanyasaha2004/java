package com.mycompany.javaproject;

public class labprog17 {
    public static void main(String[] args)
    {
        ObjectReturnDemo ob1=new ObjectReturnDemo(2);
        ObjectReturnDemo ob2;
        ob2=ob1.incrbyTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);

    }

}
class ObjectReturnDemo
{
    int a;
    ObjectReturnDemo(int i)
    {
        a=i;
    }
    ObjectReturnDemo incrbyTen()
    {
        ObjectReturnDemo temp=new ObjectReturnDemo(a+10);
        return temp;
    }
}



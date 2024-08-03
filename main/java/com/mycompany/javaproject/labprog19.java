package com.mycompany.javaproject;

class person
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void SetName(String newName)
    {
        this.name= newName;
    }
}
class labprog19
{

    public static void main(String[] args)
    {
        person ob=new person();
        ob.SetName("Labanya");
        System.out.println(ob.getName());
    }
}



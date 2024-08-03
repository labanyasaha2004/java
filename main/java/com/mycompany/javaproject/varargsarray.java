package com.mycompany.javaproject;

class varargs {
    static void method(int v[])
    {
        System.out.println("No of args : " + v.length);
        for(int i :v)
            System.out.println(i);
    }
  public static void main(String[] args) {
      int x []=  {1,2,3,4};
      int y []= {5,6};
      method(x);
      method(y);

  }
}

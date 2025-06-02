package com.example.LearningJava.JavaGenerics;

public class Generics<T> {
  T a=(T) new Object();
  T[] arr= (T[])new Object[3];
  //int[] x=(int[])new Object[4]; //Object array cant be Typecasted to primitive datatype array
  int xyz=(int)new Object();
  int [] y=new int[10];

  public static void main(String[] args) {
    Object obj="siva";
    obj=10;
    int x=10;
    //String str1=(String) x; // can't TypeCast
    //String str2=(String) obj; // can't TypeCast

//    System.out.println(str1);



    Generics<String> gen = new Generics<>();
    gen.arr= new String[3];
    String abc=gen.arr[0];
  }

}

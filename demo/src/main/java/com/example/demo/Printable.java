package com.example.demo;

public interface Printable {
    String print();
    default String printSomeThing(){
      return "this is what the class does";
    }

}

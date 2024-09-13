package com.example.demo;

public class Animal {
    private   int age=12;
    private String name="animal name";

   public void makeSounds (){
   }




    public void printSound( Animal animal){
        animal.makeSounds();
    }

   static class  Dog extends Animal{

      @Override
      public void makeSounds() {
          System.out.println("Bark bark...");
      }


}
     static   class Cat extends Animal{
          @Override
          public void makeSounds(){
              System.out.println("meow moew");
          }
      }


}




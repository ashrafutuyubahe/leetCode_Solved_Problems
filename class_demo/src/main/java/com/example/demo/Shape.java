package com.example.demo;

      abstract public class Shape {
          public abstract int calculateAre();

      }
  class Rectangle  extends Shape {


          private final int width;
          private final int height;

          public Rectangle(int width,int height){
              this.width=width;
              this.height= height;
          }

      @Override
      public int calculateAre() {

          return this.height * this.width;



      }

  }

  class  CircleArea extends  Shape{
          private final int radius;
          final double PI= 3.14;


          public CircleArea(int radius){
              this.radius=radius;
          }
      @Override
      public int calculateAre(){

          return (int)PI * (radius*radius);
      }

      }




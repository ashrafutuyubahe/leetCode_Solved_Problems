package com.example.demo;


class Document implements Printable{

 @Override
    public  String print(){
        try{
            return "this is the act of printing the document";

        }catch (Exception e){
            return "Handling exception";
        }finally {
            System.out.println("finally the abstraction is working ");
        }


    }




}

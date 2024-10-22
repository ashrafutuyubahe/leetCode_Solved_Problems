import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class practice_program{

public static void main(String[] args ){

    askUserInput();

}


public static void askUserInput(){
    var studArray= new ArrayList<String>();

    while(true){
    System.out.println("___________________________welcome to student management system_______________________________________________");
    System.out.println(" ");

    System.out.println("what's your action");

    System.out.println("1.Add student");
    System.out.println("2.view all students");
    System.out.println("3.view students performance");
    System.out.println("4.Exit");

    
    var userInput= new Scanner(System.in);
    var userChoice= userInput.nextInt();
     userInput.nextLine(); //to clear buffer remaining

    if(userChoice==1){
        System.out.println("what is the student name");
        var studName= userInput.nextLine();
        studArray.add(studName);

        System.out.println("what is the overall marks for ");
    
    } else if (userChoice==4)
     {
       break;  
    }

    
    }
}



}
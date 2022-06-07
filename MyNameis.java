package mynameis;

  import java.util.Scanner;
  
    public class MyNameis{
      public static void main (String[]args){
      String first,last;
      Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first and last name.");
        System.out.println("Don't forget to press the enter key.");
        
        first= sc.next();
        last=sc.next();
        
        System.out.println("My name is :"+ first +" "+last);
      }
    }
  

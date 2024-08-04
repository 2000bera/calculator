/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author cash
 */
public class Calculator 
{

    private static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) 
    {
        boolean stop = true;
        int choice;

        while (stop) 
        {

        System.out.println("Application for calculating two numbers");
        System.out.println("Choice below option");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multplication");
        System.out.println("4: Division");
        System.out.println("5: Stop The Application");

        System.out.println("Enter your choice");
        choice = input.nextInt();

        switch (choice) {
          case 1:
                  Add();
            break;
            case 2:
                  Substract();
            break;
            case 3:
                  Multiply();
            break;
            case 4:
                  Division();
            break;
            case 5:
                  stop = false;
                  System.out.println("Thanks for stopping the application");
            break;
          default:
                  System.out.println("Invalid choice, please try again");
            break;
        }
      }

      input.close();

    }

    private static void Add()
    {
      double x;
      double y;
      double sum;
      
      System.out.println("Enter a number: ");
      x = input.nextInt();
      
      System.out.println("Enter a number: ");
      y = input.nextInt();
      
      System.out.println("Your numbers: \n" + "x: " + x + " and y: " + y);
      
      sum = x + y;
      System.out.println("Sum: " + sum);
    }
    private static void Substract()
    {
      double x;
      double y;
      double sum;
      
      System.out.println("Enter a number: ");
      x = input.nextInt();
      
      System.out.println("Enter a number: ");
      y = input.nextInt();
      
      System.out.println("Your numbers: \n" + "x: " + x + " and y: " + y);
      
      sum = x - y;
      System.out.println("Sum: " + sum);
    }
    private static void Multiply()
    {
      double x;
      double y;
      double sum;
      
      System.out.println("Enter a number: ");
      x = input.nextInt();
      
      System.out.println("Enter a number: ");
      y = input.nextInt();
      
      System.out.println("Your numbers: \n" + "x: " + x + " and y: " + y);
      
      sum = x * y;
      System.out.println("Sum: " + sum);
    }
    private static void Division()
    {
      double x;
      double y;
      double sum;
      
      System.out.println("Enter a number: ");
      x = input.nextInt();
      
      System.out.println("Enter a number: ");
      y = input.nextInt();
      
      if(y == 0) {
          System.out.println("Maths error");
      }
      else {
          System.out.println("Your numbers: \n" + "x: " + x + " and y: " + y);
      
        sum = x / y;
        System.out.println("Sum: " + sum);
      }
     
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fizzbuzz;

/**
 *
 * @author Acer-User
 */
public class FizzBuzz {
      
    public static void main(String[] args) {
        for(int num = 1; num <= 100; num++)
        {
        if (num % 3 == 0 && num % 5 == 0)
        {
        System.out.println("Buzz Fizz"); 
        }
        else if(num % 3 == 0 )
        {
                System.out.println("Fizz");
        }
        else if(num % 5 == 0 )
        {
            System.out.println("Buzz");
        }
      
        }
    }
}

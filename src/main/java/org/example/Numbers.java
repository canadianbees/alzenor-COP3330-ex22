/*
 *  UCF COP3330 Fall 2021 Numbers Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Numbers
{
    private final int firstNum;
    private final int secNum;
    private final int thirdNum;

    //asks user to enter 3 numbers
    public Numbers()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        this.firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        this.secNum = input.nextInt();

        System.out.print("Enter the third number: ");
        this.thirdNum = input.nextInt();
    }

    //compares the numbers to find the largest one
    public void comparison()
    {
        //if all 3 are or same or if 2 are the same, exit the program
        if(this.firstNum == this.secNum && this.secNum == this.thirdNum || this.firstNum == this.secNum || this.firstNum == this.thirdNum || this.secNum == this.thirdNum)
        {
            System.out.print("Numbers entered are not unique\nExiting program....");
            return;
        }

        // if the first number entered is the largest
        if(this.firstNum > this.secNum && this.firstNum > this.thirdNum)
        {
            System.out.print("The largest number is "+this.firstNum);
        }

        // if the second number entered is the largest
        if(this.secNum > this.firstNum && this.secNum > this.thirdNum)
        {
            System.out.print("The largest number is "+this.secNum);
        }

        // if the third number entered is the largest
        if(this.thirdNum > this.firstNum && this.thirdNum > this.secNum)
        {
            System.out.print("The largest number is "+this.thirdNum);
        }
    }
}

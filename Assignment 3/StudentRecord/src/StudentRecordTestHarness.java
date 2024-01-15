/**
 * Assignment 4 Challenge 2
 * André Martins
 * 05/06/2023
 * 17:00
*/

import java.util.Scanner;

public class StudentRecordTestHarness
{    public static void main(String[] args)
    {
        StudentRecord student1 = new StudentRecord("Andre", "Martins", "200550940", 100);
        
        System.out.println("Student Information:");
        System.out.println("First Name: " + student1.getfirstname());
        System.out.println("Last Name: " + student1.getlastname());
        System.out.println("Student ID: " + student1.getstudentid());
        System.out.println("Grade for Course One: " + student1.getgrade());
        System.out.println("Letter Grade: " + student1.getlettergrade());
        System.out.println();
    
        StudentRecord student2 = new StudentRecord();
        Scanner user = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        student2.setfirstname(user.nextLine());

        System.out.print("Enter Last Name: ");
        student2.setlastname(user.nextLine());

        System.out.print("Enter Student ID: ");
        student2.setstudentid(user.nextLine());

        System.out.print("Enter Grade for Course One: ");
        student2.setgrade(user.nextInt());

        user.close();

        System.out.println("Second Student Record:");
        System.out.println("First Name: " + student2.getfirstname());
        System.out.println("Last Name: " + student2.getlastname());
        System.out.println("Student ID: " + student2.getstudentid());
        System.out.println("Grade for Course One: " + student2.getgrade());
        System.out.println("Letter Grade: " + student2.getlettergrade());
        System.out.println("Vowel Count in First Name: " + student2.getvowelcount());
    }
}
/**
 * Printer for the Challenge 2
 * André Martins
 * 18/05/2023
 * 11:36
*/
public class JavaCodeTester2
{
    public static void main(String[] args)
    {
        System.out.println();
        String place1 = "Great ";
        String place2 = "Monke ";
        String place3 = "Island!";
        String place = place1+place2+place3;
        char char3 = place.charAt(2);
        char char5 = place.charAt(4);
        char char7 = place.charAt(6);
        System.out.println("Characters at Position 3, 5 and 7: " + char3 + " " + char5 + " " + char7);
        System.out.println();
        boolean booleantest = place.startsWith("test");
        System.out.println("Does the string stars with 'test'? " + booleantest);
        System.out.println();
        String PLACE = place.toUpperCase();
        System.out.println("Uppercase test: " + PLACE);
        int number = 8;
        System.out.println();
        System.out.println("The '++' sign before incrementation: " + ++number);
        System.out.println();
        System.out.println("The '++' sign after incrementation: " + number++);
        System.out.println();//I notice that the prints does not change
        
        //Challenge 3

        int number0 = 42;
        if (number0 % 2 == 0)
        {System.out.println("Even");}
        else
        {System.out.println("Odd");}
        System.out.println();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstswitchzodiac;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class FirstSwitchZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        -- switch -- reserved keyword and starts the switch logic
        -- case -- iterates through different options
        -- break -- only allows 1 option to be chosen
        -- default -- handles invalid entries
        */
        
        Scanner kb = new Scanner (System.in); //scanner object
        //variable
        int year;
        
        System.out.println("Hi ! Welcome to my Chinese Zodaic Year Calculator");
        System.out.println("\n ----------------------------------------------------------------------------------------------------------------- \n");
        System.out.println("Enter the year >>>>");
        year = kb.nextInt();
        
        //calculation and testing
        switch(year % 12)
        {
            case 0: System.out.println("Year of the Monkey");
            break;
            case 1: System.out.println("Year of the Rooster");
            break;
            case 2: System.out.println("Year of the Dog");
            break;
            case 3: System.out.println("Year of the Pig");
            break;
            case 4: System.out.println("Year of the Rat");
            break;
            case 5: System.out.println("Year of the Ox");
            break;
            case 6: System.out.println("Year of the Tiger");
            break;
            case 7: System.out.println("Year of the Rabbit");
            break;
            case 8: System.out.println("Year of the Dragon");
            break;
            case 9: System.out.println("Year of the Snake");
            break;
            case 10: System.out.println("Year of the Horse");
            break;
            case 11: System.out.println("Year of the Sheep");
            break;
            default:System.out.println("Invalid year entered"); break;
        }
        
    }
    
}

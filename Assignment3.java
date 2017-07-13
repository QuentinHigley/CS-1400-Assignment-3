/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author theCh
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initilize Variables & RNG
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean boolCon = true;
        System.out.println("Quentin Higley");
        //this is to repeat the game
        while (boolCon){
            //initilize variables that need to be reset with the game
            boolean boolWin = false;
            int intNum = rand.nextInt(10) + 1;
            int intTries = 0;
            int intUserGuess;
        //check
        while (boolWin == false){
            System.out.println("Guess a number between 1 and 10.");
            intUserGuess = sc.nextInt();
            intTries++;
        
        if (intUserGuess == intNum){
            boolWin = true;
        }
        
        else if (intUserGuess < intNum){
            System.out.println("Your guess is too low.");
        }
        
        else if (intUserGuess > intNum){
            System.out.println("Your guess is too high");
        }
        
        else{
            System.out.println("Enter a valid number between 1 and 10.");
            } 
        }
        //repeat
        System.out.println("you win! the number is " + intNum + ". It took " + intTries + " tries.");
        System.out.println("To continue press '1' else press '0'");
        intUserGuess = sc.nextInt();
        if (intUserGuess == 1){}
    
        else
        System.exit(0);
    
    }
    
    
    
    
    } 
}

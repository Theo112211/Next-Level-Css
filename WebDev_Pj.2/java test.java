/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcuklator;

import java.util.Scanner;

/**
 *
 * @author Theo
 */
public class Calcuklator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int again;
    do{    
        System.out.println("\tSimple Calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 0 to Quit");
        
        int choice;
        Scanner calc=new Scanner(System.in);
        choice=calc.nextInt();
        
        if(choice==1){
        System.out.println("Enter the first number");
        double fnumb,snumb,result;
        
        fnumb=calc.nextDouble();
        
        System.out.println("Enter the Second number");
        snumb=calc.nextDouble();
        
        result=fnumb+snumb;
        System.out.println("The answer is");
        System.out.println(result);
        }
        if(choice==2){
        System.out.println("Enter the first number");
        double fnumb,snumb,result;
        
        fnumb=calc.nextDouble();
        
        System.out.println("Enter the Second number");
        snumb=calc.nextDouble();
        
        result=fnumb-snumb;
        System.out.println("The answer is");
        System.out.println(result);
        }
        if(choice==3){
            System.out.println("Enter the first number");
        double fnumb,snumb,result;
        
        fnumb=calc.nextDouble();
        
        System.out.println("Enter the Second number");
        snumb=calc.nextDouble();
        
        result=fnumb*snumb;
        System.out.println("The answer is");
        System.out.println(result);
        }
        if(choice==4){
        System.out.println("Enter the first number");
        double fnumb,snumb,result;
        
        fnumb=calc.nextDouble();
        
        System.out.println("Enter the Second number");
        snumb=calc.nextDouble();
        
        result=fnumb/snumb;
        System.out.println("The answer is");
        System.out.println(result);
        }
        if(choice==0){
            System.out.println("Good Bye Then");
        }
        if(choice<0){
            System.out.println("Please choose from the available options");
        }
        if(choice>4){
            System.out.println("Please choose from the available options");
        }
        
            System.out.println("Would you like do another calculation?\n");
            System.out.println("Press 1 for YES\n Press any other key for NO.");
            again=calc.nextInt();
        }while(again==1);
    
    }
    
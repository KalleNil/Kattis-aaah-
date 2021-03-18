
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //Join Marius aaah
        String marius = scan.nextLine();
        
        //check length of String
       int mariusLength = marius.length();
        
        //doctor request of x length aaah
        String doctor = scan.nextLine();
        
        //check length of String
        int doctorLength = doctor.length();
        
        //compare the length
        if (doctorLength>mariusLength){
            System.out.println("no");
        }else if (doctorLength<mariusLength){
            System.out.println("yes");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovserverexample;

import java.util.Scanner;

/**
 *
 * @author thnom
 */
public class OvserverExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Subject sub= new Subject();
        
        new HexObserver(sub);
        new BinObserver(sub);
        new OctObserver(sub);
        
        while(true){
            System.out.println("\n Enter a number :  ");
            sub.setState(sc.nextInt());
        }
    }
    
}

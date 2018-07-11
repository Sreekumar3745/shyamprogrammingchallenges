/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.challenge.pkg1;
import java.util.*;

/**
 *
 * @author Shyam
 */
public class ProgrammingChallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
        public static boolean checkPrime(int element) {
            
            if (element <= 1) return false;
                // Check if element is prime
                for (int i = 2; i <= element / 2; i++) {
                    if (element % i == 0) // If true, element isn't prime
                    {
                        return false; // checkFalse is false            
                    }
                }
                return true;
        }
        
    class Randomizer {
        //private int[] queue;
        //private int size;
        
        //Insert 10 Random Elements in queue
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        
        void insert() {

        for (int i=1; i<10; i++) {
                        // Create Random number between 1 & 9
        int rNum = (int)(Math.random() * 10) + 1; 
            queue.add(rNum);
    
    }
        }
    }
}
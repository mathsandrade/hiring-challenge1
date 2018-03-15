/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Main {

    public static ArrayList<Integer> solution(long A, long B) {
                
        String stringA = Long.toString(A);
        String stringB = Long.toString(B);
        int sizeA = stringA.length();
        int sizeB = stringB.length();
        int indexA = 0;
        ArrayList<Integer> occursIn = new ArrayList<>();
        //int occursIn = 0;
        
        for (int i = 0; i < sizeB; i++) {
            if (stringA.charAt(indexA) == stringB.charAt(i)) {
                indexA++;
            } else {
                indexA = 0;
            }
            
            if (indexA == sizeA) {
                int occur = i - indexA + 1;
                occursIn.add(occur);
                indexA = 0;
            }
            //if (indexA == sizeA) {
                //occursIn =  i - indexA + 1;
                //break;          
            //}
        }
        
        if (occursIn.isEmpty()) {
            return  null;
        }
            
        return occursIn;
    }
   
    public static void main(String[] args) {
        
        System.out.println("A(s) posição(ões) que ocorre(m) o(s) número(s) desejado(s) é/são: "+solution(12, 121312131213L));
        
    }

}

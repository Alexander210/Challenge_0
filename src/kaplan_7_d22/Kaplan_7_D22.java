/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaplan_7_d22;

/**
 * @author akaplan
 */
public class Kaplan_7_D22 {

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            if (divis11(i) && divis5(i)) {
                System.out.println("Animiate This!");
            } else if (divis5(i) & divis11(i)) {
                
            }
            if (divis11(i) && divis3(i)) {
                System.out.println("Herr Direktor");
            } else if (divis3(i) & divis11(i)) {
                
            if (divis11(i) && divis2(i)) {
                System.out.println("Ninja");
            } else if (divis2(i) & divis11(i)) {
                
            if (divis23(i)) {
                System.out.println("chisme");
            } else if (divis23(i)){
            
            if (divis35(i)) {
                System.out.println("Old School");
            } else if (divis35(i)){
            
            if (divis235(i)) {
                System.out.println("Team Building");
            } else if (divis235(i)){
                            }
                        }
                    }
                }
            }
        }
    }
    
    static boolean divis2(int somenumber) {
        return (somenumber % 2 == 0);
    }
    static boolean divis3(int somenumber) {
        return (somenumber % 3 == 0);
    }
    static boolean divis5(int somenumber) {
        return (somenumber % 5 == 0);
    }
    static boolean divis11(int somenumber) {
        return (somenumber % 11 == 0);
    }    
    static boolean divis23(int somenumber) {
        return (somenumber % 2 == 0 && somenumber % 3==0);
    }
    static boolean divis35(int somenumber) {
        return (somenumber % 3 == 0 && somenumber % 5==0);
    }
    static boolean divis235(int somenumber) {
        return (somenumber % 2 == 0 && somenumber % 3==0 && somenumber % 5==0);
    }
}
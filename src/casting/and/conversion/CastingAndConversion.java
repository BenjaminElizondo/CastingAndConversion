/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting.and.conversion;

/**
 *
 * @author 20111
 */
public class CastingAndConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anInt = 12;
        double aDoubleWithDecimal = -3.95;
        double aDoubleWithoutDecimal = 4;
        char aChar ='a';
        
        System.out.println("Printing the vars out regularly:");
        System.out.println(anInt);
        System.out.println(aDoubleWithDecimal);
        System.out.println(aDoubleWithoutDecimal);
        System.out.println(aChar);
        System.out.println();
        
        /* #5A The integer 4 turns into a complete decimal with .0 included to it. */
        /* #5B The conversion is automatic. */
        
        System.out.println("Printing the vars casted as ints:");
        System.out.println((int)anInt);
        System.out.println((int)aDoubleWithDecimal);
        System.out.println((int)aDoubleWithoutDecimal);
        System.out.println((int)aChar);
        System.out.println();
    }
    
}

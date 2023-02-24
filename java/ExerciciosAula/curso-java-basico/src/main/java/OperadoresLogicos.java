/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dssilva21
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        /* 
        AND 
        V and F  => F
        V and V  => V
        F and V  => F
        F and F  => F
       */
        
        /* 
        OR 
        V or F => V
        V or V => V
        F or V => V
        F or F => F   
        */
      
        /* 
        XOR
        V xor F => V
        V xor V => F
        F xor V => V
        F xor F => F
        */
        
        /*
        Negação Logica
        !V => F
        !F => V
        */ 
        
        boolean v = true;
        boolean f = false;
        
        // and &&
        
        System.out.println(v && f);
        
        // or ||
        
        System.out.println(v || f);
        
        // xor !=
        
        System.out.println(v != f);
        
        System.out.println(!v);
        System.out.println(!f);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author merce
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       Calculadora calcu = new Calculadora();
        
        
        int resultado1 = calcu.sum(3, 5);
        System.out.println("suma es : "+resultado1);
        
        int resultado2 = calcu.subtract(10, 5);
        System.out.println("resta es : "+resultado2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebagitcomparacion;

/**
 *
 * @author bjls2
 */
public class Pruebagitcomparacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static void swap(int []a, int i, int ii){
        
    }
    public static void Sort(int[]a, int n){
        for(int p=1;p<=n-1; p++)
        {
            for (int i = 0; i < n-p; i++) 
            {
                if (a[i]>a[i+1]) 
                {
                    swap(a,i,i+1);
                }
            }
        }
    }
    
}

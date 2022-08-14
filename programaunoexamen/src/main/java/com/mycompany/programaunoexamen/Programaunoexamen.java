/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programaunoexamen;

/**
 *
 * @author Georg
 */
import java.util.Scanner;
public class Programaunoexamen {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //aca declaramos nuestra variable
    int numeromaximo;
    //aca pide que ingrese un numero
    System.out.println("Calcular si es mayor a 100: ");
    numeromaximo = sc.nextInt();
    //se evalua si el numero que ingresamos es mayor o menor 
   if(numeromaximo >100 ){
       //nosda el mensaje que si es mayor nuestro numero ingresado.
     System.out.println("si es mayor a 100: ");    
   }else{
       //nosda el mensja que es menor el numero ingresado 
    System.out.println("No es mayor a 100: ");    
   } 
       
  }
}



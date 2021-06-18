/*DESAFIO REDBEE
SumTwoNumbers: que recibe dos números y devuelve la suma de ambos
 WETZEL MARIA AGUSTINA */
package Desafio_Suma;
import java.util.Scanner;
public class Desafio_Suma{

public static void main(String[]args) {

    Scanner entrada = new Scanner(System.in);
     int numero1, numero2,suma;

    System.out.println ("Introduce dos numeros:  ");
    numero1 = entrada.nextInt();
    numero2 = entrada.nextInt();

    suma = numero1+numero2;

    System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + suma);
 }
    }
        

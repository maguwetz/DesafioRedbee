/*
    Lista de numeros y suma total 
 */
package ListNum;
import java.util.Scanner; 

public class ListNum{

    public static void main(String[] args){
        int suma=0,i,num; 
    Scanner entrada = new Scanner (System.in);
    num = entrada.nextInt();
  
    System.out.printIn(" Digite 10 numeros ");
    for( i=1; i<=10; i++){
    num=entrada.nextInt();
        suma=suma+num;
        System.out.printIn ("La suma es" +suma);

}


}
}

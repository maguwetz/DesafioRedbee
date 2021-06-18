/*
 Comparación de numeros: que recibe tres números y devuelve el máximo de ellos
 WETZEL MARIA AGUSTINA*/
package MayorNumero;
import javax.swing.JOptionPane; 
    public class MayorNumero {
    
       public static void main(String[] args) {
        int n1,n2,n3;
                        
          n1 = Intenger.parseInt(JOptionPane.showInputDialog("Digite un numero:    ")); 
          n2 = Intenger.parseInt(JOptionPane.showInputDialog("Digite un numero:    "));
          n3 = Intenger.parseInt(JOptionPane.showInputDialog("Digite un numero:    ")); 
           
         if((n1<n2 && n2>n3)) { 
           JOptionPane.showMessageDialog(null, n2 "Es el mayor de los tres numeros ingresados");
        }
       else if((n1>n2 && n1>n3)){
         JOptionPane.showMessageDialog(null, n1 'Es el mayor de los tres numeros ingresados');
        
            }
       else if ((n3>n1 && n1>n2)){
           JOptionPane.showMessageDialog(null, n3'Es el mayor de los tres numeros ingresados');
            }
       else{
          JOptionPane.showMessageDialog(null, "Ningun numero es mayor que otro"); 
            }

       } }

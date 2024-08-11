/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicar;
import java.util.Scanner;

public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite la tabla que desea conocer");
          int Multipli=scanner.nextInt();
        for(int b=1;b<=10; b++){
        int c=b*Multipli;
        System.out.println(b+"x"+Multipli+"="+c);
        }
        
    }
    
}

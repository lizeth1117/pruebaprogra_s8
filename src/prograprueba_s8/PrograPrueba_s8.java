/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prograprueba_s8;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class PrograPrueba_s8 {

     
    public static void main(String[] args) {
        // TODO code application logic here
        int seleccion,total=0,masplatos,edad ;
        Scanner entrada=new Scanner(System.in);
        int contadores[]=new int [6];
        
        menu items[]=new menu[6];
        
        
         System.out.println("Ingrese el costo de este dia para cada plato del menu");
        System.out.println("Costos del plato economico: ");
        items[0]=new menu("Economico",entrada.nextInt());
       System.out.println("Costos del plato regular: ");
       items[1]=new menu("Regular",entrada.nextInt());
       
        System.out.println("Costos del plato premium: ");
        items[2]=new menu("premium",entrada.nextInt());
        System.out.println("Costos del adicional queso: ");
        items[3]=new menu("queso",entrada.nextInt());
        System.out.println("Costos del adicional pan: ");
        items[4]=new menu("pan",entrada.nextInt());
        System.out.println("Costos del adicional de tortillas: ");
        items[5]=new menu("tortillas",entrada.nextInt());
        
        
        do{
            System.out.println("Ingrese la edad del cliente");
            edad=entrada.nextInt();
            
        System.out.println("Seleccione una opcion:\n1.Economico\n2.Regular\n3.Premium");
        seleccion =entrada.nextInt();
        total=(total+items[seleccion].getPrecio());
        
        System.out.println("desea aregar extras:\n 4.queso\n5.pan\n6.pan");

        seleccion=(entrada.nextInt()-1);
       
         contadores[seleccion]++;
        total=(total+items[seleccion].getPrecio());
        
        System.out.println("Desea agregar otro plato a su cuenta?\n1.Si\n2.No"); 
         masplatos=entrada.nextInt();
        }
        while(masplatos==1);
        descuento d=new descuento() ;       
        total=(total*d.descuento(edad,total));
    
        
        System.out.println("el total de su pedido es "+total);
              
        
        
        
        
        
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba_s8;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class menu {
    int precio, economico, regular, premium, queso, pan, tortillas;
    String item;
        Scanner entrada=new Scanner(System.in);


    public menu(String item, int precio) {
        this.item=item;
        this.precio=precio;
        
    }

    public int getPrecio() {
        return precio;
    }

    public String getItem() {
        return item;
    }
    
       
   
    public void ingresarpedido(int edad,boolean frecuente){
        int seleccion, unidades, total;
        
        System.out.println("Seleccione una opcion:\n1.Economico\n2.Regular\n3.Premium");
        seleccion =entrada.nextInt()-1;
        
        
        System.out.println("desea aregar extras:\n 4.queso\n5.pan\n6.pan");
        seleccion=entrada.nextInt()-1;
        
   
        
        
        
    }
 
    
            
}

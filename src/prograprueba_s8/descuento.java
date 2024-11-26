/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograprueba_s8;

/**
 *
 * @author lizet
 */
public class descuento {
    
    public int descuento(int edad,int cuenta){
     int  descuento, total;
        if(edad>=60)  // mayor de tercera edad tiene 25%
            descuento=(int)0.75 ;
        else         
            descuento=1 ;
        total=(int)(cuenta*descuento) ;
        return total ;    
     }
}

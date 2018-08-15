/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7video11;

/**
 *
 * @author DELL
 */
public class concatenar {
    
    public void funcion(){
        
        
        String nombre = "CARLOS";
        
        System.out.println("PROGRAMA CONCATENADOR DE CARACTERES");
        
        System.out.println();
        
        System.out.println("MI NOMBRE ES: "+nombre);
        
        System.out.println("MI NOMBRE TIENE: "+nombre.length()+" Letras");
        
        System.out.println("LA PRIMERA LETRA DE "+nombre+" ES " + nombre.charAt(0));
        
        int ultima;
        
        ultima = nombre.length();
        
        System.out.println("Y LA ULTIMA LETRAS ES LA "+nombre.charAt(ultima-1));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        suma(datos, 0);
    }

    public static void suma(double[][] datos, int x) {
        double suma = 0;
        for (int columna = 0; columna < datos[columna].length; columna++) {
            suma = suma + datos[x][columna];
        }
        System.out.println("La suma total es: " + suma);
        x = x + 1;
        if (x < datos.length) {
            suma(datos, x);
        }
    }
}
    
    


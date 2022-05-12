/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

public class Calculadora implements iCalculadora {

    /**
     * método suma(): operación suma
     * @param x,y
     * @return: devuelve resultado de x + y
     */
    public int suma(int x, int y) {
        return x + y;
    }

    /**
     * método resta(): operación resta
     * @param x,y
     * @return: devuelve resultado de x - y
     */
    public int resta(int x, int y) {
        return x - y;
    }

    /**
     * método multiplicacion(): operación multiplicación
     * @param x,y
     * @return: devuelve resultado de x * y
     */
    public int multiplicacion(int x, int y) {
        return x * y;
    }

    /**
     * método division(): operación división 
     * @param x,y
     * @return: devuelve resultado de x / y
     */
    public double division(double x, double y) {
        return x / y;
    }

}

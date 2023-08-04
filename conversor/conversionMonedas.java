/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class conversionMonedas {
    private double COP;
    private double moneda;
    //De COP a Dolar
    public double copToDollar(double COP){
        double operacion = COP * 0.00025;
        return Math.floor(operacion * 1000.0)/1000.0;
    }
    
    //De COP a Euro
    public double copToEuro(double COP){
        double operacion = COP * 0.00023;
        //Se utiliza una operacion para poder retornar un numero con 3 digitos
        return Math.floor(operacion * 1000.0)/1000.0;
        //La opcion de abajo retorna un String con format
        //return redondeo.format(operacion);
    }
    
    // De COP a YEN
    public double copToYen(double COP) {
        double operacion = COP * 0.036;
        return Math.floor(operacion * 1000.0)/1000.0;
    }
    
    //De COP a Won
    public double copToWon(double COP) {
        double operacion = COP * 0.32;
        return Math.floor(operacion * 1000.0)/1000.0;
    }
    
    //De Dolar a COP
    public double dollarToCOP(double moneda) {
        double operacion = moneda * 4000;
        return operacion;
    }
    
    //De Euro a COP
    public double euroToCOP(double moneda) {
        double operacion = moneda * 4400;
        return operacion;
    }
    
    //Yen a COP
    public double yenToCOP(double moneda) {
        double operacion = moneda * 28.22;
        return operacion;
    }
    
    //Won a COP
    public double wonToCOP(double moneda) {
        double operacion = moneda * 3.12;
        return Math.floor(operacion * 1000.0)/1000.0;
    }
}

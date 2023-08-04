/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor;

/**
 *
 * @author David
 */
public class conversionTemperatura {
    
    double temperatura;
    
    //Centigrados a Kelvin
    public double celsiusToKelvin(double temperatura) {
        return temperatura + 273.15;
    }
    //Centigrados a Farenheit
    public double celsiusToFarenheit(double temperatura) {
        return ((temperatura * 9)/5) + 32.0;
    }
    //Kelvin a Centigrados
    public double kelvinToCelsius(double temperatura) {
        return temperatura - 273.15;
    }
    //Kelvin a Farenheit
    public double kelvinToFarenheit(double temperatura) {
        return (((temperatura-273.15)*9)/5)+32;
    }
    //Farenheit a Centigrados
    public double farenheitToCelsius(double temperatura) {
        return Math.floor((((temperatura - 32)*5)/9)*100.0)/100.0;
    }
    //Farenheit a Kelvin
    //(0K − 273.15) × 9/5 + 32 = -459.7°F
    public double farenheitToKelvin(double temperatura) {
        return Math.floor((((temperatura - 32) * 5)/9)+273.15)*100.0/100.0;
    }
    
    
    
    
    
    
}

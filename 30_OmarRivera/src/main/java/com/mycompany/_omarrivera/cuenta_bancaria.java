/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._omarrivera;

import javax.swing.JOptionPane;

/**
 *
 * @author FELIX
 */
public class cuenta_bancaria {
    String pagoCuenta;
    int pagoRealizarBanco;
    public void CuentaBancaria(){
        String auto = JOptionPane.showInputDialog("ingrese el nombre del auto de quien es cargo");
        System.out.println("el pago de " + pagoCuenta +  " con la suma de " + pagoRealizarBanco + "a cargo de " + auto);
    }
}

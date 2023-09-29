/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._omarrivera;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FELIX
 */
public class Main_S05_30Omar_Rivera {
    public static void main(String[] args) {
        animal_30 animal1 = new animal_30();
        animal1.nombre = JOptionPane.showInputDialog("digite el nombre del animal");
        animal1.presentarse();
        cuenta_bancaria n1 = new cuenta_bancaria();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor para a pago : ");
        n1.pagoCuenta = entrada.nextLine();
        n1.CuentaBancaria();
    }
}

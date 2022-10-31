/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
public class Abstrak_Beli_Paypal {
    
    public static void main(String[] args){
        Paypal paymentMethod2 = new Paypal();
        paymentMethod2.setPaypal("morgan@gmail.com", "12345");
        paymentMethod2.deposit(300000);
        Pembeli morgan = new Pembeli();
        morgan.setPembeli("Morgan", paymentMethod2);
        morgan.beli("Poster Smash Full Color", 100000);
        System.out.println("Saldo Terakhir Rp."+paymentMethod2.cekSaldo());
        paymentMethod2.cekNamaPembayaran();
    }
}

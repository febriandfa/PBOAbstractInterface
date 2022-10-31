/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
public class Abstrak_Beli_BNI {
    
    public static void main(String[] args){
        DebitBNI paymentMethod1 = new DebitBNI();
        paymentMethod1.setBNI("12345");
        paymentMethod1.deposit(200000);
        Pembeli rahmat = new Pembeli();
        rahmat.setPembeli("Rahmat", paymentMethod1);
        rahmat.beli("Sepatu Dance", 100000);
        System.out.println("Saldo Terakhir Rp."+paymentMethod1.cekSaldo());
        paymentMethod1.cekNamaPembayaran();
    }
}

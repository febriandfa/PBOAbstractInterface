/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
abstract class PaymentMethod {
    public void cekNamaPembayaran() {
        System.out.println("Anda Melakukan Pembayaran Dengan "+getClass());
    }
    public abstract void kredit(int jumlah);
    public abstract void deposit(int jumlah);
    public abstract int cekSaldo();
}

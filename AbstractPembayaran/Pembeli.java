/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
class Pembeli {
    private String nama;
    private PaymentMethod payment;
    
    public void setPembeli(String nama, PaymentMethod payment){
        this.nama = nama;
        this.payment = payment;
    }
    
    public void beli(String nama, int harga){
        if(this.payment.cekSaldo() < harga){
            System.out.println("Uang Tidak Cukup");
        }else{
            this.payment.kredit(harga);
            System.out.println("Terima Kasih "+this.nama);
            System.out.println("Berhasil Beli "+nama+" Seharga Rp."+harga);
        }
    }
}

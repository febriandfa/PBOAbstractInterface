/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
class Paypal extends PaymentMethod {
    private int balance;
    private String email;
    
    public void setPaypal(String email, String password){
        if(email == "morgan@gmail.com" & password == "12345"){
            this.email = email;
            System.out.println("Berhasil Login ke Paypal!");
        }else{
            System.out.println("Akun Paypal Tidak Terdaftar");
        }
    }
    private void kirimNotifikasi(String pesan){
        System.out.println("Mengirim Email Notifikasi "+pesan+" ke "+this.email);
    }
    @Override
    public void kredit(int jumlah){
        this.kirimNotifikasi("Pengeluaran Dana");
        this.balance -= jumlah;
    }
    @Override
    public void deposit(int jumlah){
        this.kirimNotifikasi("Penerimaan Dana");
        this.balance += jumlah;
    }
    @Override
    public int cekSaldo(){
        return this.balance;
    }
}

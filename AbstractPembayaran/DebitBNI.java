/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.abstrak;

/**
 *
 * @author Asus
 */
class DebitBNI extends PaymentMethod {
    private int saldo;
    
    public void setBNI(String pin){
        if(pin == "12345"){
            System.out.println("Berhasil");
        }else{
            System.out.println("PIN Salah");
        }
    }
    private void catatTransaksi(String jenis, int jumlah){
        System.out.println("Mencatat Transaksi "+jenis+" Sejumlah Rp."+jumlah);
    }
    @Override
    public void kredit(int jumlah){
        this.catatTransaksi("Transfer Keluar", jumlah);
        this.saldo -= jumlah;
    }
    @Override
    public void deposit(int jumlah){
        this.catatTransaksi("Deposit Dana", jumlah);
        this.saldo += jumlah;
    }

    @Override
    public int cekSaldo(){
        return this.saldo;
    }
}

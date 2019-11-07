/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118047.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        this.nama = nama;
    }

    public void cetak(int jmlCetak, String nama) {
        this.jmlCetak = jmlCetak;
        this.nama = nama;
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        nama=input.nextLine();
        System.out.print("Mau cetak nama berapa kali? : ");
        jmlCetak=input.nextInt();
        System.out.println("Nama Anda : " + nama);
        System.out.println("Hasil Cetak : ");
        for (int i = 1 ; i <=jmlCetak; i++){
        System.out.println(i + ". " + nama);
        }
        
    }
    
    
    
}

package com.company;

import java.util.Scanner;

class Perpustakaan{
    String nama;
    String buku;
    String penerbit;

    Perpustakaan(String nama,String buku,String penerbit){
        this.nama=nama;
        this.buku=buku;
        this.penerbit=penerbit;
    }

    void tampil(){
        System.out.println("Nama Peminjam : " + this.nama);
        System.out.println("Nama Buku     : " + this.buku);
        System.out.println("Penerbit Buku : " + this.penerbit);
    }
}

public class Main {
    public static void main(String[] args) {
        String nama,buku,penerbit;
        int a, z = 0, menu = 0;
        Perpustakaan[] perpus = new Perpustakaan[1024];
        try (Scanner getstr = new Scanner(System.in)) {
            try (Scanner getint = new Scanner(System.in)) {
                while(menu!=3){
                    System.out.print("Menu:\n1.Input\n2.Output\n3.Exit\nPilihan : ");
                    menu = getint.nextInt();
                    if(menu == 1){
                        z++;
                        System.out.println("Masukkan data peminjaman buku");
                        System.out.print("Nama Peminjam : ");
                        nama=getstr.nextLine();
                        System.out.print("Nama Buku     : ");
                        buku=getstr.nextLine();
                        System.out.print("Penerbit Buku : ");
                        penerbit=getstr.nextLine();
                        perpus[z]=new Perpustakaan(nama,buku,penerbit);
                    }
                    else if(menu == 2){
                        if(z < 1){
                            System.out.println("Tidak ada data");
                        }
                        else{
                            a = 0;
                            while(a < z){
                                a++;
                                System.out.println("======"+a+"======");
                                perpus[a].tampil();
                                System.out.println("==============");
                            }
                        }
                    }
                    else if(menu == 3){
                        System.out.println("Keluar dari program");
                    }
                    else{
                        System.out.println("Pilih menu yang tersedia");
                    }
                }
            }
        }
    }
}

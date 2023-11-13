package function;

import java.util.Scanner;

public class programPDAM {
    //id pelanggan, nama pelanggan, jumlah tagihan, 
    //input id pelanggan, banyak pemakaian air dalam m3

    static void tampilNamaPelanggan(int id) {
        String namaPelanggan[] = {"Ali", "Budi", "Dani" ,"Edi"};
        System.out.println(namaPelanggan[id-1]);
    }

    static void hitungTarif(int jumlahPakai) {
        int harga = 0; 
        if(jumlahPakai >= 1 && jumlahPakai <= 10) {
            jumlahPakai = 10;
            harga = jumlahPakai * 2000;
        } else if (jumlahPakai >= 11 && jumlahPakai <= 20) {
            jumlahPakai = 10;
            harga = jumlahPakai * 3000;
        }
         else if (jumlahPakai >= 21 && jumlahPakai <= 30) {
            jumlahPakai = 10;
            harga = jumlahPakai * 4000;
        }
         else if (jumlahPakai >= 31) {
            jumlahPakai = 10;
            harga = jumlahPakai * 5000;
        }
        System.out.println(harga);
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       boolean status = true;
       
       do {
       System.out.print("Masukkan ID Pelanggan : ");
       int namaPelanggan = input.nextInt();
       System.out.println("ID Pelanggan : " + namaPelanggan);
       System.out.print("Nama Pelanggan : ");
       tampilNamaPelanggan(namaPelanggan);
       
       System.out.print("Masukkan Banyak Pemakaian Air : ");
       int jumlahPakai = input.nextInt();
       System.out.print("Jumlah Tarif : ");
       hitungTarif(jumlahPakai); 

       System.out.println("Ingin Coba Lagi ? Y/N");
       String ulang = input.next();
       if (ulang.equalsIgnoreCase("n")){
        status = false;
       } else {
        status = true;
       }
       } while (status);

input.close();
}
}
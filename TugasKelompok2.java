//import packages
import java.io.IOException;
import java.util.Scanner;
import java.lang.Exception;

public class TugasKelompok2 {
    static void process() {
        Scanner keyboard = new Scanner(System.in);
        String nama = "", nim = "";
        int sa; //INPUT ANGKA SEMBARANG
        int ct = 0, min = 1, max = 10;

        //INPUT & VALIDASI NAMA
        do {
            System.out.printf("Masukan Nama Anda [1...25] : ");
            try {
                nama = keyboard.nextLine();
                if(nama.length() < 1 || nama.length() > 25) {
                    throw new IOException("jumlah karakter tidak sesuai");
                }
            } catch(Exception err) {
                System.out.println("Nama harus terdiri dari 1 sampai 25 karakter");
            }
        } while (nama.length() < 1 || nama.length() > 25);

        //INPUT & VALIDASI NIM
        do {
            System.out.printf("Masukan NIM Anda [harus 10 Karakter] : ");
            try {
                nim = keyboard.nextLine();
                if(nim.length() != 10) {
                    throw new IOException("jumlah nim tidak sesuai");
                }
            } catch(Exception err) {
                System.out.println("NIM harus terdiri dari 10 karakter");
            }
        } while (nim.length() != 10);

        System.out.println();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        System.out.println();
        System.out.println("Registrasi Sukses..");
        System.out.println("Selamat Datang " + nama + " [NIM : " + nim + "].. ;D");
        System.out.println();
        System.out.println("Mari belajar macam-macam deret bilangan..");

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println();
        System.out.printf("Masukan Sembarang Angka [5..20] : ");
        sa = keyboard.nextInt();
        System.out.println();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println();
        System.out.println("Deret Bilangan");
        System.out.println("##############");

        // BILANGAN GENAP
        System.out.println();
        System.out.println(sa + " Bilangan Genap");

        //VARIABEL PENGHITUNGAN
        int angka = 1, jumlah = 0, totalP = 0;

        do {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
                totalP += angka;
                jumlah++;
            }
            angka++;

        } while (jumlah != sa);
        System.out.println();
        System.out.println("Hasil Penjumlahan = " + totalP);

        //BILANGAN GANJIL
        System.out.println();
        System.out.println();
        System.out.println(sa + " Bilangan Ganjil");
        int angkaL = 1,
                jumlahL = 0,
                totalL = 0;
        do {
            if (angkaL % 2 == 1) {
                System.out.print(angkaL + " ");
                totalL += angkaL;
                jumlahL++;
            }
            angkaL++;
        } while (jumlahL != sa);
        System.out.println();
        System.out.println("Hasil Penjumlahan = " + totalL);

        //BILANGAN FIBONACCI
        System.out.println();
        System.out.println();
        System.out.println(sa + " Bilangan Fibonacci");

        int totalF = 0,
                tot_prev = 0,
                bil1 = 0,
                bil2 = 1,
                bil_ulang = 0;

        do {
            tot_prev = bil1 + bil2;
            bil2 = bil1;
            bil1 = tot_prev;

            System.out.print(" " + tot_prev);
            bil_ulang++;
            totalF += tot_prev;
        } while (bil_ulang < sa);

        System.out.println();
        System.out.println("Hasil Penjumlahan = " + totalF);
        System.out.println();
    }
    public static void main(String[] args) {
        boolean ulang = true;
        String lagi = "";
        do {
            //FUNGSI REGIS DAN PENGHITUNGAN
            process();
            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Anda ingin mengulang [Y/N] : ");
            lagi = keyboard.nextLine();
            if (lagi.equals("t")) {
                System.out.println("Yah, kita belajar lagi lain kali ya!");
                ulang = false;
            }
        } while(ulang);
    }
}


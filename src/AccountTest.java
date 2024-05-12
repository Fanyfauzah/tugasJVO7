import Bank.CheckingAccount;
import Bank.*;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setNama("fany fauzah");
        myAccount.setSaldo(500.0);

        Scanner inputuser = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. penarikan");
        System.out.println("2. peminjaman");
        System.out.println("pilih 1-2");
        int menu = inputuser.nextInt();

        if (menu == 1) {
            System.out.println("Jumlah yang ingin ditarik:");
            System.out.println("A. 500.0");
            System.out.println("B. 700.0");
            System.out.println("C. 200.0");
            System.out.print("Pilih Opsi: ");
            char pilihan = inputuser.next().charAt(0);

            double jumlahPenarikan = 0.0;
            switch (pilihan) {
                case 'A':
                    jumlahPenarikan = 500.0;
                    break;
                case 'B':
                    jumlahPenarikan = 700.0;
                    break;
                case 'C':
                    jumlahPenarikan = 200.0;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            myAccount.penarikan(jumlahPenarikan);
            System.out.println("Saldo akhir: " + myAccount.getSaldo());

        } else if (menu == 2) {

            System.out.println("Ingin Melakukan Peminjaman (Ya/Tidak): ");
            String pilihanPeminjaman = inputuser.next();

            if (pilihanPeminjaman.equalsIgnoreCase("Ya")) {
                System.out.print("Masukkan Jumlah Pinjaman: ");
                double jumlahPinjaman = inputuser.nextDouble();
                System.out.println("Jangka Waktu Peminjaman:");
                int JangkaWaktu = inputuser.nextInt();
                Peminjaman pinjamanSaya = new Peminjaman(jumlahPinjaman, JangkaWaktu);
                pinjamanSaya.cetakDetailPinjaman();
            } else if (pilihanPeminjaman.equalsIgnoreCase("Tidak")) {
                System.out.println("LOG OUT");
            } else {
                System.out.println("Pilihan tidak valid");
            }
        } else {
            System.out.println("Pilihan Tidak Valid");
        }
    }
}



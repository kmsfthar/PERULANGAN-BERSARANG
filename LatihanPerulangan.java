package latihan.perulangan;
import java.util.Scanner;
public class LatihanPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaCrocs = 800000, hargaNike = 425000, hargaFlipper = 550000;
        double hargaAdidas = 2000000, hargaPuma = 1500000, hargaOrtuseight = 875000;
        double grandTotal = 0, total = 0, bayar, kembalian;
        double totalPemasukan = 0; 
        int pilih1, pilih2, pilih3 = 0, jumlah;

        do {
            System.out.print("\n================================");
            System.out.println("\nProgram Kasir");
            System.out.println("1. Aplikasi Kasir \n2. Aplikasi Admin \n3. Aplikasi Owner \n4. Exit");
            System.out.print("Pilih = ");
            pilih1 = sc.nextInt();

            switch (pilih1) {
                case 1: // Aplikasi Kasir
                    grandTotal = 0; // Reset grand total setiap kali masuk aplikasi kasir
                    do {
                        System.out.print("\n================================");
                        System.out.println("\nAplikasi Kasir");
                        System.out.println("1. Sandal \n2. Sepatu \n3. Selesai");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                do {
                                    System.out.print("\n================================");
                                    System.out.println("\nKatalog Sandal");
                                    System.out.println("1. Crocs  [ Rp " + hargaCrocs + " ]");
                                    System.out.println("2. Nike   [ Rp " + hargaNike + " ]");
                                    System.out.println("3. Flipper [ Rp " + hargaFlipper + " ]");
                                    System.out.println("4. Back");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("\nSandal Crocs [ Rp " + hargaCrocs + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaCrocs;
                                            grandTotal += total;
                                            break;

                                        case 2:
                                            System.out.println("\nSandal Nike [ Rp " + hargaNike + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaNike;
                                            grandTotal += total;
                                            break;

                                        case 3:
                                            System.out.println("\nSandal Flipper [ Rp " + hargaFlipper + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaFlipper;
                                            grandTotal += total;
                                            break;

                                        case 4:
                                            break;

                                        default:
                                            System.out.println("Pilihan tidak ditemukan");
                                            break;
                                    }
                                } while (pilih3 != 4);
                                break;

                            case 2:
                                do {
                                    System.out.print("\n================================");
                                    System.out.println("\nKatalog Sepatu");
                                    System.out.println("1. Adidas [ Rp " + hargaAdidas + " ]");
                                    System.out.println("2. Puma       [ Rp " + hargaPuma + " ]");
                                    System.out.println("3. Ortuseight    [ Rp " + hargaOrtuseight + " ]");
                                    System.out.println("4. Back");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("\nSepatu Adidas [ Rp " + hargaAdidas + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaAdidas;
                                            grandTotal += total;
                                            break;

                                        case 2:
                                            System.out.println("\nSepatu Puma [ Rp " + hargaPuma + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaPuma;
                                            grandTotal += total;
                                            break;

                                        case 3:
                                            System.out.println("\nSepatu Ortusreight [ Rp " + hargaOrtuseight + " ]");
                                            System.out.print("Jumlah beli = ");
                                            jumlah = sc.nextInt();
                                            total = jumlah * hargaOrtuseight;
                                            grandTotal += total;
                                            break;

                                        case 4:
                                            break;

                                        default:
                                            System.out.println("Pilihan tidak ditemukan");
                                            break;
                                    }
                                } while (pilih3 != 4);
                                break;

                            case 3:
                                System.out.println("\n================================");
                                System.out.println("Total Pembelian: Rp " + grandTotal);
                                System.out.print("Masukkan uang bayar: Rp ");
                                bayar = sc.nextDouble();

                                if (bayar >= grandTotal) {
                                    kembalian = bayar - grandTotal;
                                    System.out.println("Kembalian: Rp " + kembalian);
                                    totalPemasukan += grandTotal; // Tambahkan transaksi ke pemasukan
                                } else {
                                    System.out.println("Uang tidak cukup. Transaksi dibatalkan.");
                                }
                                break;

                            default:
                                System.out.println("Pilihan tidak ditemukan");
                                break;
                        }
                    } while (pilih2 != 3);
                    break;

                case 2: // Aplikasi Admin
                    do {
                        System.out.print("\n================================");
                        System.out.println("\nAplikasi Admin");
                        System.out.println("1. Sandal \n2. Sepatu \n3. Selesai");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                do {
                                    System.out.print("\n================================");
                                    System.out.println("\nUbah Harga Sandal");
                                    System.out.println("1. Crocs  [ Rp " + hargaCrocs + " ]");
                                    System.out.println("2. Nike   [ Rp " + hargaNike + " ]");
                                    System.out.println("3. Adidas [ Rp " + hargaFlipper + " ]");
                                    System.out.println("4. Back");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.print("Masukkan harga baru untuk Crocs: ");
                                            hargaCrocs = sc.nextDouble();
                                            break;

                                        case 2:
                                            System.out.print("Masukkan harga baru untuk Nike: ");
                                            hargaNike = sc.nextDouble();
                                            break;

                                        case 3:
                                            System.out.print("Masukkan harga baru untuk Flipper: ");
                                            hargaFlipper = sc.nextDouble();
                                            break;

                                        case 4:
                                            break;

                                        default:
                                            System.out.println("Pilihan tidak ditemukan");
                                            break;
                                    }
                                } while (pilih3 != 4);
                                break;

                            case 2:
                                do {
                                    System.out.print("\n================================");
                                    System.out.println("\nUbah Harga Sepatu");
                                    System.out.println("1. Adidas [ Rp " + hargaAdidas + " ]");
                                    System.out.println("2. Puma       [ Rp " + hargaPuma + " ]");
                                    System.out.println("3. Ortuseight    [ Rp " + hargaOrtuseight + " ]");
                                    System.out.println("4. Back");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.print("Masukkan harga baru untuk New Balance: ");
                                            hargaAdidas = sc.nextDouble();
                                            break;

                                        case 2:
                                            System.out.print("Masukkan harga baru untuk Asics: ");
                                            hargaPuma = sc.nextDouble();
                                            break;

                                        case 3:
                                            System.out.print("Masukkan harga baru untuk Converse: ");
                                            hargaOrtuseight = sc.nextDouble();
                                            break;

                                        case 4:
                                            break;

                                        default:
                                            System.out.println("Pilihan tidak ditemukan");
                                            break;
                                    }
                                } while (pilih3 != 4);
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Pilihan tidak ditemukan");
                                break;
                        }
                    } while (pilih2 != 3);
                    break;

                case 3: // Aplikasi Owner
                    System.out.print("\n================================");
                    System.out.println("\nAplikasi Owner");
                    System.out.println("Total Semua Pemasukan: Rp " + totalPemasukan);
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }
        } while(pilih1 != 4);
    }
    
}

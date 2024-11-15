import java.util.Scanner;

public class Tugas2_13 {
    static Scanner scanner = new Scanner(System.in);
    static String pilih;
    static int[][] nilai;
    static String[] hari;
    static String[] namaMahasiswa;

    public static void menu() {
        System.out.println("Menu");
        System.out.println("==========================================================");
        System.out.println("A. Menginputkan Data Nilai Mahasiswa");
        System.out.println("B. Menampilkan Seluruh Nilai Mahasiswa");
        System.out.println("C. Mencari Hari ke Berapa Terdapat Nilai Tertinggi");
        System.out.println("D. Menampilkan Mahasiswa yang Memiliki Nilai Tertinggi");
        System.out.print("Masukkan Menu [A/B/C/D]: ");
        pilih = scanner.next();
    }

    public static void inisialisasiData() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = scanner.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        hari = new String[jumlahMinggu];
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
        }

        for (int i = 0; i < jumlahMinggu; i++) {
            hari[i] = "Minggu ke " + (i + 1);
        }
    }

    public static void masukkanNilai() {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                System.out.printf("Masukkan Nilai %s pada %s: ", namaMahasiswa[i], hari[j]);
                nilai[i][j] = scanner.nextInt();
            }
            System.out.println("----------------------------------------");
        }
    }

    public static void tampil() {
        if (nilai[0][0] == 0) {
            System.out.println("Masukkan Nilai Mahasiswa Dahulu");
        } else {
            System.out.print("\t\t");
            for (String h : hari) {
                System.out.print(h + "\t");
            }
            System.out.println();
            for (int i = 0; i < namaMahasiswa.length; i++) {
                System.out.print(namaMahasiswa[i] + "\t\t");
                for (int j = 0; j < hari.length; j++) {
                    System.out.print(nilai[i][j] + "\t\t");
                }
                System.out.println();
            }
        }
    }

    public static void hari() {
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mingguTertinggi = 0;

        for (int j = 0; j < hari.length; j++) {
            for (int i = 0; i < namaMahasiswa.length; i++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguTertinggi = j;
                }
            }
        }
        System.out.println("Nilai tertinggi terdapat pada " + hari[mingguTertinggi]);
    }

    public static void nilaiTertinggi() {
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j;
                }
            }
        }
        System.out.println("Nilai tertinggi didapat oleh: " + namaMahasiswa[mahasiswaTertinggi] +
                " pada " + hari[mingguTertinggi] + " dengan nilai " + nilaiTertinggi);
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di program penilaian mahasiswa!");
        inisialisasiData();

        char ulang = 'y';
        while (ulang == 'y' || ulang == 'Y') {
            menu();
            switch (pilih) {
                case "A":
                    masukkanNilai();
                    break;
                case "B":
                    tampil();
                    break;
                case "C":
                    hari();
                    break;
                case "D":
                    nilaiTertinggi();
                    break;
                default:
                    System.out.println("Menu yang Anda masukkan salah!");
                    break;
            }
            System.out.print("Ingin memilih menu lain (y/n)? ");
            ulang = scanner.next().charAt(0);
        }
        System.out.println("Terima kasih...");
    }
}

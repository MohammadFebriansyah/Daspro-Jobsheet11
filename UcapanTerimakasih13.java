import java.util.Scanner;
public class UcapanTerimakasih13 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String nama0rang = sc.nextLine();
        return nama0rang;
    }
     public static String UcapanTambahan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ucapan Tambahan: ");
        String ucapanTambahan = sc.nextLine();
        sc.close();
        return ucapanTambahan;
    }

    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +
        "you inspired in me a love for learning and made me feel like I could ask you anything.");
        System.out.println(tambahan);
    
    }
       public static void main(String[] args) {
        UcapanTerimakasih();
    }
}

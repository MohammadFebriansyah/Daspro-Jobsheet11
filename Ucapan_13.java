import java.util.Scanner;
public class Ucapan_13 {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Percobaan");
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String nama0rang = sc.nextLine();
        sc.close();
        return nama0rang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
}

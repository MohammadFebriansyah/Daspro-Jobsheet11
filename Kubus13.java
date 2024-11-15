import java.util.Scanner;
public class Kubus13 {
    static int volumeKubus (int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int luasPermukaan (int sisi){
        int luas = 6*sisi*sisi;
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, vol, luas;

        System.out.print("Masukkan sisi: ");
        s = sc.nextInt();

        vol = volumeKubus(s);
        System.out.println("Volume Kubus adalah "+vol);

        luas = luasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah "+luas);

        sc.close();
    }
}

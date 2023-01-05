//1 'den N 'e Kadar Olan Sayilarin Kare Toplamini Yazzdıran Method.
package ocak_11_odev;

import java.util.Scanner;

public class n_e_kadar_kare_toplami {

    //Dışarıya işlem değeri döndürmeyeceği için void kullandık.
    public static void hesapla(int sayi) {
        //Toplam Belirledik
        int toplam = 0;

        //N' e Kadar Olan Sayilarin karesini Toplattık.
        for (int i = 1; i <= sayi; i++) {

            toplam += Math.pow(i, 2);
        }
        //Toplami Ekrana Yazdırdık.
        System.out.println("1 'den N 'e kadar Olan Sayilarin Kare Toplami :" + toplam);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanicidan N Sayisini Aldik.
        System.out.println("Lutfen N Sayisini Giriniz :");
        int sayi = input.nextInt();

        //Methodumuzu Çağırdık.
        hesapla(sayi);

    }
}

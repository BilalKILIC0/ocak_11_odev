//2 boyutlu bir dizinin elemanlarını alt sınırı ve üstü sınırı arasında rastgele sayı atayıp döndür.
package ocak_11_odev;

import java.util.Random;
import java.util.Scanner;

public class iki_boyutlu_dizi_alt_ust_sinir {

    public static void rastgele(int dizi[][], int uzunluk, int alt_sinir, int ust_sinir) {

        //Random Sınıfını Tanımladık
        Random rd = new Random();

        //Alt Ve Üst Sınıra Göre Dizi Elemanlarını Oluşturduk.
        for (int i = 0; i < uzunluk; i++) {

            for (int j = 0; j < uzunluk; j++) {

                dizi[i][j] = rd.nextInt(ust_sinir - alt_sinir) + alt_sinir;
            }
        }

        System.out.println("\nDizi Elemanlari\n");

        //Dizi Elemanlarını Ekrana Yazdırdık.
        for (int i = 0; i < uzunluk; i++) {

            for (int j = 0; j < uzunluk; j++) {

                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Dizi Uzunluğunu Aldık.
        System.out.println("Lutfen Dizi Uzunlugunu Giriniz :");
        int uzunluk = input.nextInt();

        //Kullanıcıdan Alt Sınırı Aldık.
        System.out.println("Lutfen Alt Sinir Eleman Sayisini Giriniz :");
        int alt_sinir = input.nextInt();

        //Kullanıcıdan Üst Sınırı Aldık.
        System.out.println("Lutfen Ust Sinir Eleman Sayisini Giriniz :");
        int ust_sinir = input.nextInt();

        //Diziyi Tanımladık.
        int arr[][] = new int[uzunluk][uzunluk];

        //Method 'u çağırdık.
        rastgele(arr, uzunluk, alt_sinir, ust_sinir);

    }
}

//2 boyutlu dizilerin toplamını bir dizi olarak döndüren metot.
package ocak_11_odev;

import java.util.Scanner;

public class iki_boyutlu_dizi_toplami {

    public static void topla(int dizi[][], int toplam[], int uzunluk) {

        Scanner input = new Scanner(System.in);

        int top;

        //İki Boyutlu Dizi Elemanlarini Kullanıcıdan Aldık.
        for (int i = 0; i < uzunluk; i++) {

            for (int j = 0; j < uzunluk; j++) {

                System.out.print("Dizinin (" + i + "," + j + ") .Elemanini Giriniz :");
                dizi[i][j] = input.nextInt();
            }
        }

        //Her Satır Elemanlarını Toplayıp Toplam Dizisine Ekledik.
        for (int i = 0; i < uzunluk; i++) {

            top = 0;
            for (int j = 0; j < uzunluk; j++) {

                top += dizi[i][j];
            }
            toplam[i] = top;
        }

        System.out.println("\nToplam Dizisi Elemanlari\n");

        //Toplam Dizisini Ekrana Yazdırdık.
        for (int i = 0; i < uzunluk; i++) {

            System.out.print(toplam[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Dizi Uzunluğunu Kullanıcıdan Aldık.
        System.out.println("Dizi Uzunlugunu Giriniz :");
        int uzunluk = input.nextInt();

        //Bir Tane İki Boyutlu, Bir Tane Tek Boyutlu Dizi Tanımladık.
        int arr[][] = new int[uzunluk][uzunluk];
        int toplam[] = new int[uzunluk];

        //Method 'u Çağırdık.
        topla(arr, toplam, uzunluk);
    }
}

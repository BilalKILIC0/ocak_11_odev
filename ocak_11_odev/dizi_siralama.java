//Bir diziyi küçükten büyüğe doğru sıralayıp döndüren metot.
package ocak_11_odev;

import java.util.Scanner;

public class dizi_siralama {

    public static void sirala(int dizi[], int uzunluk) {

        Scanner input = new Scanner(System.in);

        int temp;

        //Dizi Elemanlarını Kullanıcıdan Aldık.
        for (int i = 0; i < uzunluk; i++) {

            System.out.print("Dizinin " + (i + 1) + " .ELemaini Giriniz :");
            dizi[i] = input.nextInt();
        }
        System.out.print("\nDizi Elemanlari\n");

        //Dizi Elemanlarını Yazdırdık.
        for (int i = 0; i < uzunluk; i++) {

            if (i == uzunluk - 1) {

                System.out.print(dizi[i] + ".");
            } else {
                System.out.print(dizi[i] + ",");
            }
        }
        System.out.println();
        System.out.println("\nKucukten Buyuge Sirali Dizi Elemanlari\n");

        //Dizi Elemanlarını Küçükten Büyüğe Doğru Sıraladık.
        for (int i = 0; i < uzunluk; i++) {

            for (int j = i + 1; j < uzunluk; j++) {

                if (dizi[i] > dizi[j]) {

                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;

                }
            }
        }

        //Sıralanmış Dizi Elemanalarını Yazdırdık.
        for (int i = 0; i < uzunluk; i++) {

            if (i == uzunluk - 1) {

                System.out.print(dizi[i] + ".");
            } else {
                System.out.print(dizi[i] + ",");
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Dizi uzunluğunu Aldık
        System.out.println("Lutfen Dizi Uzunlugu Giriniz :");
        int uzunluk = input.nextInt();

        //Diziyi Tanımladık
        int arr[] = new int[uzunluk];

        //Fonksiyonu Çağırdık
        sirala(arr, uzunluk);
    }
}

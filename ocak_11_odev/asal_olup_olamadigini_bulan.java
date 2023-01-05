package ocak_11_odev;

import java.util.Scanner;

public class asal_olup_olamadigini_bulan {

    public static void asal_mi(int sayi) {

        int sayac = 0;

        if (sayi != 1) {

            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {

                    sayac++;
                }
            }
            if (sayac == 0) {

                System.out.println(sayi + " Sayisi Asal Sayidir.");
            } else {
                System.out.println(sayi + " Sayisi Asal Degildir.");
            }
        }
        if (sayi == 1) {

            System.out.println(sayi + " Sayisi Asal Degildir.");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Pozitif Bir Tam Sayi Giriniz :");
        int sayi = input.nextInt();

        asal_mi(sayi);

    }
}

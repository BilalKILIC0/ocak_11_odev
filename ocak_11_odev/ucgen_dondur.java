// Dışarıdan alınan n değerine göre yıldızlarla üçgen oluşturma.
package ocak_11_odev;

import java.util.Scanner;

public class ucgen_dondur {

    public static void yildiz(int n) {

        //Yıldızı Yazdırdık.
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan N Değerini Aldık.
        System.out.println("Lutfen N Degerini Giriniz :");
        int n = input.nextInt();

        //Method 'u Çağırdık.
        yildiz(n);
    }
}

import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkartma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        if (b == 0) {
            return 0;
        }
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <=b; i++) {
            result *=a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çeresi : " + (2 * (a + b)));
        System.out.println("Alanı : "+ (a*b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1 - Toplama İşlemi\n2 - Çıkarma İşlemi\n3 - Çarpma İşlemi\n4 - Bölme İşlemi\n5 - Üslü Sayı Hesaplama\n6 - Mod Alma\n7 - Dikdörtgen Alan ve Çevre Hesabı\n0 - Çıkış Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = inp.nextInt();
            if (select == 0) break;
            System.out.print("Bir sayi giriniz: ");
            int a = inp.nextInt();
            System.out.print("Bir sayi giriniz: ");
            int b = inp.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("İkinci sayı 0 dan farklı olmalı!");
                    }
                    break;
                case 5:
                    System.out.println("Üs hesabı : "+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : "+ mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!!");
            }
        }
        System.out.println("Güle Güle!!!");


    }
}
import  java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayiyi giriniz : ");
        n1 = inp.nextInt();
        System.out.print("2. Sayiyi giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-) Toplama\n2-) Cikarma\n3-) Carpma\n4-) Bolme");
        System.out.print("Seciminiz : ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuc : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                else {
                    System.out.println("Sonuc : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatali giris yaptiniz!");
        }
    }
}


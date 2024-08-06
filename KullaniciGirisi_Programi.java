import java.util.Scanner;

public class KullaniciGirisi_Programi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı ismini oluştunuruz : ");
        String kullanici_ismi = scanner.nextLine();
        System.out.print("lütfen şifrenizi oluşturunuz : ");
        String sifre = scanner.nextLine();

        int deneme_hakki = 5;
        String girilen_kullanici_ismi = "";
        String girilen_kullanici_sifresi = "";
        String yeni_kullanici_ismi = "";
        String yeni_sifre = "";
        String evet = "";

        int a = 0;
        while (true) {
            if (deneme_hakki != 0) {

                System.out.print("lütfen kullanici isminizi giriniz : ");
                girilen_kullanici_ismi = scanner.nextLine();
                System.out.print("lütfen şifreinizi giriniz : ");
                girilen_kullanici_sifresi = scanner.nextLine();
            }

            if (kullanici_ismi.equals(girilen_kullanici_ismi) && sifre.equals(girilen_kullanici_sifresi)&&a==0) {
                System.out.println("giris basarili");
                System.out.println("hosgeldiniz");
                break;
            }

            if ((!kullanici_ismi.equals(girilen_kullanici_ismi) || !sifre.equals(girilen_kullanici_sifresi))
                    && deneme_hakki >0) {
                System.out.println("kullanici adi veya sifre yanliş tekrar deneyiniz");
                deneme_hakki--;

            }
            if (!girilen_kullanici_ismi.equals(yeni_kullanici_ismi) && !girilen_kullanici_sifresi.equals(yeni_sifre)) {
               if(deneme_hakki!=0){
                System.out.println("kalan deneme hakki : " + deneme_hakki);
            }
        }
            if (deneme_hakki == 0) {
                System.out.println("giris hakkiniz bitmistir. Sifreyi yenilemek ister misiniz? (evet/hayir) ");
                evet = scanner.nextLine();
            }
            if (!evet.equals("evet") && !evet.equals("hayir") && deneme_hakki == 0) {
                System.out.println("geçersiz işlem tekrar deneyiniz");
            }
            if (evet.equals("hayir") && deneme_hakki == 0) {
                System.out.println("çikiş yapiliyor...");
                break;
            }

            while ((evet.equalsIgnoreCase("evet") && !evet.equalsIgnoreCase("hayir")) && deneme_hakki == 0) {

                if (evet.equalsIgnoreCase("evet") && deneme_hakki == 0) {
                    System.out.print("lütfen yeni Kullanici ismini oluştunuruz : ");
                    yeni_kullanici_ismi = scanner.nextLine();
                    System.out.print("lütfen yeni şifrenizi oluşturunuz : ");
                    yeni_sifre = scanner.nextLine();
                    System.out.println("kullanici ismi ve şifre güncellendi");
                    deneme_hakki = 5;
                    a++;
                    if (!evet.equals("evet")) {
                        System.out.println("giriş yapilmasdi...");

                    }
                }
            }
            if (girilen_kullanici_ismi.equals(yeni_kullanici_ismi) && girilen_kullanici_sifresi.equals(yeni_sifre)) {
                System.out.println("giriş başarili \n hoşgeldiniz...");

            }
        }
        scanner.close();
    }
}

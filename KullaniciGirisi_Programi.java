import java.util.Scanner;

public class KullaniciGirisi_Programi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı ismini oluştunuruz : ");
        String kullanici_ismi = scanner.nextLine();
        System.out.print("lütfen şifrenizi oluşturunuz : ");
        String sifre = scanner.nextLine();
       
        int deneme_hakki=5;
        String girilen_kullanici_ismi="";
        String girilen_kullanici_sifresi="";
        String yeni_kullanici_ismi="";
        String yeni_sifre="";
        String evet="";
        int a=0;
        while(true){
          if(deneme_hakki!=0){
            System.out.print("lütfen kullanıcı isminizi giriniz : ");
            girilen_kullanici_ismi = scanner.nextLine();
            System.out.print("lütfen şifreinizi giriniz : ");
          girilen_kullanici_sifresi = scanner.nextLine();
          }
        
        if (kullanici_ismi.equals(girilen_kullanici_ismi) && sifre.equals(girilen_kullanici_sifresi)&&a==0) {
            System.out.println("giris basarili");
            System.out.println("hosgeldiniz");
            break;
        } else {
            System.out.println("kullanici adi veya sifre yanlış tekrar deneyiniz");
        }
     
        if(deneme_hakki>0){
            deneme_hakki--;
        }
        System.out.println("kalan deneme hakki : " +deneme_hakki);
     if(deneme_hakki==0){
            System.out.println("giris hakkınız bitmistir. Sifreyi yenilemek ister misiniz? ");
            evet=scanner.nextLine();
        }
        if(evet.equalsIgnoreCase("evet")&& deneme_hakki==0){
            System.out.print("lütfen yeni Kullanıcı ismini oluştunuruz : ");
            yeni_kullanici_ismi = scanner.nextLine();
            System.out.print("lütfen yeni şifrenizi oluşturunuz : ");
             yeni_sifre = scanner.nextLine();
             System.out.println("kullanıcı ismi ve şifre güncellendi");
             deneme_hakki=5;
            a=1;
        }        
    else if(girilen_kullanici_ismi.equals(yeni_kullanici_ismi)&&girilen_kullanici_sifresi.equals(yeni_sifre)){
        System.out.println("giriş başarılı \n hoşgeldiniz...");
        break;
        
     }
        }

    }
    }


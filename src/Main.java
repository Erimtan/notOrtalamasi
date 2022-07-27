import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat,fzk,kmy,trk,trh,mzk;

        //Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fzk = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kmy = inp.nextInt();

        System.out.print("Turkce notunuz: ");
        trk = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        trh = inp.nextInt();

        System.out.print("Muzik notunuz: ");
        mzk = inp.nextInt();

        int toplam = (mat + fzk + kmy + trk + trh + mzk);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz: " + sonuc);

        boolean kosul1 = sonuc >= 60;
        String kosul2 = kosul1 ? "Sinifi Gecti!" : "Sinifta Kaldi!";
        System.out.println(kosul2);
    }
}

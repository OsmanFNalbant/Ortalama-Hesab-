import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int mat, fiz, kim, tr, tar, muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:\n");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz:\n");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz:\n");
        kim = input.nextInt();

        System.out.print("Turkce Notunuz:\n");
        tr = input.nextInt();

        System.out.print("Tarih Notunuz:\n");
        tar = input.nextInt();

        System.out.print("Muzik Notunuz:\n");
        muz = input.nextInt();

        int toplam = mat + fiz + kim + tr + tar + muz;
        double ort = toplam / 6;
        System.out.println("Ortalamanız:" +ort);
        String sonuc = ort >60 ? "Gectiniz" : "Gecemediniz";
        System.out.print(" "+sonuc);
    }
}
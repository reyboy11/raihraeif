import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir (tahun-bulan-tanggal): ");
        String tglLahir = input.nextLine();

        LocalDate tanggalLahir = LocalDate.parse(tglLahir);
        LocalDate sekarang = LocalDate.now();


//        Output
        System.out.println("\n\nNama : " + nama);
        Period umur = Period.between(tanggalLahir, sekarang);
        System.out.println("Umur anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan");

    }
}
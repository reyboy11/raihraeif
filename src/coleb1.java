import java.util.*;
import java.time.*;
import java.time.format.*;

public class coleb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'L') ? "laki-laki" : ((jenisKelamin == 'P') ? "perempuan" : "Tidak valid");

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        // Menghitung umur menggunakan java.time
        LocalDate tanggalLahir = null;
        try {
            tanggalLahir = LocalDate.parse(tanggalLahirStr, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e) {
            System.out.println("Format tanggal salah. Harap masukkan tanggal dengan format yyyy-MM-dd.");
            return;
        }
        LocalDate tanggalSekarang = LocalDate.now();
        int umur = tanggalSekarang.getYear() - tanggalLahir.getYear();

        // Output data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen05[] daftarDosen = new Dosen05[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
            Boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen05(kode, nama, jenisKelamin, usia);
        }

        DataDosen data = new DataDosen();

        data.dataSemuaDosen(daftarDosen);
        data.jumlahDosenPerJenisKelamin(daftarDosen);
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        data.infoDosenPalingTua(daftarDosen);
        data.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}
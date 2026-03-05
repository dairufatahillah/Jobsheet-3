public class DataDosen {

    void dataSemuaDosen(Dosen05[] arrayofDosen) {
        System.out.println("\nData Semua Dosen");
        for (Dosen05 d : arrayofDosen) {
            d.tampil();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen05[] arrayofDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen05 d : arrayofDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Sesuai Jenis Kelamin");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayofDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen05 d : arrayofDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("\nRata - rata Usia Dosen");
        if (jmlPria > 0)
            System.out.println("Rata-rata usia Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata usia Wanita : " + (totalWanita / jmlWanita));
    }

    void infoDosenPalingTua(Dosen05[] arrayofDosen) {
        Dosen05 tertua = arrayofDosen[0];

        for (Dosen05 d : arrayofDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nDosen Paling Tua");
        tertua.tampil();
    }

    void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        Dosen05 termuda = arrayOfDosen[0];

        for (Dosen05 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nDosen Paling Muda");
        termuda.tampil();
    }
}

import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : program ini berisi program yang dapat memilah bilangan yang paling besar dan kecil  
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BesarKecil nilai = new BesarKecil();
        String Petugas;
        int jmlMhs;

        Scanner masuk = new Scanner(System.in);

        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas\t\t\t: ");
        Petugas = masuk.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t: ");
        jmlMhs = masuk.nextInt();
        System.out.println();
        
        nilai.input(jmlMhs);
        System.out.println();
        nilai.tampil(jmlMhs);
        
        nilai.tentuBesarKecil(jmlMhs);
        
        System.out.printf("%nNilai terbesar adalah : %.1f%n",nilai.max);
        System.out.printf("Nilai terkecil adalah : %.1f%n",nilai.min);
        System.out.printf("%nPetugas\t: %s%n",Petugas);
    }

}

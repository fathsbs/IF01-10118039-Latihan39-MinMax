
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : program ini berisi program yang dapat memilah bilangan yang paling besar dan kecil  
 */
/**
 *
 * @author Fatahillah Seno
 */
public class BesarKecil {

    Scanner masuk = new Scanner(System.in);

    int jmlMhs;
    int nilai[] = new int[99];
    double max, min;

    public void input(int jmlMhs) {

        for (int i = 0; i <= (jmlMhs - 1); i++) {

            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilai[i] = masuk.nextInt();

        }

    }

    public void tampil(int jmlMhs) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 0; i <= jmlMhs - 1; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
        }
    }

    public void tentuBesarKecil(int jmlMhs) {
        int i = 0;
        max = nilai[i];
        min = nilai[i];
        for (i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
            
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5pbo;
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batasAwal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batasAkhir: ");
        int batasAkhir = scanner.nextInt();
        String hasil = deretGenap(batasAwal, batasAkhir);
        System.out.println("Jumlah deret bilangan genap: " + hasil);
    }

    static String deretGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        StringBuilder deretGenap = new StringBuilder();
        if (batasAwal > batasAkhir) {
            int temp = batasAwal;
            batasAwal = batasAkhir;
            batasAkhir = temp;
        }
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah++;
                deretGenap.append(i);
                if (jumlah < (batasAkhir - batasAwal + 1) / 2) {
                    deretGenap.append(", ");
                }
            }
        }

        return jumlah + " yaitu " + deretGenap.toString();
    }
}
